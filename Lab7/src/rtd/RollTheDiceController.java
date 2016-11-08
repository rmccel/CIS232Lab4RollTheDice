package rtd;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class RollTheDiceController {

	@FXML
	private Button button;

	@FXML
	private ImageView image1;

	@FXML
	private ImageView image2;
	
	@FXML
	private Label label1;
	
	@FXML
	private Label label2;

	//image diceOne = newImage("http://vignette2.wikia.nocookie.net/game-of-dice/images/c/cb/White_Dice.png/revision/latest?cb=20160113233423");
	
	@FXML
	void rollTheDiceRoll(ActionEvent event) {
		Random random = new Random();
		int rollDice1;
		int rollDice2;
		
		//Math.random() * 6 + 1
		
	}

}