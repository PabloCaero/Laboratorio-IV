package ejemplo3;

public class Principal {

	public static void main(String[] args) {
		Barcelona2 b = new Barcelona2();
		b.setFechaClub("01/01/2020");
		
		Juventus2 j = new Juventus2();
		j.setCantJugadores(11);
		
		Messi2 messi = new Messi2();
		messi.setEquipo(j); //INYECTAR LAS DEPENDENCIAS!!!! CON ONJETOS DE INTERFACES
		messi.setNacionalidad("Argentina");

		System.out.println(messi.toString());
	}

}
