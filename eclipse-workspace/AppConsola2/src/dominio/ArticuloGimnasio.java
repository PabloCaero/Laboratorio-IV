package dominio;

public class ArticuloGimnasio extends Articulo { //CONCEPTO DE HERENCIA!!!!!
	private int peso;
	
	public ArticuloGimnasio() {
		super(); //FUNCION RESERVADA PARA LLAMAR A LOS CONSTRUCTORES DE ARTICULO
	}
	
	public ArticuloGimnasio(String nombre, int peso){
		super(nombre); //LLAMA AL CONSTRUCTOR DEL PADRE 
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return super.toString() + " - PESO = " +peso+ " kg";
	}
	
	

}
