package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.google.common.graph.ElementOrder.Type;

import data.Status;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerLogin extends Controller{

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
    	error.setText("");
    	if(myUsername.getText() == null || myPassword.getText() == null
    			|| myPassword.getText().isBlank() || myUsername.getText().isBlank()) {
    		error.setText("Errore");
    	}
    	
    	
    	error.getScene().getWindow().setUserData(new Status("lorenza", "romea", "05 ottobre 2000", "filippina", "rmoln00t45f205a", "admin"));
    	
    	startMain();
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

    }

	@Override
	public void initData() {
		// TODO Auto-generated method stub
		
	}

}
