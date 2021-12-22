package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerLogin {

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

    }

    @FXML
    void initialize() {
        assert error != null : "fx:id=\"error\" was not injected: check your FXML file 'login.fxml'.";
        assert myPassword != null : "fx:id=\"myPassword\" was not injected: check your FXML file 'login.fxml'.";
        assert myUsername != null : "fx:id=\"myUsername\" was not injected: check your FXML file 'login.fxml'.";

    }

}
