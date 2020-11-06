package Binary;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;


public class IntToBinaryConverter extends Application {
   
   @Override
   public void start(Stage stage) {
	   

       Label label = new Label("Please enter a valid integer");
       TextField enterNumber = new TextField ();
       Button button = new Button("Convert to binary");
       TextField toBinary = new TextField ();
       
       


       HBox hbox = new HBox();
       TextField field = new TextField();
       HBox.setHgrow(field, Priority.ALWAYS);
       hbox.getChildren().addAll(label, enterNumber, button, toBinary);
       
       
       

       button.setOnAction(new EventHandler<ActionEvent>() {

           @Override
           public void handle(ActionEvent e) {
               try{

                   int number = Integer.parseInt(enterNumber.getText());
                   toBinary.setText(convertToBinary(number));
               }catch(Exception ex){
                   toBinary.setText("Invalid input entered!!!");
               }
           }
       });

       
       Scene scene = new Scene(hbox, 450, 250);
       stage.setScene(scene);
       stage.show();
   }


   public String convertToBinary(int x){
       if(x==0){
           return "";
       }else{
           return convertToBinary(x/2)+(x%2);
       }
   }
       public static void main(String[] args) {
           launch(args);
       }
   
}