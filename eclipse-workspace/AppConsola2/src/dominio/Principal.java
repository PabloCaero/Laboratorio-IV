package dominio;

public class Principal {

	public static void main(String[] args) {
		ArticuloGimnasio artG = new ArticuloGimnasio();
		artG.setNombre("Mancuerna");
		artG.setPeso(10);
		
		
		System.out.println(artG.toString());
		
		ArticuloGimnasio artG2 = new ArticuloGimnasio("Barra Ol�mpica", 15);
		System.out.println(artG2.toString());
		
		System.out.println(artG.devuelveGramos()+" grs");
		System.out.println(artG2.devuelveGramos()+" grs");

	}

}
