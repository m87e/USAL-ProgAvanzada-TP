package Model;

import java.util.Date;

public class Cliente {

	private int id; // porque?
	private String nombre;
	private String apellido;
	private String dni;
	private Pasaporte pas;
	private String cuit;
	private Date fechaNac;
	private String email;
	private Telefono tel;
	private PasajeroFrecuente pasfre;
	private DirCompleta dir;
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Pasaporte getPas() {
		return pas;
	}
	public void setPas(Pasaporte pas) {
		this.pas = pas;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Telefono getTel() {
		return tel;
	}
	public void setTel(Telefono tel) {
		this.tel = tel;
	}
	public PasajeroFrecuente getPasfre() {
		return pasfre;
	}
	public void setPasfre(PasajeroFrecuente pasfre) {
		this.pasfre = pasfre;
	}
	public DirCompleta getDir() {
		return dir;
	}
	public void setDir(DirCompleta dir) {
		this.dir = dir;
	}
	public Cliente() {
		
		// TODO Auto-generated constructor stub
	}
	public Cliente(int id, String nombre, String apellido, String dni, Pasaporte pas, String cuit, Date fechaNac,
			String email, Telefono tel, PasajeroFrecuente pasfre, DirCompleta dir) {
	
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.pas = pas;
		this.cuit = cuit;
		this.fechaNac = fechaNac;
		this.email = email;
		this.tel = tel;
		this.pasfre = pasfre;
		this.dir = dir;
	}

	

	

	
	
}
