package controller;

import java.net.URL;
import java.util.ResourceBundle;

import data.Status;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerMyData extends Controller {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	/*@FXML
	private Label myCodiceFiscale;

	@FXML
	private Label myDateOfBirth;

	@FXML
	private Label myName;

	@FXML
	private Label myNationality;

	@FXML
	private Label mySurname;

	@FXML
	private Label myUserType;*/

	@FXML
	void initialize() {
		/*assert myCodiceFiscale != null : "fx:id=\"myCodiceFiscale\" was not injected: check your FXML file 'myData.fxml'.";
		assert myDateOfBirth != null : "fx:id=\"myDateOfBirth\" was not injected: check your FXML file 'myData.fxml'.";
		assert myName != null : "fx:id=\"myName\" was not injected: check your FXML file 'myData.fxml'.";
		assert myNationality != null : "fx:id=\"myNationality\" was not injected: check your FXML file 'myData.fxml'.";
		assert mySurname != null : "fx:id=\"mySurname\" was not injected: check your FXML file 'myData.fxml'.";
		assert myUserType != null : "fx:id=\"myUserType\" was not injected: check your FXML file 'myData.fxml'.";
*/
	}
/*
	@Override
	public void initData() {
		Status myStatus = super.getStato();
		myName.setText(myStatus.getName());
		mySurname.setText(myStatus.getSurname());
		myDateOfBirth.setText(myStatus.getDateOfBirth());
		myNationality.setText(myStatus.getNationality());
		myCodiceFiscale.setText(myStatus.getCodiceFiscale());
		myUserType.setText(myStatus.getUserType());
	}*/

}
