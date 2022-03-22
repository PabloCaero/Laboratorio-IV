package dominio;

public class Articulo {
	//Atributos - Concepto de Encapsulamiento
	private int id;
	private String nombre;
	
	//Constructores
	public Articulo() {
		id = 0;
		nombre = "Sin nombre";
	}
	
	public Articulo(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}
	
	//Getters y Setters
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

	//Metodo ToString(): ES PARA MOSTRAR LA INFO EN PANTALLA
	@Override
	public String toString() {
		return "ID = " + id + " - NOMBRE = " + nombre;
	}
	
}