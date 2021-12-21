package dao;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;

public class UserDTO {
	private BigDecimal USERID;
	private String username;
	private String password;
	private byte[] salt;
	private Date birthDate;
	private String country;
	private String comune;
	private String codiceFiscale;
	
	public UserDTO(BigDecimal USERID, String username, String password, byte[] salt, Date birthDate, String country, String comune, String codiceFiscale){
		this.USERID = USERID;
		this.username = username;
		this.password = password;
		this.salt = salt;
		this.birthDate = birthDate;
		this.country = country;
		this.comune = comune;
		this.codiceFiscale = codiceFiscale;
	}

	
	public BigDecimal getUSERID() {
		return USERID;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public byte[] getSalt() {
		return salt;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getCountry() {
		return country;
	}

	public String getComune() {
		return comune;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	@Override
	public String toString() {
		return "UserDTO [USERID=" + USERID + ", username=" + username + ", password=" + password + ", salt=" + Arrays.toString(salt)
				+ ", birthDate=" + birthDate + ", country=" + country + ", comune=" + comune + ", codiceFiscale="
				+ codiceFiscale + "]";
	}

}
