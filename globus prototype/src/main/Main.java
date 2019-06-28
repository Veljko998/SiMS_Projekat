package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;
	Scene scene1, scene2;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		BorderPane border = new BorderPane();
		HBox hbox = addHBox();
		VBox vbox = addVBox();
		border.setTop(hbox);
		
		window.setMaximized(true);
		scene1 = new Scene(border);
		scene2 = new Scene(vbox);
		window.setScene(scene1);
		window.show();
		
	}
	
	private VBox addVBox() {
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(15, 12, 15, 12));
		vbox.setSpacing(10);
		vbox.setStyle("-fx-background-color: #336699;");
		
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(10);
		grid.setVgap(8);
		
		//Name label
		Label nameLabel = new Label("Name: ");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		//Name input
		TextField nameInput = new TextField();
		nameInput.setPromptText("name");
		GridPane.setConstraints(nameInput, 1, 0);
		
		//Surname label
		Label surnameLabel = new Label("Surname: ");
		GridPane.setConstraints(surnameLabel, 0, 1);
		
		//Surname input
		TextField surnameInput = new TextField();
		surnameInput.setPromptText("surname");
		GridPane.setConstraints(surnameInput, 1, 1);
		
		//Username label
		Label usernameLabel = new Label("Username: ");
		GridPane.setConstraints(usernameLabel, 0, 2); //top left of the grid
		
		//Username input
		TextField usernameInput = new TextField();
		usernameInput.setPromptText("username");
		GridPane.setConstraints(usernameInput, 1, 2);
		
		//Pasword label
		Label passwordLabel = new Label("Password: ");
		GridPane.setConstraints(passwordLabel, 0, 3);
		
		TextField passwordInput = new TextField();
		passwordInput.setPromptText("password");
		GridPane.setConstraints(passwordInput, 1, 3);
		
		Button loginButton = new Button("Log in");
		GridPane.setConstraints(loginButton, 1, 4);
		
		grid.getChildren().addAll(nameLabel, nameInput, surnameLabel, surnameInput, usernameLabel, usernameInput, passwordLabel, passwordInput, loginButton);
	    
	    
	    
	    loginButton.setOnAction(e -> {
	    	window.setScene(scene1);
	    });
		
	    vbox.getChildren().addAll(grid);
	    
		return vbox;
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
	    
	    Button buttonLogIn = new Button("Log in");
	    buttonLogIn.setPrefSize(100, 20);
	    
	    buttonLogIn.setOnAction(e -> {
	    	window.setScene(scene2);
	    });
	    
	    Button buttonSignIn = new Button("Sign in");
	    buttonSignIn.setPrefSize(100, 20);
	    
	    hbox.getChildren().addAll(leftSpacer, button1, button2, button3, button4, button5, button6,  rightSpacer, buttonLogIn, buttonSignIn);

	    return hbox;
	}
	
	

}
