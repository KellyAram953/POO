package fes.aragon.modelo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Hoteles {
	private static Hoteles instancia = new Hoteles();
	private ObservableList<Hotel> grupoHoteles = FXCollections.observableArrayList();
	private boolean modificarHotel = false;
	private int indice = -1;
	private int indeceHabitacion = -1;
	
	
	private Hoteles() {
		Hotel h = new Hotel();
		h.setNombre("Dato1");
		h.setDireccion("Dato2");
		h.setCorreo("Demo3@demo");
		h.setTelefono("547854");
		
		Gerente g=new Gerente();
		g.setNombre("Victor");
		g.setApellidoPaterno("Aramburo");
		g.setApellidoMaterno("Gonzalez");
		g.setCorreo("kelly@.com");
		g.setRfc("sdfghj");
		g.setTelefono("4568");
		
		h.setGerente(g);
		Habitacion hab=new Habitacion();
		hab.setNumero("A1");
		hab.setCosto(23.76f);
		hab.setTipo("Mixto");
		hab.setRefrigerador(true);
		h.getHabitaciones().add(hab);
		grupoHoteles.add(h);
	}
	public boolean isModificarHotel() {
		return modificarHotel;
	}
	public void setModificarHotel(boolean modificarHotel) {
		this.modificarHotel = modificarHotel;
	}
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	public int getIndeceHabitacion() {
		return indeceHabitacion;
	}
	public void setIndeceHabitacion(int indeceHabitacion) {
		this.indeceHabitacion = indeceHabitacion;
	}
	public ObservableList<Hotel> getGrupoHoteles() {
		return grupoHoteles;
	}
	public static Hoteles getInstancia() {
		return instancia;
	}
	
}
