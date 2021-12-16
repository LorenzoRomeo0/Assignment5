package controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnOK;

    @FXML
    private DatePicker date;

    @FXML
    private TextField mail;

    @FXML
    private TextField name;

    @FXML
    private TextArea output;

    @FXML
    private TextField surname;

    @FXML
    void handleName(ActionEvent event) {

    }

    @FXML
    void handleOK(ActionEvent event) {
    	if(mail.getText() != "" && name.getText() != "" && surname.getText() != null && date.getValue() != null) {
    		String value = name.getText() +" "+ surname.getText() + " " + mail.getText() + " " + date.getValue().toString()+"\n";
    		output.appendText(value);
    	}else{
    		System.out.println("Data invalidi");
    	}
    }

    @FXML
    void initialize() {
        assert btnOK != null : "fx:id=\"btnOK\" was not injected: check your FXML file 'ex.fxml'.";
        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'ex.fxml'.";
        assert mail != null : "fx:id=\"mail\" was not injected: check your FXML file 'ex.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'ex.fxml'.";
        assert output != null : "fx:id=\"output\" was not injected: check your FXML file 'ex.fxml'.";
        assert surname != null : "fx:id=\"surname\" was not injected: check your FXML file 'ex.fxml'.";

    }

}
