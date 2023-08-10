package proyectoRemiseria;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Vehiculo> vehiculosDisponibles;
	private ArrayList<Alquiler> alquileres;
	
	public Empresa() {
		this.vehiculosDisponibles = new ArrayList<>();
		this.alquileres = new ArrayList<>();
	}

	
	public void ingresarVehiculos(String patente,String marca,String modelo,String año,Tipo tipo,double precioxKM) {
		if(buscarVehiculo(patente)!= null) {
			Vehiculo vehiculo = new Vehiculo (patente,marca,modelo,año,tipo,precioxKM);
			System.out.println("Vehículo ingresado exitosamente.");
		}else {
			System.out.println("El vehículo ya existe.");
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
	
	private Alquiler buscarVehiculoEnAlquilados(String dni) {
		Alquiler vehiculoBuscado = null;
		int i = 0;
		while(i<this.alquileres.size() && vehiculoBuscado == null) {
			if(this.alquileres.get(i).getDni() == dni) {
				return vehiculoBuscado = this.alquileres.get(i);
			}else {
				i++;
			}
		}
		return vehiculoBuscado;
	}
	

	
	public void alquilarVehiculo(String patente, String dni) {
		if(buscarVehiculo(patente)!= null && buscarVehiculoEnAlquilados(patente)==null) {
			this.alquileres.add(new Alquiler(dni, buscarVehiculo(patente) ));
			System.out.println("Alquiler efectuado.");
		}else if(buscarVehiculo(patente)== null) {
			System.out.println("No existe el vehículo.");
		}
	}
	
	public void listarVehiculosAlquilados() {
		for(Alquiler a : this.alquileres) {
			System.out.println(a);
		}
	}
	
	
	public void realizarDevolucion(String dni) {
		
		double importe =  (buscarVehiculoEnAlquilados(dni).getKilometrajeFinal()) * (buscarVehiculoEnAlquilados(dni).getVehiculoAlquilado().getPrecioxKM());
		System.out.println("Kilometraje recorrido: "+ buscarVehiculoEnAlquilados(dni).getKilometrajeFinal() +" km."+ "\n" + "Importe $: "+ importe);
		eliminarAlquiler(dni);	
	}
	
	
	private void eliminarAlquiler(String dni) {
		Alquiler vehiculoBuscado = null;
		int i = 0;
		while(i<this.alquileres.size() && vehiculoBuscado == null) {
			if(this.alquileres.get(i).getDni() == dni) {
				this.alquileres.remove(i);
				System.out.println("Se ha liberado el vehiculo de la lista de alquilados.");
			}else {
				i++;
			}
		}
		
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
