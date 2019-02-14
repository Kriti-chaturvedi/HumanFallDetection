package application;

import java.io.IOException;

import javafx.application.Application; 
import javafx.collections.FXCollections;  
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane; 
         
public class EffectAnalysis extends Application {  
   @Override 
   public void start(Stage stage) { 
      //Preparing ObservbleList object         
      ObservableList<PieChart.Data> pieChartData6 = FXCollections.observableArrayList(
         new PieChart.Data("injuries", 200), 
         new PieChart.Data("low sugar level", 200), 
         new PieChart.Data("no effect ", 100), 
         new PieChart.Data("high pulse rate", 400)); 
       
      Button buttonback = new Button("Back"); 
      buttonback.setOnAction(new EventHandler<ActionEvent>() {
	          @Override public void handle(ActionEvent e) {
	              TypeOfDisplay tod = new TypeOfDisplay(0);
	              tod.start(stage);
				}
	      });
      
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
      
      gridPane.add(buttonback, 6, 18);  
      buttonback.setStyle(
	 	         "-fx-background-color: darkslateblue;"); 
      gridPane.setStyle("-fx-background-color: Lavender;");
      //Creating a Pie chart 
      PieChart pieChart = new PieChart(pieChartData6); 
              
      //Setting the title of the Pie chart 
      pieChart.setTitle("After Effect Analysis of Falls"); 
       
      //setting the direction to arrange the data 
      pieChart.setClockwise(true); 
       
      //Setting the length of the label line 
      pieChart.setLabelLineLength(40); 

      //Setting the labels of the pie chart visible  
      pieChart.setLabelsVisible(true); 
       
      //Setting the start angle of the pie chart  
      pieChart.setStartAngle(180);     
         
      //Creating a Group object  
     // Group root = new Group(); 
         
      gridPane.add(pieChart,6,0);  
      //Creating a scene object 
      Scene scene = new Scene(gridPane);  
      
      //Setting title to the Stage 
      stage.setTitle("Pie chart"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();         
   }     
 //  public static void main(String args[]){ 
  //    launch(args); 
  // } 
} 
