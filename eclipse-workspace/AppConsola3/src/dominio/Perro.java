package dominio;

public class Perro extends Animal{
	
	private String raza;

	public Perro() {
		super();
		raza = "SIN RAZA";
	}
	
	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "ES UN PERRO, SU NOMBRE ES: "+ getNombre()+ " Y SU RAZA ES: " + raza ;
	}
	
	public String habilidades() {
		return "Los perros pueden localizar y separar olores.";
	}
	
	
	
	
	
}
