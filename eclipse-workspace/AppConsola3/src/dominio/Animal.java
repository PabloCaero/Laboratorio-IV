package dominio;

public abstract class Animal {//EL PROGRAMA NO VA A PERMITIR INSTANCIAS DE TIPO "ANIMAL"
	
	private String nombre;
	
	public Animal() {
		nombre = "SIN NOMBRE";
	}
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
	return nombre;
	}

	public void setNombre(String nombre) {
	this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ES UN ANIMAL, SU NOMBRE ES: " + nombre;
	}
	

	//METODO ABSTRACTO
	public abstract String habilidades();
	
	

}
