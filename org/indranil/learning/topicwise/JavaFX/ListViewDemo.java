package org.indranil.learning.topicwise.JavaFX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class ListViewDemo extends Application {
		
	Label response;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage myStage) {

		myStage.setTitle("ListView Demo");
		
		FlowPane rootNode = new FlowPane(10,10);
		
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode, 200,120);
		
		myStage.setScene(myScene);
				
		response = new Label("Select Transport Type");
		
		ObservableList<String> transportTypes = FXCollections.observableArrayList("Train","Car","Airplane","Bicycle","Walking");
		ListView<String> lvTransport = new ListView<String>(transportTypes);
		
		lvTransport.setPrefSize(80, 80);
		
		MultipleSelectionModel<String> lvSelModel = lvTransport.getSelectionModel();
		
		lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {
				response.setText("Transport selected is "+ newVal);
				
			}
		});
		
		rootNode.getChildren().addAll(lvTransport, response);
		
		myStage.show();
		
	}
}