package ejemplo3;

public class Juventus2 implements IEquipo{
private int cantJugadores;

public Juventus2() {
	
}

public Juventus2(int cantJugadores) {
	super();
	this.cantJugadores = cantJugadores;
}

public int getCantJugadores() {
	return cantJugadores;
}

public void setCantJugadores(int cantJugadores) {
	this.cantJugadores = cantJugadores;
}

@Override
public String toString() {
	return "Juventus2 [cantJugadores=" + cantJugadores + "]";
}

@Override
public String devuelveInformacion() {
	return "Equipo Juventus...";
}


}
