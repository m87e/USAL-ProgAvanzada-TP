package usal.tp.model;

public class DirCompleta {
	private String calle;
	private String altura;
	private String ciudad;
	private String pais;
	private String provincia;
	private String codigoPostal;
	
	//Getter & Setter
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	//Constructors
	
	public DirCompleta(String calle, String altura, String ciudad, String pais, String provincia, String codigoPostal) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.ciudad = ciudad;
		this.pais = pais;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
	}
	public DirCompleta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
