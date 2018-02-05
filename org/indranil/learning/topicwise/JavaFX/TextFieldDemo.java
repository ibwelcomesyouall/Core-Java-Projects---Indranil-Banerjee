package org.indranil.learning.topicwise.JavaFX;

import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class TextFieldDemo extends Application {
	
	TextField tf;		
	Label response;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage myStage) {

		myStage.setTitle("Demontrate a TextField");
		
		FlowPane rootNode = new FlowPane(10,10);
		
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode, 230,140);
		
		myStage.setScene(myScene);
				
		response = new Label("Search String: ");
		
		Button btnGetText = new Button("Get Search String");
		tf = new TextField();
		tf.setPromptText("Enter Search String");
		tf.setPrefColumnCount(15);
		
		tf.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				response.setText("Search String: "+ tf.getText());
				
			}
		});
		
		btnGetText.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				response.setText("Search String: "+ tf.getText());
				
			}
		});
		
		Separator separator = new Separator();
		separator.setPrefWidth(180);
		
		rootNode.getChildren().addAll(tf,btnGetText,separator,response);
		
		myStage.show();
		
	}
}