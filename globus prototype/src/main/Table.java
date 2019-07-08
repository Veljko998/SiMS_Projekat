package main;

import java.util.ArrayList;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Narudzbina;

public class Table {
	
	public static void display(ArrayList<Narudzbina> orders) {
		Stage stage = new Stage();
		TableView<Narudzbina> table = new TableView<Narudzbina>();
		 
	 
	      TableColumn<Narudzbina, String> emailCol = new TableColumn<Narudzbina, String>("Email");
	 
	      TableColumn<Narudzbina, String> fullNameCol = new TableColumn<Narudzbina, String>("Full Name");
	 
	      TableColumn<Narudzbina, String> firstNameCol = new TableColumn<Narudzbina, String>("First Name");
	 
	      TableColumn<Narudzbina, String> lastNameCol = new TableColumn<Narudzbina, String>("Last Name");
	      
	      TableColumn<Narudzbina, String> idCol = new TableColumn<Narudzbina, String>("ID");
	      
	      TableColumn<Narudzbina, Double> priceCol = new TableColumn<Narudzbina, Double>("Amount");
	      
	      TableColumn<Narudzbina, Date> dateCol = new TableColumn<Narudzbina, Date>("Order date");
	      
	      TableColumn<Narudzbina, Date> deliveryDateCol = new TableColumn<Narudzbina, Date>("Delivery date");
	      
	      TableColumn<Narudzbina, String> deliveryAddressCol = new TableColumn<Narudzbina, String>("Delivery address");
	      
	      TableColumn<Narudzbina, Boolean> activeCol = new TableColumn<Narudzbina, Boolean>("Is paid");
	 
	      fullNameCol.getColumns().addAll(firstNameCol, lastNameCol);
	 
	      emailCol.setCellValueFactory(new PropertyValueFactory<>("mejlKupca"));
	      firstNameCol.setCellValueFactory(new PropertyValueFactory<>("imeKupca"));
	      lastNameCol.setCellValueFactory(new PropertyValueFactory<>("prezimeKupca"));
	      idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
	      priceCol.setCellValueFactory(new PropertyValueFactory<>("ukupnaCena"));
	      deliveryAddressCol.setCellValueFactory(new PropertyValueFactory<>("adresaIsporuke"));
	      activeCol.setCellValueFactory(new PropertyValueFactory<>("placena"));
	      dateCol.setCellValueFactory(new PropertyValueFactory<>("datumPorudzbine"));
	      deliveryDateCol.setCellValueFactory(new PropertyValueFactory<>("ocekivanaIsporuka"));
	      
	      lastNameCol.setSortable(false);
	 
	      // Display row data
	      ObservableList<Narudzbina> list = getUserList(orders);
	      table.setItems(list);
	 
	      table.getColumns().addAll(idCol, priceCol, emailCol, fullNameCol, dateCol, deliveryDateCol, 
	    		  deliveryAddressCol, activeCol);
	 
	      StackPane root = new StackPane();
	      root.setPadding(new Insets(5));
	      root.getChildren().add(table);
	 
	      stage.setTitle("TableView (o7planning.org)");
	 
	      Scene scene = new Scene(root, 900, 400);
	      stage.setScene(scene);
	      stage.show();
	}

	private static ObservableList<Narudzbina> getUserList(ArrayList<Narudzbina> orders) {
//		Narudzbina nn = new Narudzbina("Veljko", "Plecas", "mejl@gmail");
		
		ObservableList<Narudzbina> list = FXCollections.observableArrayList();
		for (Narudzbina n : orders) {
			list.add(n);
		}
		return list;
	}

}
