import javafx.application.Application; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.TextArea; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox; 
import javafx.scene.paint.Color; 
import javafx.scene.text.Font; 
import javafx.stage.Stage;

public class System_Tester_Y3871879 extends Application {

	
	private static System_Y3871879 system001 = new System_Y3871879(null, null, 0);
			
			@Override    
			public void start(Stage stage)     
			{         
				// create and configure text fields for input         
				TextField makeField = new TextField();         
				makeField.setMaxWidth(50);         
				TextField modelField = new TextField();         
				modelField.setMaxWidth(50); 
				TextField speedField = new TextField();         
				speedField.setMaxWidth(50); 
				TextField memoryField = new TextField();         
				memoryField.setMaxWidth(50); 
				TextField hdField = new TextField();         
				hdField.setMaxWidth(50); 
				TextField costField = new TextField();         
				costField.setMaxWidth(50); 
				

				// create and configure a non-editable text area to display the results      
				TextArea display = new TextArea();        
				display.setEditable(false);         
				display.setMinSize(210,50);         
				display.setMaxSize(210,50); 
				
				// create and configure Labels for the text fields         
				Label makeLabel = new Label("Make");         
				makeLabel.setTextFill(Color.RED);         
				makeLabel.setFont(Font.font("Arial", 20));         
				Label modelLabel = new Label("Model");         
				modelLabel.setTextFill(Color.RED);         
				modelLabel.setFont(Font.font("Arial", 20));
				Label speedLabel = new Label("Processor Speed");         
				speedLabel.setTextFill(Color.RED);         
				speedLabel.setFont(Font.font("Arial", 20));
				Label memoryLabel = new Label("Memory");         
				memoryLabel.setTextFill(Color.RED);         
				Label hdLabel = new Label("Hard Disk Size");         
				hdLabel.setTextFill(Color.RED);         
				hdLabel.setFont(Font.font("Arial", 20));
				Label costLabel = new Label("Purchase Cost");         
				costLabel.setTextFill(Color.RED);         
				costLabel.setFont(Font.font("Arial", 20));

				// create and configure a button to perform the calculations         
				Button submitButton = new Button();         
				submitButton.setText("Submit");        
				submitButton.setOnAction( e ->                     
									{  					     
										
											
											system001.setMake(makeField.getText());
											system001.setModel(modelField.getText());
											system001.setSpeed(Integer.parseInt(speedField.getText()));
											system001.setMemorySize(Integer.parseInt(memoryField.getText()));
											system001.setHardDiskSize(Double.parseDouble(hdField.getText()));
											system001.setPurchaseCost(Double.parseDouble(costField.getText()));
											                        
											                                                                   
										}                                     
									); 
				
				// create and configure an HBox for the labels and text inputs                       
				/*HBox inputComponents = new HBox(10);
				inputComponents.setAlignment(Pos.CENTER);        
				inputComponents.getChildren().addAll(makeLabel, makeField, modelField, speedField, memoryField, hdField, costField);*/
				
				// create and configure a vertical container to hold all the components      
				VBox root = new VBox(25);         
				root.setAlignment(Pos.CENTER);        
				root.getChildren().addAll(makeLabel, makeField, modelField, speedField, memoryField, hdField, costField, submitButton); 
				
				// create a new scene and add it to the stage         
				Scene scene = new Scene(root, 550, 550);         
				stage.setScene(scene);         
				stage.setTitle("System Spec");        
				stage.show();             
				
}

public static void main (String[] args)

{
	launch(args);
	
   
		
		//system001.setMemorySize();
		//system001.setHardDiskSize();
		//system001.setPurchaseCost();
		system001.displayDetails();
		system001.diagnoseSystem();
		
		
	}
}

