package Stuff;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import java.util.*;

public class Main extends Application {

	public static void main(String[] args) {
		List = new ArrayList<Person>(10);
		
		List.add(new Person("FN1", "LN1", "001"));
		List.add(new Person("FN2", "LN2", "002"));
		List.add(new Person("FN3", "LN3", "003"));
		
		Application.launch(args);
	}
	public static ArrayList<Person> List;
	//public static Person[] List;

		//@Override
		public void start(Stage stage){
			
			//Text fields go here
			TextField tbFN = new TextField("First Name");
			tbFN.setLayoutX(0);
			tbFN.setLayoutY(0);
			//tbFN.setAlignment(Pos.BASELINE_RIGHT);
			TextField tbLN = new TextField("Last Name");
			tbLN.setLayoutX(0);
			tbLN.setLayoutY(30);
			
			TextField tbID = new TextField("ID");
			tbID.setLayoutX(0);
			tbID.setLayoutY(60);
			
			
			//Buttons go here
			Button search = new Button("Search");
			search.setLayoutX(100);
			search.setLayoutY(90);
			search.setOnAction((ActionEvent e ) -> {
				try{
				//call search function
				int index =  Person.SearchById(List, tbID.getText());
				Person.Display(List.get(index));
				}
				catch (Exception e1){
					Alert exception = new Alert(AlertType.INFORMATION);
					exception.setTitle("OOPS!");
					exception.setHeaderText(null);
					exception.setContentText("Something went horribly wrong.");

					exception.showAndWait();
				}
			});
			
			Button store = new Button("Store");
			store.setLayoutX(0);
			store.setLayoutY(90);
			store.setOnAction((ActionEvent e ) -> {
				List.add(new Person(tbFN.getText(), tbLN.getText(), tbID.getText()));
				//System.out.println(List.get(0).FirstName + " " + List.get(0).LastName + " " + List.get(0).ID);
				//display alert box showing the entry.
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Successful Entry");
				alert.setHeaderText(null);
				List.get(0);
				List.get(0);
				List.get(0);
				alert.setContentText(Person.FirstName + " " + Person.LastName + " " + Person.ID);

				alert.showAndWait();
			});
			
			Pane pane = new Pane();
			pane.getChildren().addAll(search, store, tbFN, tbLN, tbID);
			Scene scene = new Scene(pane, 175, 120);
			stage.setResizable(false);
			stage.setScene(scene);
			stage.show();
			stage.setTitle("DBMS");
			//System.out.println("Hello World");
		}
}
