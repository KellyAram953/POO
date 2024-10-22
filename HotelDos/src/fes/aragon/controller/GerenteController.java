package fes.aragon.controller;

import java.net.URL;
import java.util.ResourceBundle;

import fes.aragon.modelo.Gerente;
import fes.aragon.modelo.Hotel;
import fes.aragon.modelo.Hoteles;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GerenteController implements Initializable {

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnCancelar;

    @FXML
    private TextField txtApellidoMaterno;

    @FXML
    private TextField txtApellidoPaterno;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtRfc;

    @FXML
    private TextField txtTelefono;
    private Hotel hotel;


    @FXML
    void cancelarGerente(ActionEvent event) {
    	this.cerrar();
    }

    @FXML
    void nuevoGerente(ActionEvent event) {
    	
    	hotel.getGerente().setNombre(this.txtNombre.getText());
    	hotel.getGerente().setApellidoPaterno(this.txtApellidoPaterno.getText());
    	hotel.getGerente().setApellidoMaterno(this.txtApellidoMaterno.getText());
    	hotel.getGerente().setRfc(this.txtRfc.getText());
    	hotel.getGerente().setCorreo(this.txtCorreo.getText());
    	hotel.getGerente().setTelefono(this.txtTelefono.getText());
    	this.cerrar();
    }
    private void cerrar() {
    	Stage stage = (Stage)btnCancelar.getScene().getWindow();
    	stage.close();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		if(Hoteles.getInstancia().isModificarHotel()) {
			this.hotel = Hoteles.getInstancia().getGrupoHoteles().get(
					Hoteles.getInstancia().getIndice());
			this.txtNombre.setText(hotel.getGerente().getNombre());
			this.txtApellidoPaterno.setText(hotel.getGerente().getApellidoPaterno());
			this.txtApellidoMaterno.setText(hotel.getGerente().getApellidoMaterno());
			this.txtRfc.setText(hotel.getGerente().getRfc());
			this.txtCorreo.setText(hotel.getGerente().getCorreo());
			this.txtTelefono.setText(hotel.getGerente().getTelefono());
			
		}else {
			hotel = Hoteles.getInstancia().getGrupoHoteles().get(
				Hoteles.getInstancia().getGrupoHoteles().size()-1);
		}
	}

}
