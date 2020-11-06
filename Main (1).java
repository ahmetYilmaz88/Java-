package Scheduler;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;
import javafx.geometry.Insets;
import javax.swing.JOptionPane;
import javafx.scene.control.TextField;


	
	public class Main extends Application
	{
		Button submitButton= new Button("Submit");
		Button clearButton= new Button("Clear");
		Button openButton= new Button("Open");
		
		ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

		
		Appointment mondayAppointment;
		Appointment tuesdayAppointment;
		Appointment wednesdayAppointment;
		Appointment thursdayAppointment;
		Appointment fridayAppointment;
		Appointment saturdayAppointment;
		Appointment sundayAppointment;

		
		Label monday;
		TextField timeBoxMonday;
		TextField appointmentDetailMonday;
		
		Label tuesday;
		TextField timeBoxTuesday;
		TextField appointmentDetailTuesday;
		
		Label wednesday;
		TextField timeBoxWednesday;
		TextField appointmentDetailWednesday;
		
		Label thursday;
		TextField timeBoxThursday;
		TextField appointmentDetailThursday;
		
		Label friday;
		TextField timeBoxFriday;
		TextField appointmentDetailFriday;
		
		Label saturday;
		TextField timeBoxSaturday;
		TextField appointmentDetailSaturday;
		
		Label sunday;
		TextField timeBoxSunday;
		TextField appointmentDetailSunday;
		
	
		@Override
		public void start (Stage primaryStage) 
		{
		
			monday= new Label("Monday");
			timeBoxMonday=  new TextField ();
			appointmentDetailMonday= new TextField ("Appointment Detail");
			
			tuesday= new Label("Tuesday");
			timeBoxTuesday=  new TextField ();
			appointmentDetailTuesday= new TextField ("Appointment Detail");
			
			wednesday= new Label("Wednesday");
			timeBoxWednesday=  new TextField ();
			appointmentDetailWednesday= new TextField ("Appointment Detail");
			
			thursday= new Label("Thursday");
			timeBoxThursday=  new TextField ();
			appointmentDetailThursday= new TextField ("Appointment Detail");
			
			friday= new Label("Friday");
			timeBoxFriday=  new TextField ();
			appointmentDetailFriday= new TextField ("Appointment Detail");
			
			saturday= new Label("Saturday");
			timeBoxSaturday=  new TextField ();
			appointmentDetailSaturday= new TextField ("Appointment Detail");
			
			sunday= new Label("Sunday");
			timeBoxSunday=  new TextField ();
			appointmentDetailSunday= new TextField ("Appointment Detail");

			
			HBox hBox = new HBox(15);
			hBox.setAlignment(Pos.CENTER);
			hBox.setPadding(new Insets (15,15,15,15));
			hBox.getChildren().addAll(submitButton,clearButton,openButton);
		
			
			VBox vBox1= new VBox(15);
			vBox1.setAlignment(Pos.CENTER);
			vBox1.setPadding(new Insets(15, 5, 5, 5));
			vBox1.getChildren().addAll(monday, timeBoxMonday,appointmentDetailMonday);
			
				
			VBox vBox2= new VBox(15);
			vBox2.setAlignment(Pos.CENTER);
			vBox2.setPadding(new Insets(15, 5, 5, 5));
			vBox2.getChildren().addAll(tuesday, timeBoxTuesday,appointmentDetailTuesday);

			
			VBox vBox3= new VBox(15);
			vBox3.setAlignment(Pos.CENTER);
			vBox3.setPadding(new Insets(15, 5, 5, 5));
			vBox3.getChildren().addAll(wednesday, timeBoxWednesday,appointmentDetailWednesday);

			
			VBox vBox4= new VBox(15);
			vBox4.setAlignment(Pos.CENTER);
			vBox4.setPadding(new Insets(15, 5, 5, 5));
			vBox4.getChildren().addAll(thursday, timeBoxThursday,appointmentDetailThursday);

			
			VBox vBox5= new VBox(15);
			vBox5.setAlignment(Pos.CENTER);
			vBox5.setPadding(new Insets(15, 5, 5, 5));
			vBox5.getChildren().addAll(friday, timeBoxFriday,appointmentDetailFriday);

			
			VBox vBox6= new VBox(15);
			vBox6.setAlignment(Pos.CENTER);
			vBox6.setPadding(new Insets(15, 5, 5, 5));
			vBox6.getChildren().addAll(saturday, timeBoxSaturday,appointmentDetailSaturday);

				
			VBox vBox7= new VBox(15);
			vBox7.setAlignment(Pos.CENTER);
			vBox7.setPadding(new Insets(15, 5, 5, 5));
			vBox7.getChildren().addAll(sunday, timeBoxSunday,appointmentDetailSunday);
			
		
			 StackPane root = new StackPane();
		     root.getChildren().addAll(vBox1, vBox2, vBox3, vBox4, vBox5, vBox6,vBox7);   

		     Scene scene = new Scene(root, 500, 500);

		     primaryStage.setTitle("Scheduler!!");
		     primaryStage.setScene(scene);
		     primaryStage.show();

		
		
			
			submitButton.setOnAction(new ButtonListener());		
			clearButton.setOnAction(new ButtonListener());
			openButton.setOnAction(new ButtonListener());
		
		
		}
	private class ButtonListener implements EventHandler<ActionEvent>
	{
		
		
		
		
		@Override
		public void handle(ActionEvent e)
		{
			Button buttonPressed = new Button();
			
			if(e.getSource()instanceof Button)
				try 
				{
						if (buttonPressed.getText().equals("Submit"))
							{
							
								mondayAppointment= new Appointment(DayOfWeek.MONDAY,timeBoxMonday.getText(), appointmentDetailMonday.getText());
								tuesdayAppointment= new Appointment(DayOfWeek.MONDAY,timeBoxTuesday.getText(), appointmentDetailTuesday.getText());
								wednesdayAppointment= new Appointment(DayOfWeek.MONDAY,timeBoxWednesday.getText(), appointmentDetailWednesday.getText());
								thursdayAppointment= new Appointment(DayOfWeek.MONDAY,timeBoxThursday.getText(), appointmentDetailThursday.getText());
								fridayAppointment= new Appointment(DayOfWeek.MONDAY,timeBoxFriday.getText(), appointmentDetailFriday.getText());
								saturdayAppointment= new Appointment(DayOfWeek.MONDAY,timeBoxSaturday.getText(), appointmentDetailSaturday.getText());
								sundayAppointment= new Appointment(DayOfWeek.MONDAY,timeBoxSunday.getText(), appointmentDetailSunday.getText());
							}
						
						else if (buttonPressed.getText().equals("Clear"))
					
						{
							timeBoxMonday.setText("");
							timeBoxTuesday.setText("");
							timeBoxWednesday.setText("");
							timeBoxThursday.setText("");
							timeBoxFriday.setText("");
							timeBoxSaturday.setText("");
							timeBoxSunday.setText("");
							
							appointmentDetailMonday.setText("");
							appointmentDetailTuesday.setText("");
							appointmentDetailWednesday.setText("");
							appointmentDetailThursday.setText("");
							appointmentDetailFriday.setText("");
							appointmentDetailSaturday.setText("");
							appointmentDetailSunday.setText("");
						}
						else
						{
							timeBoxMonday.setText(mondayAppointment.getTime());
							timeBoxTuesday.setText(tuesdayAppointment.getTime());
							timeBoxWednesday.setText(wednesdayAppointment.getTime());
							timeBoxThursday.setText(thursdayAppointment.getTime());
							timeBoxFriday.setText(fridayAppointment.getTime());
							timeBoxSaturday.setText(saturdayAppointment.getTime());
							timeBoxSunday.setText(sundayAppointment.getTime());
							
							appointmentDetailMonday.setText(mondayAppointment.getAppointment());
							appointmentDetailTuesday.setText(tuesdayAppointment.getAppointment());
							appointmentDetailWednesday.setText(wednesdayAppointment.getAppointment());
							appointmentDetailThursday.setText(thursdayAppointment.getAppointment());
							appointmentDetailFriday.setText(fridayAppointment.getAppointment());
							appointmentDetailSaturday.setText(saturdayAppointment.getAppointment());
							appointmentDetailSunday.setText(sundayAppointment.getAppointment());


						
						}
					
			}
				catch (NumberFormatException nfe)
				{
					JOptionPane.showMessageDialog(null, "Please enter a valid Time and letter, (a or p)");
				
			
				}
			}
		}
	}


