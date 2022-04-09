package ejemplo3;

public class Barcelona2 implements IEquipo {
	
private String fechaClub;

public Barcelona2() {
	
}

public Barcelona2(String fechaClub) {
	super();
	this.fechaClub = fechaClub;
}

public String getFechaClub() {
	return fechaClub;
}

public void setFechaClub(String fechaClub) {
	this.fechaClub = fechaClub;
}

@Override
public String toString() {
	return "Barcelona2 [fechaClub=" + fechaClub + "]";
}

@Override
public String devuelveInformacion() {
	// TODO Auto-generated method stub
	return "Equipo Barcelona...";
}


}
