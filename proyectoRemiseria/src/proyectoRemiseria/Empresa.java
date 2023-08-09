package proyectoRemiseria;

import java.util.ArrayList;

public class Empresa {

	private ArrayList vehiculosDisponibles = new ArrayList<>();
	private ArrayList alquileres = new ArrayList<>();
	
	public Empresa() {
		
	}

	public ArrayList getVehiculosDisponibles() {
		return vehiculosDisponibles;
	}

	public ArrayList getAlquileres() {
		return alquileres;
	}

	private void setVehiculosDisponibles(ArrayList vehiculosDisponibles) {
		this.vehiculosDisponibles = vehiculosDisponibles;
	}

	private void setAlquileres(ArrayList alquileres) {
		this.alquileres = alquileres;
	}

	@Override
	public String toString() {
		return "Empresa [vehiculosDisponibles=" + vehiculosDisponibles + ", alquileres=" + alquileres + "]";
	}

	
	
	
	
}
