package proyectoRemiseria;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Vehiculo> vehiculosDisponibles;
	private ArrayList<Vehiculo> alquileres;
	
	public Empresa() {
		this.vehiculosDisponibles = new ArrayList<>();
		this.alquileres = new ArrayList<>();
	}

	public void ingresarVehiculos(String patente,String marca,String modelo,String año,Tipo tipo,double precioxKM) {
		if(buscarVehiculo(patente)) {
			
			
		}
		
	}
	
	private Vehiculo buscarVehiculo(String patente) {
		Vehiculo vehiculoBuscado = null;
		int i = 0;
		while(i<this.vehiculosDisponibles.size() && vehiculoBuscado == null) {
			if(this.vehiculosDisponibles.get(i).getPatente() == patente) {
				return vehiculoBuscado = this.vehiculosDisponibles.get(i);
			}else {
				i++;
			}
		}
		return vehiculoBuscado;
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
