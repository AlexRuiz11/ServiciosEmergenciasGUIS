package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import ServiciosDeEmergenciasDAO.DAO;
import ServiciosDeEmergenciasDAO.ServicioDeEmergenciasDAO;
import di.servicioemergencias.modelos.Ambulancia;
import di.servicioemergencias.modelos.Bombero;
import di.servicioemergencias.modelos.Policia;
import di.servicioemergencias.modelos.Trabajador;
import di.servicioemergencias.modelos.UnidadEmergencias;
import di.servicioemergencias.modelos.UnidadEmergenciasBuilder;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class CrearServiciosController  implements Initializable{

	
	public static DAO<UnidadEmergencias> UnidadesActivas = new ServicioDeEmergenciasDAO();


    @FXML
    private RadioButton RadioZaragoza;

    @FXML
    private ToggleGroup Localidad;

    @FXML
    private RadioButton RadioHuesca;

    @FXML
    private RadioButton RadioTeruel;

    @FXML
    private RadioButton RadioPolicia;

    @FXML
    private ToggleGroup Equipos;

    @FXML
    private RadioButton RadioBomberos;

    @FXML
    private RadioButton RadioAmbulancias;

    @FXML
    private Button BtonCrear;
	
	
    @FXML
    private Button llamadas;
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	public void crear() throws Exception{
		Trabajador uno = new Trabajador(1, "Manolo");
		Trabajador dos = new Trabajador(2, "Pepe");
		Trabajador tres = new Trabajador(3, "Benito");
		Trabajador cuatro = new Trabajador(4, "Laura");
		Trabajador cinco = new Trabajador(5, "Victoria");
		Trabajador seis = new Trabajador(6, "Rosa");
		Trabajador siete = new Trabajador(7, "Miguel");
		
	if(RadioPolicia.isSelected()) {
		
		if(RadioZaragoza.isSelected()) {
			Policia g = UnidadEmergenciasBuilder.crearUnidadPolicia(7, Arrays.asList(seis, siete), RadioZaragoza.getText());
			UnidadesActivas.save(g);
			//System.out.println(g.toString());
			
		}
		if(RadioHuesca.isSelected()) {
			
			Policia g = UnidadEmergenciasBuilder.crearUnidadPolicia(7, Arrays.asList(seis, siete), RadioHuesca.getText());
			UnidadesActivas.save(g);
		//	System.out.println(g.toString());
		}
		if(RadioTeruel.isSelected()) {
			
			Policia g = UnidadEmergenciasBuilder.crearUnidadPolicia(7, Arrays.asList(seis, siete), RadioTeruel.getText());
			UnidadesActivas.save(g);
		//	System.out.println(g.toString());
			
		}
	//	System.out.println(UnidadesActivas.getAll().toString());

		
	
		}
		
if(RadioBomberos.isSelected()) {
		
	if(RadioZaragoza.isSelected()) {
		Bombero d = UnidadEmergenciasBuilder.crearUnidadBomberos(4, Arrays.asList(uno, dos, tres, cuatro, cinco), RadioZaragoza.getText());
		UnidadesActivas.save(d);
		//	System.out.println(d.toString());
		
	}
	if(RadioHuesca.isSelected()) {
		
		Bombero d = UnidadEmergenciasBuilder.crearUnidadBomberos(4, Arrays.asList(uno, dos, tres, cuatro, cinco), RadioHuesca.getText());
		UnidadesActivas.save(d);
		//	System.out.println(d.toString());
	}
	if(RadioTeruel.isSelected()) {
		
		Bombero d = UnidadEmergenciasBuilder.crearUnidadBomberos(4, Arrays.asList(uno, dos, tres, cuatro, cinco), RadioTeruel.getText());
		UnidadesActivas.save(d);
		//	System.out.println(d.toString());
		
	}
	//	System.out.println(UnidadesActivas.getAll().toString());
			
		}

if(RadioAmbulancias.isSelected()) {
	
	if(RadioZaragoza.isSelected()) {
		Ambulancia a = UnidadEmergenciasBuilder.crearUnidadAmbulancia(1, Arrays.asList(uno, dos, tres),  RadioZaragoza.getText());
		UnidadesActivas.save(a);
		//System.out.println(a.toString());
		
	}
	if(RadioHuesca.isSelected()) {
		
		Ambulancia a = UnidadEmergenciasBuilder.crearUnidadAmbulancia(1, Arrays.asList(uno, dos, tres),  RadioHuesca.getText());
		UnidadesActivas.save(a);
		//System.out.println(a.toString());
	}
	if(RadioTeruel.isSelected()) {
		
		Ambulancia a = UnidadEmergenciasBuilder.crearUnidadAmbulancia(1, Arrays.asList(uno, dos, tres),  RadioTeruel.getText());
		UnidadesActivas.save(a);
		//System.out.println(a.toString());
		
	}
	//System.out.println(UnidadesActivas.getAll().toString());
		
	}




		
	}
	
	
	public void llamadas() throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/LlamarEmergencia.fxml"));
		
		Parent root = loader.load();
		
		
		LlarmarController controller = loader.getController();
		
		Scene scene = new Scene(root);
		Stage stage = new Stage();

		stage.setScene(scene);
		
		stage.show();
		
		
		Stage myStage = (Stage) this.BtonCrear.getScene().getWindow();
		
		
		myStage.close();
		
	}
	
	
	
	
	
	

}
