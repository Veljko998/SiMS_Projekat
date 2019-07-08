package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Korpa;
import model.Narudzbina;
import model.Zavrsena;

public class Order {
	
	public static void display(String title, String message, ArrayList<Narudzbina> orders) throws IOException {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setWidth(900);
		window.setHeight(700);
		window.setResizable(false);
		
		BorderPane border = new BorderPane();
		GridPane gridpane = new GridPane();
		gridpane = addGridPanePictures();
		VBox vbox = new VBox();
		vbox = addVBox(window, orders);
		
		border.setTop(gridpane);
		border.setCenter(vbox);
		
		Scene scene = new Scene(border);
		window.setScene(scene);
		window.show();
	}

	private static VBox addVBox(Stage window, ArrayList<Narudzbina> orders) {
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(15, 12, 15, 12));
		vbox.setSpacing(10);
		vbox.setStyle("-fx-background-color: #336699;");
		vbox.setAlignment(Pos.CENTER);
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(10);
		grid.setVgap(8);
		
		double price = 1200.00;
		
		//Name label
		Label nameLabel = new Label("Name: ");
		
		//Name input
		TextField nameInput = new TextField();
		nameInput.setPromptText("name");
		
		//Surname label
		Label surnameLabel = new Label("Surname: ");
		
		//Surname input
		TextField surnameInput = new TextField();
		surnameInput.setPromptText("surname");
		
		//Mail label
		Label mailLabel = new Label("Email address: ");
		
		//Mail input
		TextField mailInput = new TextField();
		mailInput.setPromptText("email");
		
		//Deliver address label
		Label addressLabel = new Label("Deliver address: ");
		
		//Deliver addres input
		TextField addressInput = new TextField();
		addressInput.setPromptText("Deliver address");
		
		Label numOfProductsLabel = new Label("Number of products: ");
		
		TextField numOfProductsInput = new TextField();
		numOfProductsInput.setText("0");
		
		Button confrimNumOfProducts = new Button("Apply");
		
		Text amount = new Text();
		amount.setText(price*Integer.parseInt(numOfProductsInput.getText()) + "");
		
		HBox hbButtons = new HBox();
	    hbButtons.setSpacing(10.0);
	    
	    Button confrim = new Button("Confrim"); // Sign in button
	    Button btnExit = new Button("Exit");
	    
	    btnExit.setOnAction(e -> window.close());
	    confrimNumOfProducts.setOnAction(e ->{
	    	amount.setText("=  " + price*Integer.parseInt(numOfProductsInput.getText()) + "");
	    });
	    confrim.setStyle("-fx-font-size: 12pt;");
	    
	    confrim.setOnAction(e -> {
	    	double price2 = price*Integer.parseInt(numOfProductsInput.getText());
	    	createOrder(nameInput.getText(), surnameInput.getText(), mailInput.getText(), addressInput.getText(), price2, orders);
	    	window.close();
//	    	nameInput.clear(); surnameInput.clear(); mailInput.clear(); addressInput.clear(); 
//	    	amount.setText("0"); numOfProductsInput.clear(); 
	    });
		
	    hbButtons.getChildren().addAll(confrim, btnExit);
	    
	    grid.add(nameLabel, 0, 0);
	    grid.add(nameInput, 1, 0);
	    grid.add(surnameLabel, 0, 1);
	    grid.add(surnameInput, 1, 1);
	    grid.add(mailLabel, 0, 2);
	    grid.add(mailInput, 1, 2);
	    grid.add(addressLabel, 0, 3);
	    grid.add(addressInput, 1, 3);
	    grid.add(numOfProductsLabel, 10, 0);
	    grid.add(numOfProductsInput, 11, 0);
	    grid.add(confrimNumOfProducts, 12, 0);
	    grid.add(amount, 13, 0);
	    grid.add(hbButtons, 0, 4, 2, 1);
	    
	    vbox.getChildren().addAll(grid);
		
		return vbox;
	}

	private static void createOrder(String name, String surname, String mail, String address, double price2, ArrayList<Narudzbina> orders) {
		Narudzbina n = new Narudzbina();
		n.setImeKupca(name);
		n.setPrezimeKupca(surname);
		n.setMejlKupca(mail);
		n.setAdresaIsporuke(address);
		n.setId((orders.size()+1)+"");
		n.setUkupnaCena(price2);
		n.setPlacena(false);
		n.poslatZahtev();
		orders.add(n);
	}

	private static GridPane addGridPanePictures() throws IOException {
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setHgap(10);
		grid.setVgap(10);
		
		FileInputStream input = new FileInputStream("protein.jpg");
        Image image = new Image(input);
        int s = 120;
        ImageView iv1 = new ImageView(image);
        iv1.setFitHeight(s+110); iv1.setFitWidth(s+110);
        ImageView iv2 = new ImageView(image);
        iv2.setFitHeight(s); iv2.setFitWidth(s);
        ImageView iv3 = new ImageView(image);
        iv3.setFitHeight(s); iv3.setFitWidth(s);
        ImageView iv4 = new ImageView(image);
        iv4.setFitHeight(s); iv4.setFitWidth(s);
        
        Text nameOfProduct = new Text();
        nameOfProduct.setText("Protein 500g");
        nameOfProduct.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 33));
        nameOfProduct.setX(50); 
        nameOfProduct.setY(130);     
        nameOfProduct.setFill(Color.BROWN); 
        nameOfProduct.setStrokeWidth(2); 
        nameOfProduct.setStroke(Color.BLUE);
        
        Text describe = new Text();
        describe.setText("Ovde ce" + "\n" + "ici opis...");
        
        grid.add(iv1, 0, 0);
        grid.add(iv2, 1, 0);
        grid.add(iv3, 2, 0);
        grid.add(iv4, 3, 0);
        grid.add(describe, 4, 0);
        grid.add(nameOfProduct, 0,  1);
		
		return grid;
	}
	
}
