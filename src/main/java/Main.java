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
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
		Parent root = loader.load();

		primaryStage.setTitle("Login");
		primaryStage.setScene(new Scene(root, 450, 350));
		primaryStage.show();
		
		primaryStage.setMinWidth(450);
		primaryStage.setMinHeight(350);
		primaryStage.setWidth(450);
		primaryStage.setHeight(350);
	}

	public static void main(String[] args) {
		/*
		 * UserDAO userDAO = new UserDAOImpl(); ArrayList<UserDTO> users =
		 * userDAO.getAllUsers(); UserDTO lorenzo = userDAO.getUser("Lorenzo Romeo");
		 * System.out.println("Lorenzo: "+ lorenzo.toString()+"\n\n"); for(UserDTO u :
		 * users) System.out.println(u.toString());
		 */

		launch(args);
	}

}
