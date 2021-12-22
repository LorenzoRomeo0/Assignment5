import java.util.ArrayList;

import controller.Controller;
import dao.UserDAO;
import dao.UserDAOImpl;
import dao.UserDTO;
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
    	
    	primaryStage.setMinWidth(450);
    	primaryStage.setMinHeight(350);
    	
    	primaryStage.setWidth(450);
    	primaryStage.setHeight(350);
    	
        primaryStage.setTitle("Votazione Online");
        primaryStage.setScene(new Scene(root, 450, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {
    	/*UserDAO userDAO = new UserDAOImpl();
    	ArrayList<UserDTO> users = userDAO.getAllUsers();
    	UserDTO lorenzo = userDAO.getUser("Lorenzo Romeo");
    	System.out.println("Lorenzo: "+ lorenzo.toString()+"\n\n");
    	for(UserDTO u : users) System.out.println(u.toString());*/
    	
        launch(args);
    }
    
}
