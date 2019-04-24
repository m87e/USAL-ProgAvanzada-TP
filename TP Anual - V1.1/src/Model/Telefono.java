package Model;

public class Telefono {

	private String numPersonal;
	private String numCelular;
	private String numLaboral;


	// Getter & Setter
	
	public String getNumPersonal() {
		return numPersonal;
	}

	public void setNumPersonal(String numPersonal) {
		this.numPersonal = numPersonal;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public String getNumLaboral() {
		return numLaboral;
	}

	public void setNumLaboral(String numLaboral) {
		this.numLaboral = numLaboral;
	}

	// Constructor 
	
	public Telefono(String numPersonal, String numCelular, String numLaboral) {
		this.numPersonal = numPersonal;
		this.numCelular = numCelular;
		this.numLaboral = numLaboral;
	}

	public Telefono() {
		// TODO Auto-generated constructor stub
	}
}
