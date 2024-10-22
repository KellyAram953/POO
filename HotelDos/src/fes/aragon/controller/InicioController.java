package fes.aragon.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import fes.aragon.modelo.Hotel;
import fes.aragon.modelo.Hoteles;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class InicioController implements Initializable{

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnModificar;

    @FXML
    private Button btnNuevo;

    @FXML
    private Button btnSalir;

    @FXML
    private TableColumn<Hotel, String> clmCorreo;

    @FXML
    private TableColumn<Hotel, String> clmDireccion;

    @FXML
    private TableColumn<Hotel, String> clmGerente;

    @FXML
    private TableColumn<Hotel, String> clmNombre;

    @FXML
    private TableColumn<Hotel, String> clmTelefono;

    @FXML
    private TableView<Hotel> tblTabla;

    @FXML
    void eliminarHotel(ActionEvent event) {

    }

    @FXML
    void modificarHotel(ActionEvent event) {

    }

    @FXML
    void nuevoHotel(ActionEvent event) {
    	Hoteles.getInstancia().setIndice(-1);
    	Hoteles.getInstancia().setModificarHotel(false);
    	Hoteles.getInstancia().setIndeceHabitacion(-1);
    	Hoteles.getInstancia().getGrupoHoteles().add(new Hotel());
    	this.nuevaVentana("Hotel");
    }

    @FXML
    void salir(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		this.clmNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.clmDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
		this.clmCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
		this.clmTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
		this.clmGerente.setCellValueFactory(new PropertyValueFactory<>("gerente"));
		this.tblTabla.setItems(Hoteles.getInstancia().getGrupoHoteles());
	}
	
	private void nuevaVentana (String archivo) {
    	try {
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("/fes/aragon/fxml/"+archivo+".fxml"));
			Scene scene = new Scene(root);
			Stage escenario = new Stage();
			escenario.setScene(scene);
			escenario.initStyle(StageStyle.UNDECORATED);
			escenario.initModality(Modality.APPLICATION_MODAL);
			escenario.show();
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
