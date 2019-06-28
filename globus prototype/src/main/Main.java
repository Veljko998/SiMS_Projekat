package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Main extends Application {
	
	

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane border = new BorderPane();
		HBox hbox = addHBox();
		border.setTop(hbox);
		
		stage.setMaximized(true);
		stage.setScene(new Scene(border));
		stage.show();
		
		
	}
	
	public HBox addHBox() {
		final Pane leftSpacer = new Pane();
	    HBox.setHgrow(leftSpacer, Priority.SOMETIMES);
	
	    final Pane rightSpacer = new Pane();
	    HBox.setHgrow(rightSpacer, Priority.SOMETIMES);
		
	    HBox hbox = new HBox();
	    hbox.setPadding(new Insets(15, 12, 15, 12));
	    hbox.setSpacing(10);
	    hbox.setStyle("-fx-background-color: #336699;");

	    Button button1 = new Button("Button1");
	    button1.setPrefSize(100, 20);

	    Button button2 = new Button("Button2");
	    button2.setPrefSize(100, 20);
	    
	    Button button3 = new Button("Button3");
	    button3.setPrefSize(100, 20);
	    
	    Button button4 = new Button("Button4");
	    button4.setPrefSize(100, 20);
	    
	    Button button5 = new Button("Button5");
	    button5.setPrefSize(100, 20);
	    
	    Button button6 = new Button("Button6");
	    button6.setPrefSize(100, 20);
	    
	    hbox.getChildren().addAll(leftSpacer, button1, button2, button3, button4, button5, button6,  rightSpacer);

	    return hbox;
	}
	
	

}
