package data;

import dao.UserDTO;

public class Status {

	/*private String name;
	private String surname;
	private Date dateOfBirth;
	private String nationality;
	private String codiceFiscale;
	private String userType;
	*/
	UserDTO userData;

	public Status(UserDTO userData) {
		this.userData = userData;
	}
	
	public UserDTO getUserData() {
		return userData;
	}
	
	/*public Status(String name, String surname, Date dateOfBirth, String nationality, String codiceFiscale,
			String userType) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		this.codiceFiscale = codiceFiscale;
		this.userType = userType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	*/
	

}
