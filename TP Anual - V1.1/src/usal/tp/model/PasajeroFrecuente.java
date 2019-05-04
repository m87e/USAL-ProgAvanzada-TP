package usal.tp.model;

public class PasajeroFrecuente {

	private String alianza;
	private Aerolinea aerolinea; // ObjetoAerolinea?
	private String numero;
	private String categoria;

	public String getAlianza() {
		return alianza;
	}
	public void setAlianza(String alianza) {
		this.alianza = alianza;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public PasajeroFrecuente(String alianza, Aerolinea aerolinea, String numero, String categoria) {
		this.alianza = alianza;
		this.aerolinea = aerolinea;
		this.numero = numero;
		this.categoria = categoria;
	}
	public PasajeroFrecuente() {
		// TODO Auto-generated constructor stub
	}

}
