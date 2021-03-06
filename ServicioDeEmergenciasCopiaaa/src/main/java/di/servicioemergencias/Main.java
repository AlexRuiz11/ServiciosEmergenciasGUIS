package di.servicioemergencias;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			Pane root = (Pane) FXMLLoader.load(getClass().getResource("/vistas/CrearServicios.fxml"));

			Scene scene = new Scene(root, 600, 400);
		
			primaryStage.setScene(scene);
			primaryStage.show();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
