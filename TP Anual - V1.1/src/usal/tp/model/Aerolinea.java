package usal.tp.model;

public class Aerolinea {

	private int id;
	private String nombre;
	private String[] alianza;
	private Vuelos[] vuelo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getAlianza() {
		return alianza;
	}

	public void setAlianza(String[] alianza) {
		this.alianza = alianza;
	}

	public Vuelos[] getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelos[] vuelo) {
		this.vuelo = vuelo;
	}

	public Aerolinea() {

		// TODO Auto-generated constructor stub
	}

	public Aerolinea(int id, String nombre, String[] alianza, Vuelos[] vuelo) {
		this.id = id;
		this.nombre = nombre;
		this.alianza = alianza;
		this.vuelo = vuelo;
	}

}
