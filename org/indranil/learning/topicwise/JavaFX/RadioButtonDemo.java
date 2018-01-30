package org.indranil.learning.topicwise.JavaFX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class RadioButtonDemo extends Application {
	
	Label response;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage myStage) {

		myStage.setTitle("Demonstrate Radio Buttons");
		
		FlowPane rootNode = new FlowPane(10,10);
		
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode, 220,120);
		
		myStage.setScene(myScene);
		
		response = new Label("");
		
		RadioButton rbTrain = new RadioButton("Train");
		RadioButton rbCar = new RadioButton("Car");
		RadioButton rbPlane = new RadioButton("Airplane");
		
		ToggleGroup tg = new ToggleGroup();
		
		rbTrain.setToggleGroup(tg);
		rbCar.setToggleGroup(tg);
		rbPlane.setToggleGroup(tg);
		
		rbTrain.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				response.setText("Transport selected is train.");
				
			}
		});
		
		rbCar.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				response.setText("Transport selected is car.");
				
			}
		});

		rbPlane.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				response.setText("Transport selected is airplane.");
				
			}
		});
		
		rbTrain.fire();
		
		rootNode.getChildren().addAll(rbTrain,rbCar,rbPlane,response);
		
		myStage.show();


		
	}

}
