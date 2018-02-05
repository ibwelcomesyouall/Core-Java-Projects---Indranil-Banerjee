package org.indranil.learning.topicwise.JavaFX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.collections.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ComboBoxDemo extends Application {
	ComboBox<String> cbTransport;
		
	Label response;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage myStage) {

		myStage.setTitle("ComboBox Demo");
		
		FlowPane rootNode = new FlowPane(10,10);
		
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode, 280,120);
		
		myStage.setScene(myScene);
				
		response = new Label();
		
		ObservableList<String> transportTypes = FXCollections.observableArrayList("Train","Car","Airplane","Bicycle","Walking");
		cbTransport = new ComboBox<String>(transportTypes);
		cbTransport.setEditable(true);
		
		cbTransport.setValue("Train");
		
		response.setText("Selected Transport is "+ cbTransport.getValue());
		
		cbTransport.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				response.setText("Selected Transport is "+ cbTransport.getValue());
				
			}
		});
		
		rootNode.getChildren().addAll(cbTransport, response);
		
		myStage.show();
		
	}
}