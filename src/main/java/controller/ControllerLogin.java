package controller;

import java.io.IOException;
//import java.math.BigDecimal;
import java.net.URL;
//import java.sql.Date;
import java.util.ResourceBundle;


import dao.UserDAO;
import dao.UserDAOImpl;
//import dao.UserDTO;
import data.Status;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ControllerLogin extends Controller{

	private UserDAO userDAO;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label error;

    @FXML
    private PasswordField myPassword;

    @FXML
    private TextField myUsername;

    @FXML
    void onLogin(ActionEvent event) {
    	login();
    }

    private void startMain() {
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../main.fxml"));
			Parent root = loader.load();
			Controller controller = loader.getController();
			
			controller.setStage(getStage());
			controller.initData();		
			
	    	myUsername.getScene().setRoot(root);
	    	
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    void initialize() {
        assert error != null : "fx:id=\"error\" was not injected: check your FXML file 'login.fxml'.";
        assert myPassword != null : "fx:id=\"myPassword\" was not injected: check your FXML file 'login.fxml'.";
        assert myUsername != null : "fx:id=\"myUsername\" was not injected: check your FXML file 'login.fxml'.";
        
        userDAO = new UserDAOImpl();
    }

	@Override
	public void initData() {
		// TODO Auto-generated method stub
		
	}
	
    @FXML
    void onEnter(KeyEvent event) {
    	if (event.getCode().equals(KeyCode.ENTER)) {
			login();
		}
    }
	
	private void login() {
		error.setText("");
    	if(myUsername.getText() == null || myPassword.getText() == null
    			|| myPassword.getText().isBlank() || myUsername.getText().isBlank()) {
    		error.setText("Credenziali invalide!");
    		return;
    	}
    	
    	String username = myUsername.getText();
    	String password = myPassword.getText();
    	
    	if(userDAO.checkPassword(username, password)) {
    		stage.setUserData(new Status(
						//new UserDTO(new BigDecimal(1), "Loren", new Date(2000, 1, 1), "Italia", "Milano", "codiceFiscale", "Admin"))
						userDAO.getUser(username))
					);

    		startMain();
    	}else error.setText("Credenziali errate!");
	}

}
