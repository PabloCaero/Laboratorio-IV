package dominio;

public class Articulo {//public final class = SIGNIFICA QUE SE CORTA CON LA HERENCIA
	//Atributos - Concepto de Encapsulamiento
	private int id;
	private String nombre;
	private static int cont = 0; //PARA AUTOGENERAR ID
	
	//Constructores
	public Articulo() {
		cont++;
		this.id = cont;
		this.nombre = "Sin nombre";
	}
	
	public Articulo(String nombre) {
		cont++;
		this.id = cont;
		this.nombre = nombre;
		//this.id = id;
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

	//METODO (VIDEO 3)
	public static int devuelveProximoID() {
		return cont+1;
	}
	
	//Metodo ToString(): ES PARA MOSTRAR LA INFO EN PANTALLA
	@Override
	public String toString() {
		return "ID = " + id + " - NOMBRE = " + nombre;
	}
	
	
}
