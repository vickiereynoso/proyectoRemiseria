package proyectoRemiseria;

import java.time.LocalDate;

public class Alquiler {

	private String dni;
	private LocalDate fecha;
	private Vehiculo vehiculoAlquilado;
	private double kilometrajeInicial;
	private double kilometrajeFinal = 0;
	
	public Alquiler(String dni, Vehiculo vehiculoAlquilado) {
		super();
		this.dni = dni;
		this.fecha = LocalDate.now();
		this.vehiculoAlquilado = vehiculoAlquilado;
		this.kilometrajeInicial = kilometrajeInicial;
		this.kilometrajeFinal = kilometrajeFinal;
	}

	public String getDni() {
		return dni;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Vehiculo getVehiculoAlquilado() {
		return vehiculoAlquilado;
	}

	public double getKilometrajeInicial() {
		return kilometrajeInicial;
	}

	public double getKilometrajeFinal() {
		return kilometrajeFinal;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	private void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	private void setVehiculoAlquilado(Vehiculo vehiculoAlquilado) {
		this.vehiculoAlquilado = vehiculoAlquilado;
	}

	private void setKilometrajeInicial(double kilometrajeInicial) {
		this.kilometrajeInicial = kilometrajeInicial;
	}

	private void setKilometrajeFinal(double kilometrajeFinal) {
		this.kilometrajeFinal = kilometrajeFinal;
	}

	@Override
	public String toString() {
		return "Alquiler [dni=" + dni + ", fecha=" + fecha + ", vehiculoAlquilado=" + vehiculoAlquilado
				+ ", kilometrajeInicial=" + kilometrajeInicial + ", kilometrajeFinal=" + kilometrajeFinal + "]";
	}
	
	
	
	
	
}
