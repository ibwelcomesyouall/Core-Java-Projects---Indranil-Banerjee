package org.indranil.learning.topicwise.JavaFX;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.KeyCombination;
import javafx.event.*;
import javafx.geometry.Pos;

public class MenuDemoFinal extends Application {
		
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
		CheckMenuItem red = new CheckMenuItem("Red");
		CheckMenuItem green = new CheckMenuItem("Green");
		CheckMenuItem blue = new CheckMenuItem("Blue");
		colorsMenu.getItems().addAll(red, green, blue);
		optionsMenu.getItems().add(colorsMenu);
		
		green.setSelected(true);
		
		Menu priorityMenu = new Menu("Priority");
		RadioMenuItem high = new RadioMenuItem("High");
		RadioMenuItem low = new RadioMenuItem("Low");
		
		ToggleGroup tg = new ToggleGroup();
		high.setToggleGroup(tg);
		low.setToggleGroup(tg);
		
		high.setSelected(true);
		
		priorityMenu.getItems().addAll(high, low);
		optionsMenu.getItems().add(priorityMenu);
		
		optionsMenu.getItems().add(new SeparatorMenuItem());
		
		MenuItem reset = new MenuItem("Reset");
		optionsMenu.getItems().add(reset);
		
		mb.getMenus().add(optionsMenu);
		
		Menu helpMenu = new Menu("Help");
		MenuItem about = new MenuItem("About");

		helpMenu.getItems().add(about);
		
		mb.getMenus().add(helpMenu);
		
		//Context Menu
		MenuItem cut = new MenuItem("Cut");
		MenuItem copy = new MenuItem("Copy");
		MenuItem paste = new MenuItem("Paste");
		
		final ContextMenu editMenu = new ContextMenu(cut, copy, paste);
		
		TextField tf = new TextField();
		tf.setPrefColumnCount(20);
		tf.setContextMenu(editMenu);
		
		Button btnSet = new Button("Set BreakPoint", new ImageView("Artifacts//setBP.png"));
		Button btnClear = new Button("Clear BreakPoint", new ImageView("Artifacts//clearBP.png"));
		Button btnResume = new Button("Resume BreakPoint", new ImageView("Artifacts//resumeBP.png"));
		
		btnSet.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
		btnClear.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
		btnResume.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
		
		btnSet.setTooltip(new Tooltip("Set a breakpoint"));
		btnClear.setTooltip(new Tooltip("Clear a breakpoint"));
		btnResume.setTooltip(new Tooltip("Resume a breakpoint"));
		
		ToolBar tbDebug = new ToolBar(btnSet, btnClear, btnResume);
		
		EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				String name = ((MenuItem)ae.getTarget()).getText();
				
				if(name.equals("Exit")) Platform.exit();
				
				response.setText(name + " selected");
			}
		};
		
		EventHandler<ActionEvent> btnHandler = new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {				
				response.setText(((Button)ae.getTarget()).getText());
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
		
		cut.setOnAction(MEHandler);
		copy.setOnAction(MEHandler);
		paste.setOnAction(MEHandler);
		
		btnSet.setOnAction(btnHandler);
		btnClear.setOnAction(btnHandler);
		btnResume.setOnAction(btnHandler);
		
		rootNode.setTop(mb);
		FlowPane fpRoot = new FlowPane( 10, 10);
		fpRoot.setAlignment(Pos.CENTER);
		fpRoot.getChildren().addAll(response, tf);
		rootNode.setCenter(fpRoot);
		rootNode.setBottom(tbDebug);
		
		rootNode.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {

			@Override
			public void handle(ContextMenuEvent ae) {
				editMenu.show(rootNode, ae.getScreenX(), ae.getScreenY());
				
			}
		});
		
		myStage.show();
	}
}


