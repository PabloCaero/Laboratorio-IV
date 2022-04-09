package dominio;

public class Gato extends Animal {
	public Gato() {
		super();
	}
	
	public Gato(String nombre) {
		super(nombre);
		
	}

	@Override
	public String toString() {
		return "ES UN GATO, SE LLAMA: " + getNombre();
	}
	
	public String habilidades() {
		return "Los gatos tienen gran flexibilidad y elasticidad.";
	}
	
	
}
