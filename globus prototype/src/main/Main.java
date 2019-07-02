package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
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
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
	//Dodajem novi komentar
	Stage window;
	Scene scene1, scene2, scene3;
	BorderPane border1, border2;
	GridPane grid1, grid2;
	HBox hbox1;
	VBox vbox1, vbox2;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// get screensize of monitor
		Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
		
		window = primaryStage;
		
		border1 = new BorderPane();
		hbox1 = addHBox();
		border1.setTop(hbox1);
		
		grid1 = new GridPane();
		grid1.setAlignment(Pos.CENTER);
		vbox1 = addVBoxLogIn();
		grid1.add(vbox1, 0, 0);
		grid1.setStyle("-fx-background-color: #A9A9A9;");
		
		grid2 = new GridPane();
		grid2.setAlignment(Pos.CENTER);
		vbox2 = addVBoxSignIn();
		grid2.add(vbox2, 0, 0);
		grid2.setStyle("-fx-background-color: #ADFF2F;");
		
		scene1 = new Scene(border1, screenSize.getWidth(), screenSize.getHeight());
		scene2 = new Scene(grid1, screenSize.getWidth(), screenSize.getHeight());
		scene3 = new Scene(grid2, screenSize.getWidth(), screenSize.getHeight());
		window.setMaximized(true);
		window.setScene(scene1);
		window.show();
		
	}
	
	private VBox addVBoxLogIn() {
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(15, 12, 15, 12));
		vbox.setSpacing(10);
		vbox.setStyle("-fx-background-color: #336699;");
		vbox.setAlignment(Pos.CENTER);
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(10);
		grid.setVgap(8);
		
		Label usernameLabel = new Label("Username: ");
		
		TextField usernameInput = new TextField();
		usernameInput.setPromptText("username");
		
		Label passwordLabel = new Label("Password: ");
		
		TextField passwordInput = new TextField();
		passwordInput.setPromptText("password");
		
		HBox hbButtons = new HBox();
	    hbButtons.setSpacing(10.0);
	    
	    Button btnSubmit = new Button("Submit"); // Sign in button
	    Button btnClear = new Button("Clear");
	    Button btnExit = new Button("Exit");
	    btnSubmit.setStyle("-fx-font-size: 12pt;");
	    btnClear.setStyle("-fx-font-size: 10pt;");
		
	    hbButtons.getChildren().addAll(btnSubmit, btnClear, btnExit);
	    
	    grid.add(usernameLabel, 0, 0);
	    grid.add(usernameInput, 1, 0);
	    grid.add(passwordLabel, 0, 1);
	    grid.add(passwordInput, 1, 1);
	    grid.add(hbButtons, 0, 2, 2, 1);
	    
	    vbox.getChildren().addAll(grid);
	    
	    btnSubmit.setOnAction(e -> {
	    	window.setScene(scene1);
	    });
	    
	    btnExit.setOnAction(e -> {
	    	window.setScene(scene1);
	    });
	    
		return vbox;
	}

	private VBox addVBoxSignIn() {
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(15, 12, 15, 12));
		vbox.setSpacing(10);
		vbox.setStyle("-fx-background-color: #336699;");
		vbox.setAlignment(Pos.CENTER);
		
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
		
		//Birthday label
		Label bDayLabel = new Label("Birthday: ");
		GridPane.setConstraints(bDayLabel, 0, 2);
		
		//Birthday input
		TextField bDayInput = new TextField();
		bDayInput.setPromptText("dd.mm.yyyy.");
		GridPane.setConstraints(bDayInput, 1, 2);
		
		//Username label
		Label usernameLabel = new Label("Username: ");
		GridPane.setConstraints(usernameLabel, 0, 3); //top left of the grid
		
		//Username input
		TextField usernameInput = new TextField();
		usernameInput.setPromptText("username");
		GridPane.setConstraints(usernameInput, 1, 3);
		
		//Password label
		Label passwordLabel = new Label("Password: ");
		GridPane.setConstraints(passwordLabel, 0,4);
		
		//Password input
		TextField passwordInput = new TextField();
		passwordInput.setPromptText("password");
		GridPane.setConstraints(passwordInput, 1, 4);
		
		//Mail label
		Label mailLabel = new Label("Email address: ");
		GridPane.setConstraints(mailLabel, 0, 5);
		
		//Mail input
		TextField mailInput = new TextField();
		mailInput.setPromptText("email");
		GridPane.setConstraints(mailInput, 1, 5);
		
		Button signInButton = new Button("Sign in");
		GridPane.setConstraints(signInButton, 1, 6);
		
		Button quitButton = new Button("Quit");
		GridPane.setConstraints(quitButton, 2, 6);
		
		grid.getChildren().addAll(nameLabel, nameInput, surnameLabel, surnameInput, bDayLabel, bDayInput,
				usernameLabel, usernameInput, passwordLabel, passwordInput, mailLabel, mailInput, signInButton, quitButton);
	    
		quitButton.setOnAction(e -> window.setScene(scene1));
		
		signInButton.setOnAction(e -> {
			boolean correct = checkUserInputs(nameInput.getText(), surnameInput.getText(), bDayInput.getText(),
					usernameInput.getText());
			if (correct) {
				createRegisteredUser();
				
				window.setScene(scene1);//Pri zavrsetku ide na scenu 1, ali ce naknadno ici na svoju scenu.
			}else {
				nameInput.clear(); surnameInput.clear(); bDayInput.clear();
				usernameInput.clear(); passwordInput.clear(); mailInput.clear();
			}
		});
		
	    vbox.getChildren().addAll(grid);
	    
		return vbox;
	}

	private void createRegisteredUser() {
		// TODO Auto-generated method stub
		
	}

	private Boolean checkUserInputs(String name, String surname, String bDay, String username) { 
		//Returns true if all methods in if statement are true.
		if (checkName(name) && checkName(surname) && checkBDay(bDay) && checkUsername(username)) {
			return true;
		}
		return false;
	}
	
	boolean checkName(String name) {
		if (name.equals(null) || name.equals("")) {
			System.out.println("Nista nismo uneli");
			return false;
		}
		
		for (int i = 0; i < name.length(); i++) {
			try {
				Integer.parseInt(String.valueOf(name.charAt(i)));
				System.out.println("Broj");
				return false;
			} catch (Exception e) {
				continue;
			}
		}
		System.out.println("Nema broja.");
		return true;
	}
	
	boolean checkBDay(String bday) {
		
		return false;
	}
	
	boolean checkUsername(String username) {
		
		return false;
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
	    
	    buttonSignIn.setOnAction(e -> {
	    	window.setScene(scene3);
	    });
	    
	    hbox.getChildren().addAll(leftSpacer, button1, button2, button3, button4, button5, button6,  rightSpacer, buttonLogIn, buttonSignIn);

	    return hbox;
	}
	
	

}
