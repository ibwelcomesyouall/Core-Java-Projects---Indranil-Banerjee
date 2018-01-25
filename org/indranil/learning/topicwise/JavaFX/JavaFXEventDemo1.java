package org.indranil.learning.topicwise.JavaFX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class JavaFXEventDemo1 extends Application {
	
	Label response;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start (Stage myStage) {
		myStage.setTitle("Demonstrate a JavaFX Buttons and Events");
		
		//In this case, vertical and horizontal gaps of 10.
		FlowPane rootNode = new FlowPane(10,10);
		
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode, 300, 100);
		myStage.setScene(myScene);
		
		response = new Label("Push a Button");
		
		Button btnAlpha = new Button("Alpha");
		Button btnBeta = new Button("Beta");
		
		btnAlpha.setOnAction( (ae) -> response.setText("Alpha was pressed."));
		
		btnBeta.setOnAction((ae) -> response.setText("Beta was pressed."));
		
		rootNode.getChildren().addAll(btnAlpha, btnBeta, response);
		
		myStage.show();

	}
}
