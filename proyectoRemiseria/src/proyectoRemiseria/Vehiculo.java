package proyectoRemiseria;

public class Vehiculo {

	private String patente;
	private String marca;
	private String modelo;
	private String año;
	private Tipo tipo;
	private double precioxKM;
	private double kmActual;
	
	
	public Vehiculo(String patente, String marca, String modelo, String año, Tipo tipo, double precioxKM,
			double kmActual) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.tipo = tipo;
		this.precioxKM = precioxKM;
		this.kmActual = kmActual;
	}


	public String getPatente() {
		return patente;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public String getAño() {
		return año;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public double getPrecioxKM() {
		return precioxKM;
	}


	public double getKmActual() {
		return kmActual;
	}


	private void setPatente(String patente) {
		this.patente = patente;
	}


	private void setMarca(String marca) {
		this.marca = marca;
	}


	private void setModelo(String modelo) {
		this.modelo = modelo;
	}


	private void setAño(String año) {
		this.año = año;
	}


	private void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	private void setPrecioxKM(double precioxKM) {
		this.precioxKM = precioxKM;
	}


	private void setKmActual(double kmActual) {
		this.kmActual = kmActual;
	}


	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", tipo="
				+ tipo + ", precioxKM=" + precioxKM + ", kmActual=" + kmActual + "]";
	}
	
	
	
}
