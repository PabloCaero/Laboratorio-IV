package dominio;

public class Principal {
	public static void main(String[] args) {
		Articulo art = new Articulo(); //Instancia del objeto por el constructor vac�o
		
		art.setId(2);
		art.setNombre("Articulo 2");
		
		//Para mostrar lo que tiene el objeto
		//System.out.println("ID: " + art.getId()+" - NOMBRE: " + art.getNombre());
		
		//Para mostrar con el m�todo ToString()
		
		System.out.println(art.toString());
	}
}