package rtd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RollTheDiceApplication extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//Loads the FXML/Scenebuilder Layout file
		Parent parent = FXMLLoader.load(getClass().getResource("rollthedice.fxml"));
		//Builds the scene graph
		Scene scene = new Scene(parent);
		
		//Displays the window using the scene graph
		stage.setScene(scene);		
		stage.show();
	}

}