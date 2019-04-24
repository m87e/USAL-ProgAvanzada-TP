package Model;

public class Aeropuerto {
	private String idAeropuerto;
	private String Ciudad;
	private String provincia;
	private String pais;
	
	public String getIdAeropuerto() {
		return idAeropuerto;
	}
	public void setIdAeropuerto(String idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Aeropuerto(String idAeropuerto, String ciudad, String provincia, String pais) {
		
		this.idAeropuerto = idAeropuerto;
		Ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
	}
	public Aeropuerto() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
}
