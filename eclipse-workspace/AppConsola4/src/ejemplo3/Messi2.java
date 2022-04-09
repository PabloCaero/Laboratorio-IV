package ejemplo3;

public class Messi2 {

	private String nacionalidad;
	private IEquipo equipo; 
	
	//MANERA PARA QUE DECLARAR UN ATRIBUTO NO SEA ESTRICTAMENTE DEPENDIENTE
	
	
	public Messi2() {
	
	}
	
	public Messi2(String nacionalidad, IEquipo equipo) {
		super();
		this.nacionalidad = nacionalidad;
		this.equipo = equipo;
	}
	
	

	public IEquipo getEquipo() {
		return equipo;
	}

	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Messi2 [nacionalidad=" + nacionalidad + "]" + equipo.toString();
	}
	
	
}
