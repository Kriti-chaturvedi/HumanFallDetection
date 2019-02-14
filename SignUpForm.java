package application;

import java.io.IOException;

import javafx.application.Application; 
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.CheckBox; 
import javafx.scene.control.ChoiceBox; 
import javafx.scene.control.DatePicker; 
import javafx.scene.control.ListView; 
import javafx.scene.control.RadioButton; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleGroup;  
import javafx.scene.control.ToggleButton; 
import javafx.stage.Stage; 
         
public class SignUpForm extends Application { 
   @Override 
   public void start(Stage stage) {    
      //Label for name 
      Text nameLabel = new Text("FirstName"); 
      
      //Text field for name 
      TextField nameText = new TextField(); 
       
      //Label for date of birth 
      Text dobLabel = new Text("LastName"); 
      
      //date picker to choose date 
      TextField datePicker = new TextField(); 
      
      //Label for date of birth 
      Text email = new Text("E-mail Id"); 
      
      //date picker to choose date 
      TextField emailid = new TextField(); 
       
      //Label for gender
      Text genderLabel = new Text("gender"); 
      
      //Toggle group of radio buttons       
      ToggleGroup groupGender = new ToggleGroup(); 
      RadioButton maleRadio = new RadioButton("male"); 
      maleRadio.setToggleGroup(groupGender); 
      RadioButton femaleRadio = new RadioButton("female"); 
      femaleRadio.setToggleGroup(groupGender); 
       
      
      //Label for location 
      Text locationLabel = new Text("location"); 
      
      //Choice box for location 
      ChoiceBox locationchoiceBox = new ChoiceBox(); 
      locationchoiceBox.getItems().addAll
         ("Frankfurt", "Berlin", "Koln", "Munich", "Stuttgart"); 
       
      //Label for register 
      Button buttonRegister = new Button("Register");  
      
    //Label for going back 
      Button buttonback = new Button("Back"); 
      buttonback.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	              Login lg = new Login();
	              try {
					lg.start(stage);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	         }
	      });
      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
      
      //Setting size for the pane 
      gridPane.setMinSize(1000, 600); 
       
      //Setting the padding    
      gridPane.setPadding(new Insets(10, 10, 10, 10));  
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(nameLabel, 0, 0); 
      gridPane.add(nameText, 1, 0); 
       
      gridPane.add(dobLabel, 0, 1);       
      gridPane.add(datePicker, 1, 1); 
      
      gridPane.add(email, 0, 2);       
      gridPane.add(emailid, 1, 2); 
      
      gridPane.add(genderLabel, 0, 3); 
      gridPane.add(maleRadio, 1, 3);       
      gridPane.add(femaleRadio, 2, 3); 
           
      gridPane.add(locationLabel, 0, 5); 
      gridPane.add(locationchoiceBox, 1, 5);    
       
      gridPane.add(buttonRegister, 2, 8);      
      gridPane.add(buttonback, 0, 8);   
      
      //Styling nodes   
      buttonRegister.setStyle(
         "-fx-background-color: darkslateblue; -fx-textfill: white;"); 
      buttonback.setStyle(
    	         "-fx-background-color: darkslateblue; -fx-textfill: white;");
       
      nameLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      dobLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
      email.setStyle("-fx-font: normal bold 15px 'serif' ");
      genderLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
     
      locationLabel.setStyle("-fx-font: normal bold 15px 'serif' "); 
       
      //Setting the back ground color 
      gridPane.setStyle("-fx-background-color: LAVENDER;");       
       
      //Creating a scene object 
      Scene scene = new Scene(gridPane); 
      
      //Setting title to the Stage 
      stage.setTitle("Registration Form"); 
         
      //Adding scene to the stage 
      stage.setScene(scene);  
      
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   
}
