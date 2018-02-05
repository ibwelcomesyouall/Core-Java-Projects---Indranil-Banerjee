package org.indranil.learning.topicwise.JavaFX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;


public class TreeViewDemo extends Application {
	
	Label response;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage myStage) {

		myStage.setTitle("Demontrate a TreeView");
		
		FlowPane rootNode = new FlowPane(10,10);
		
		rootNode.setAlignment(Pos.CENTER);
		
		Scene myScene = new Scene(rootNode, 310,460);
		
		myStage.setScene(myScene);
				
		response = new Label("No Selection");
		TreeItem<String> tiRoot = new TreeItem<String>("Food");
		
		TreeItem<String> tiFruit = new TreeItem<String>("Fruit");
		
		TreeItem<String> tiApples = new TreeItem<String>("Apples");
		
		tiApples.getChildren().add(new TreeItem<String>("Fuji"));
		tiApples.getChildren().add(new TreeItem<String>("Wineaps"));
		tiApples.getChildren().add(new TreeItem<String>("Jonathan"));
		
		
		tiFruit.getChildren().add(tiApples);
		tiFruit.getChildren().add(new TreeItem<String>("Pears"));
		tiFruit.getChildren().add(new TreeItem<String>("Oranges"));
		
		tiRoot.getChildren().add(tiFruit);
		
		TreeItem<String> tiVegetables = new TreeItem<String>("Vegetables");
		tiVegetables.getChildren().add(new TreeItem<String>("Corn"));
		tiVegetables.getChildren().add(new TreeItem<String>("Peas"));
		tiVegetables.getChildren().add(new TreeItem<String>("Broccoli"));
		tiVegetables.getChildren().add(new TreeItem<String>("Beans"));
		tiRoot.getChildren().add(tiVegetables);
		
		TreeItem<String> tiNuts = new TreeItem<String>("Nuts");
		tiNuts.getChildren().add(new TreeItem<String>("Walnuts"));
		tiNuts.getChildren().add(new TreeItem<String>("Peanuts"));
		tiNuts.getChildren().add(new TreeItem<String>("Pecans"));
		tiRoot.getChildren().add(tiNuts);
		
		TreeView<String> tvFood = new TreeView<String>(tiRoot);
		
		MultipleSelectionModel<TreeItem<String>> tvSelModel = tvFood.getSelectionModel();
		tvSelModel.selectedItemProperty().addListener(new ChangeListener<TreeItem<String>>() {

			@Override
			public void changed(ObservableValue<? extends TreeItem<String>> observable, TreeItem<String> oldVal,
					TreeItem<String> newVal) {
				if(newVal != null) {
					String path = newVal.getValue();
					TreeItem<String> tmp = newVal.getParent();
					while(tmp!=null) {
						path = tmp.getValue() + "->" +path;
						tmp = tmp.getParent();
					}
					
					response.setText("Selection is " + newVal.getValue() + 
							"\nComplete path is " + path);
				}
				
			}
		});
		
				
		rootNode.getChildren().addAll(tvFood,response);
		
		myStage.show();
		
	}
}