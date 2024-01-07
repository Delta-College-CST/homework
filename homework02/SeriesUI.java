// Delta College - CST 183 - Klingler
// This application demonstrates a basic Java event-driven application with
// a user interface that allows a number of terms to be entered.  The application
// then calculates the following:  1/2 + 2/3 + 3/4 + 4/5 + ... through the number of
// terms.  Output is displayed via an Alert box.

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class SeriesUI extends Application
{
   // Declare objects
   private Label limitLabel;
   private TextField limitField;
   private Button calcButton;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create limit label and text field
      limitLabel = new Label("Limit");
      limitField = new TextField();
      
      // Create a Button control
      calcButton = new Button("Calculate");
      
      // Build formatting GUI
      HBox op1Box  = new HBox(10, limitLabel, limitField);
      op1Box.setAlignment(Pos.CENTER);
      VBox mainBox = new VBox(10,op1Box,calcButton);
      mainBox.setAlignment(Pos.CENTER);
      
      // Set up overall scene
      Scene scene = new Scene(mainBox, 600, 300);
      primaryStage.setScene(scene);
      primaryStage.setTitle("Series Calculator");
      primaryStage.show();
   }
   
}