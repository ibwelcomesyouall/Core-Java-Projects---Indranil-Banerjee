package org.indranil.learning.topicwise.JavaFX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class CheckboxDemo extends Application {
	
	CheckBox cbWeb;
	CheckBox cbDesktop;
	CheckBox cbMobile;
	
	Label response;
	Label allTargets;
	
	String targets =" ";
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage myStage) {

		myStage.setTitle("Demonstrate Checkboxes");
		
		FlowPane rootNode = new FlowPane(10,10);
		
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode, 230,140);
		
		myStage.setScene(myScene);
		
		Label heading = new Label("Select Deployment Options");
		
		response = new Label("No Deployment Selected");
		
		allTargets = new Label("Traget List: <none>");
		
		cbWeb = new CheckBox("Web");
		cbDesktop = new CheckBox("Desktop");
		cbMobile = new CheckBox("Mobile");
		
		cbWeb.setAllowIndeterminate(true);
		cbDesktop.setAllowIndeterminate(true);
		cbMobile.setAllowIndeterminate(true);
		
		cbWeb.setTooltip(new Tooltip("Deloy to Web"));
		cbDesktop.setTooltip(new Tooltip("Deloy to Desktop"));
		cbMobile.setTooltip(new Tooltip("Deloy to Mobile"));
		
		cbWeb.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				if(cbWeb.isIndeterminate())
					response.setText("Web deployment indeterminate.");
				else if(cbWeb.isSelected())
					response.setText("Web deployment selected.");
				else
					response.setText("Web deployment cleared.");
				
				showAll();
				
			}
		});
		
		cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				if(cbDesktop.isIndeterminate())
					response.setText("Desktop deployment indeterminate.");
				else if(cbDesktop.isSelected())
					response.setText("Desktop deployment selected.");
				else
					response.setText("Desktop deployment cleared.");
				
				showAll();
				
			}
		});

		cbMobile.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				if(cbMobile.isIndeterminate())
					response.setText("Mobile deployment indeterminate.");
				else if(cbMobile.isSelected())
					response.setText("Mobile deployment selected.");
				else
					response.setText("Mobile deployment cleared.");
				
				showAll();
				
			}
		});
		
		Separator separator = new Separator();
		separator.setPrefWidth(200);
		
		rootNode.getChildren().addAll(heading,separator,cbWeb,cbDesktop,cbMobile, response, allTargets);
		
		myStage.show();

	}
	
	void showAll() {
		
		targets = "";
		if(cbWeb.isSelected()) targets = "Web ";
		if(cbDesktop.isSelected()) targets +=  "Desktop ";
		if(cbMobile.isSelected()) targets += "Mobile ";
		
		if(targets.equals("")) targets = "<none>";
		
		allTargets.setText("Target List: " +targets);
	}
}


