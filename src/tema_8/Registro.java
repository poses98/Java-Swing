package tema_8;

public class Registro {
	private String registro;
	private String nombre;
	private String apellidos;
	private String dni;
	private String cp;
	private String continente;
	private String pais;
	private String ciudad;
	private String direccion;
	private String articulo;
	private boolean enviado;
	
	
	
	
	public Registro(String registro, String nombre, String apellidos, String dni, String cp, String continente,
			String pais, String ciudad, String direccion, String articulo, boolean enviado) {
		super();
		this.registro = registro;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.cp = cp;
		this.continente = continente;
		this.pais = pais;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.articulo = articulo;
		this.enviado = enviado;
	}




	public String getRegistro() {
		return registro;
	}




	public void setRegistro(String registro) {
		this.registro = registro;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellidos() {
		return apellidos;
	}




	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	public String getCp() {
		return cp;
	}




	public void setCp(String cp) {
		this.cp = cp;
	}




	public String getContinente() {
		return continente;
	}




	public void setContinente(String continente) {
		this.continente = continente;
	}




	public String getPais() {
		return pais;
	}




	public void setPais(String pais) {
		this.pais = pais;
	}




	public String getCiudad() {
		return ciudad;
	}




	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}




	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}




	public String getArticulo() {
		return articulo;
	}




	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}




	public boolean isEnviado() {
		return enviado;
	}




	public void setEnviado(boolean enviado) {
		this.enviado = enviado;
	}
	
	
}
