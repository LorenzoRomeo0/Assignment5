package dao;

import java.math.BigDecimal;
import java.sql.Date;

public class UserDTO {
	private BigDecimal USERID;
	private String username;
	private Date birthDate;
	private String country;
	private String comune;
	private String codiceFiscale;
	private String userType;
	
	public UserDTO(BigDecimal USERID, String username, Date birthDate, String country, String comune, String codiceFiscale, String userType){
		this.USERID = USERID;
		this.username = username;
		this.birthDate = birthDate;
		this.country = country;
		this.comune = comune;
		this.codiceFiscale = codiceFiscale;
		this.userType = userType;
	}

	
	public BigDecimal getUSERID() {
		return USERID;
	}

	public String getUsername() {
		return username;
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
	
	public String getUserType() {
		return userType;
	}
	
	@Override
	public String toString() {
		return "UserDTO [USERID=" + USERID + ", username=" + username 
				+ ", birthDate=" + birthDate + ", country=" + country + ", comune=" + comune + ", codiceFiscale="
				+ codiceFiscale + ", userType= "+userType +"]";
	}

}