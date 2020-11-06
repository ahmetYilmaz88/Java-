package FinalExam;

import javafx.application.Application;

import javafx.event.*;

import javafx.geometry.Pos;

import javafx.scene.Scene;

import javafx.scene.control.*;

import javafx.stage.Stage;

import javafx.scene.layout.HBox;

import java.util.ArrayList;

import javafx.geometry.Insets;

import javax.swing.JOptionPane;


public class SumOfInt extends Application {


	Label enterInt;

	TextField getInt;

	Button sumInt;

	private ArrayList<Integer> numberList = new ArrayList<Integer>();



	@Override

	public void start(Stage stage) {

		enterInt = new Label("Please enter a valid integer");

		getInt= new TextField();

		sumInt= new Button("sumInt");


		sumInt.setOnAction(new EventHandler<ActionEvent>() {


			@Override

			public void handle(ActionEvent e) {

				Button buttonPressed;


				if(e.getSource() instanceof Button)

				{

					buttonPressed = (Button) e.getSource();


					try

					{

						if (buttonPressed.getText().equals("sumInt"))

						{

							int sum = 0;
							
							String userInput = getInt.getText();
							for (int i = 0; i < userInput.length(); i++)
							{
							

								numberList.add(Integer.parseInt(Character.toString(userInput.charAt(i))));
								sum += numberList.get(i);
							}
							JOptionPane.showMessageDialog(null,Integer.toString(sum));

						}

					}

					catch(Exception ex)

					{

							JOptionPane.showMessageDialog(null,"Integer must be entered!!!");

					}

				}

			}

		});


		HBox hBox = new HBox(15);

		hBox.setAlignment(Pos.CENTER);

		hBox.setPadding(new Insets (15,15,15,15));

		hBox.getChildren().addAll(enterInt, getInt, sumInt);

		Scene scene = new Scene(hBox, 450, 250);


		stage.setTitle("Sum Of Integers!!");

		stage.setScene(scene);

		stage.show();


	}
	public static void main(String[] args) {
		launch(args);
	}

}