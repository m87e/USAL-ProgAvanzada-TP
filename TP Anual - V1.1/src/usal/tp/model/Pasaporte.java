package usal.tp.model;

import java.util.Date;

public class Pasaporte {

	private String numeroPasaporte;
	private String pais;
	private String autoridadEmision;
	private Date fechaEmision;
	private Date fechaVencimiento;
	
	
	// Getter & Setter
	public String getNumeroPasaporte() {
		return numeroPasaporte;
	}
	public void setNumeroPasaporte(String numeroPasaporte) {
		this.numeroPasaporte = numeroPasaporte;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getAutoridadEmision() {
		return autoridadEmision;
	}
	public void setAutoridadEmision(String autoridadEmision) {
		this.autoridadEmision = autoridadEmision;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	
	//Constructor 
	
	public Pasaporte(String numeroPasaporte, String pais, String autoridadEmision, Date fechaEmision,
			Date fechaVencimiento) {
		this.numeroPasaporte = numeroPasaporte;
		this.pais = pais;
		this.autoridadEmision = autoridadEmision;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
	}
	public Pasaporte() {
		// TODO Auto-generated constructor stub
	}
	
	

}
