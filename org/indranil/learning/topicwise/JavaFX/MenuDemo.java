package org.indranil.learning.topicwise.JavaFX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.event.*;

public class MenuDemo extends Application {
		
	Label response;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage myStage) {

		myStage.setTitle("Demonstrate Menus");
		
		BorderPane rootNode = new BorderPane();
		
		Scene myScene = new Scene(rootNode, 300, 300);
		myStage.setScene(myScene);
		
		response = new Label("Menu Demo");
		
		MenuBar mb = new MenuBar();
		
		//The below is without Mnemonics
		//Menu fileMenu = new Menu("File");
		
		Menu fileMenu = new Menu("_File");
		MenuItem open = new MenuItem("Open");
		MenuItem close = new MenuItem("Close");
		MenuItem save = new MenuItem("Save");
		MenuItem exit = new MenuItem("Exit");
		open.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
		close.setAccelerator(KeyCombination.keyCombination("shortcut+C"));
		save.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
		exit.setAccelerator(KeyCombination.keyCombination("shortcut+E"));
		fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(), exit);
		
		mb.getMenus().add(fileMenu);
		
		Menu optionsMenu = new Menu("Options");
		
		Menu colorsMenu = new Menu("Colors");
		MenuItem red = new MenuItem("Red");
		MenuItem green = new MenuItem("Green");
		MenuItem blue = new MenuItem("Blue");
		colorsMenu.getItems().addAll(red, green, blue);
		optionsMenu.getItems().add(colorsMenu);
		
		Menu priorityMenu = new Menu("Priority");
		MenuItem high = new MenuItem("High");
		MenuItem low = new MenuItem("Low");
		priorityMenu.getItems().addAll(high, low);
		optionsMenu.getItems().add(priorityMenu);
		
		optionsMenu.getItems().add(new SeparatorMenuItem());
		
		MenuItem reset = new MenuItem("Reset");
		optionsMenu.getItems().add(reset);
		
		mb.getMenus().add(optionsMenu);
		
		Menu helpMenu = new Menu("Help");
		ImageView aboutIV = new ImageView("Artifacts\\aboutIcon.png");
		MenuItem about = new MenuItem("About", aboutIV);

		helpMenu.getItems().add(about);
		
		mb.getMenus().add(helpMenu);
		
		EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				String name = ((MenuItem)ae.getTarget()).getText();
				
				if(name.equals("Exit")) Platform.exit();
				
				response.setText(name + " selected");
			}
		};
		
		open.setOnAction(MEHandler);
		close.setOnAction(MEHandler);
		save.setOnAction(MEHandler);
		exit.setOnAction(MEHandler);
		red.setOnAction(MEHandler);
		green.setOnAction(MEHandler);
		blue.setOnAction(MEHandler);
		high.setOnAction(MEHandler);
		low.setOnAction(MEHandler);
		reset.setOnAction(MEHandler);
		about.setOnAction(MEHandler);
		
		rootNode.setTop(mb);
		rootNode.setCenter(response);
		
		myStage.show();
	}
}


