package Data;

public class Comedor {
    int capacidad;
    String nombre;
    Menu menu;
    Cola colaComedor= new Cola();
    int ocupacion;
    int turno;
    //podriamos poner las coordenadas en donde esta para lo de la geolocalizacion al final
    
    public Comedor(int capac, String nomb, Menu menu) {
        this.capacidad = capac;
        this.nombre = nomb;
        this.menu = menu;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    }
    public int getTurno() {
        return this.turno;
    }
    public String toString()
	{
		return this.nombre;
	}

}
