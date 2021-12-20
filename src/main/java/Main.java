import java.nio.charset.StandardCharsets;

import com.google.common.hash.Hashing;

import controller.Controller;
import data.Status;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	final String hashed = Hashing.sha256()
    	        .hashString("Ciao", StandardCharsets.UTF_8)
    	        .toString();
    	
    	System.out.println("HASH: "+hashed);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
    	//controller.setStato();
    	//controller.initData();
    	// TODO: rimuovere tutti
        
        
    	primaryStage.setMinWidth(300);
    	primaryStage.setMinHeight(250);
    	
    	primaryStage.setWidth(500);
    	primaryStage.setHeight(450);
    	
    	primaryStage.setUserData(new Status("dianka", "mevan", "23 luglio 2000", "italiana", "frndkm00l23f205a", "admin"));
    	
        primaryStage.setTitle("Votazione Online");
        primaryStage.setScene(new Scene(root, 500, 450));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
