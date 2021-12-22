package controller;
import data.Status;
import javafx.stage.Stage;

public abstract class Controller {
	
	private Stage stage;
	
	public abstract void initData();
	
	public void setStage(Stage stage) {
	     this.stage = stage;
	}
	
	public Stage getStage() {
		return stage;
	}
}
