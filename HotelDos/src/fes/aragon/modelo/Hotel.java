package fes.aragon.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Hotel {
	private Gerente gerente = new Gerente();
	private ObservableList<Habitacion> habitaciones = FXCollections.observableArrayList();;
	//private Habitacion[] habitaciones = new Habitacion[5];
	private String nombre;
	private String direccion;
	private String correo;
	private String telefono;
	private static Hotel instancia = new Hotel();
	public Hotel() {
		
	}

	public Gerente getGerente() {
		return gerente;
	}
	public static Hotel getHotel() {
		return instancia;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public ObservableList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ObservableList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Hotel> getGrupoHoteles() {
		// TODO Auto-generated method stub
		return null;
	}



	

}
