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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
    	controller.setStato(new Status("dianka mevan", "fernando", "23 luglio 2000", "italiana", "frndkm00l23f205a", "admin"));
    	controller.initData();
    	
    	primaryStage.setMinWidth(500);
    	primaryStage.setMinHeight(400);
    	
    	primaryStage.setWidth(500);
    	primaryStage.setHeight(450);
    	
        primaryStage.setTitle("Votazione Online");
        primaryStage.setScene(new Scene(root, 500, 450));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
