import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;                 //Give access to the Label, RadioButton, and TextField classes
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class SuperHerosTestFX extends Application
{
	private secretIdentity mySecretIdentity = secretIdentity.Clark;
	private SuperHeros_1 SuperHeros1 = new SuperHeros_1("Christopher", "Reeve", "male", (byte) 57, 1, 10);
	private SuperHeros_1 SuperHeros2 = new SuperHeros_1("Gal", "Gadot", null, null, null, "female", (byte) 45, 10, 1, characterName.WonderWoman, secretIdentity.Programmer);
	private Label nameLabel = new Label("Name: ");
	private TextField nameField = new TextField();
	private RadioButton characterButton = new RadioButton("Clark");
	private RadioButton charButton = new RadioButton("Engineer");
	private RadioButton chButton = new RadioButton("Programmer");
	private Scene scene;
	private FlowPane sceneLayout = new FlowPane();
	
	@Override
	public void start(Stage primaryStage)
	{
		nameField.setPrefColumnCount(14);
		nameField.setText(SuperHeros2.getCharacterName());
		
		mySecretIdentity = secretIdentity.Clark;
		
		if (SuperHeros2.getSecretIdentity() == secretIdentity.Clark)
		{
			characterButton.setSelected(true);
			charButton.setSelected(false);
			chButton.setSelected(false);
		}
		else if (SuperHeros2.getSecretIdentity() == secretIdentity.Engineer)
		{
			characterButton.setSelected(false);
			charButton.setSelected(true);
			chButton.setSelected(false);
		}
		else if (SuperHeros2.getSecretIdentity() == secretIdentity.Programmer)
		{
			characterButton.setSelected(false);
			charButton.setSelected(false);
			chButton.setSelected(true);
		}
		else
		{
			characterButton.setSelected(false);
			charButton.setSelected(false);
			chButton.setSelected(false);
		}
		sceneLayout.getChildren().addAll(nameLabel, nameField, characterButton, charButton, characterButton);
		scene = new Scene(sceneLayout, 200, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("SuperHeros Info");
		primaryStage.show();
	}
}