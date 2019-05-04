package usal.tp.model;

import java.util.Date;

public class Venta {

	private Cliente cli;
	private Vuelos vue;
	private Aerolinea aero;
	private Date fechaHoraVenta;
	private String formaPago;
	public Cliente getCli() {
		return cli;
	}
	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	public Vuelos getVue() {
		return vue;
	}
	public void setVue(Vuelos vue) {
		this.vue = vue;
	}
	public Aerolinea getAero() {
		return aero;
	}
	public void setAero(Aerolinea aero) {
		this.aero = aero;
	}
	public Date getFechaHoraVenta() {
		return fechaHoraVenta;
	}
	public void setFechaHoraVenta(Date fechaHoraVenta) {
		this.fechaHoraVenta = fechaHoraVenta;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	
	public Venta(Cliente cli, Vuelos vue, Aerolinea aero, Date fechaHoraVenta, String formaPago) {

		this.cli = cli;
		this.vue = vue;
		this.aero = aero;
		this.fechaHoraVenta = fechaHoraVenta;
		this.formaPago = formaPago;
	}
	public Venta() {
	
		// TODO Auto-generated constructor stub
	}
	
	
	
}
