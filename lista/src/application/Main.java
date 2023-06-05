package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		ListView<String> lista = new ListView<String>();
		
		lista.getItems().add("kpop");
		lista.getItems().add("pop");
		lista.getItems().add("salsa");
		lista.getItems().add("bachata");
		lista.getItems().add("regue");
		lista.getItems().add("Vallenato");
		
		Label label = new Label("¿que genero de musica escuchas?");
		Button bt = new Button("OK");
		
		
		HBox root = new HBox ();
		root.getChildren().addAll(label, lista, bt);
		
		Scene scene = new Scene (root, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ListView");
		primaryStage.show();

	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
