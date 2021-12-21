package dao;

import java.sql.Statement;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.google.common.hash.Hashing;

public class UserDAOImpl implements UserDAO{
	
	private ArrayList<UserDTO> users;
	private Connection conn;
	
	public UserDAOImpl() {
		conn = connect();
	}
	
	private Connection connect() {
		String url = "jdbc:mysql://localhost:3306/voto_elettronico";
	    String username = "INGSW";
	    String password = "ProgettoINGSW";
	    Connection connection = null;
	    try {
	    	System.out.println("Connecting database...");
	        connection = DriverManager.getConnection(url, username, password);
	        System.out.println("Database connected!");
	    } catch (SQLException e) {
	           System.err.println("Cannot connect the database!");
	           e.printStackTrace();
	       }
	       return connection;
	}
	
	public UserDTO getUser(String username) {
		String sql = "SELECT * FROM users WHERE username = ?";
		try {
			PreparedStatement s = conn.prepareStatement(sql);
			s.setString(1, username);
			ResultSet result = s.executeQuery();
			if(result.next()) {
				BigDecimal USERID = result.getBigDecimal("USERID");
				String username1 = result.getString("username");
				String password = result.getString("password");
				byte[] salt = result.getBytes("salt");
				Date birthDate = result.getDate("birthDate");
				String country = result.getString("country");
				String comune = result.getString("comune");
				String codiceFiscale = result.getString("codiceFiscale");
				UserDTO userDTO = new UserDTO(USERID, username, password, salt, birthDate, country, comune, codiceFiscale);
				return userDTO;
			}
		}catch(Exception e) {e.printStackTrace();}
		return null;
	}
	
	public ArrayList<UserDTO> getAllUsers(){
		update();
		return users;
	}
	
	public void update() {
		String sql = "SELECT * FROM users";
		users = new ArrayList<UserDTO>();
		try {
			Statement s = conn.createStatement();
			ResultSet result = s.executeQuery(sql);
			while(result.next()) {
				BigDecimal USERID = result.getBigDecimal("USERID");
				String username = result.getString("username");
				String password = result.getString("password");
				byte salt[] = result.getBytes("salt");
				Date birthDate = result.getDate("birthDate");
				String country = result.getString("country");
				String comune = result.getString("comune");
				String codiceFiscale = result.getString("codiceFiscale");
				users.add(new UserDTO(USERID, username, password, salt, birthDate, country, comune, codiceFiscale));
			}
			
			//TODO: cambia bit in Byte su tabella sql
		}catch(Exception e) {e.printStackTrace();}
		
	}
	
	private String computeHash(String password, byte salt) {
		password = Hashing.sha256()
    	        .hashString(password, StandardCharsets.UTF_8)
    	        .toString();
		password += salt+"";
		password = Hashing.sha256()
    	        .hashString(password, StandardCharsets.UTF_8)
    	        .toString();
		return password;
	}
	
	
}
