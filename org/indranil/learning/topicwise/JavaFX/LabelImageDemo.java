package org.indranil.learning.topicwise.JavaFX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.image.*;

public class LabelImageDemo extends Application {
	
	public static void main(String[]args) {
		launch(args);
	}

	@Override
	public void start(Stage myStage) {
		myStage.setTitle("Use an Image in a Label");
		
		FlowPane rootNode = new FlowPane();
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode,300,200);
		myStage.setScene(myScene);
		
		Image hourglass = new Image("F:\\\\Study\\\\Java Programming Codes\\\\Code@Indranil\\\\TemporaryArtifacts\\\\Hourglass.png");
		ImageView hourglassIV = new ImageView(hourglass);
		
		Label hourglassLabel = new Label("Hourglass",  hourglassIV);
		// By default it will be in right but by the below line it will in bottom
		hourglassLabel.setContentDisplay(ContentDisplay.TOP);
		
		rootNode.getChildren().add(hourglassLabel);
		
		myStage.show();
	}
		

}
