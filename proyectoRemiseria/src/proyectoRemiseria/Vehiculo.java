package proyectoRemiseria;

public class Vehiculo {

	private String patente;
	private String marca;
	private String modelo;
	private String a�o;
	private Tipo tipo;
	private double precioxKM;
	private double kmActual;
	
	
	public Vehiculo(String patente, String marca, String modelo, String a�o, Tipo tipo, double precioxKM,
			double kmActual) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
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


	public String getA�o() {
		return a�o;
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


	private void setA�o(String a�o) {
		this.a�o = a�o;
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
		return "Vehiculo [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", a�o=" + a�o + ", tipo="
				+ tipo + ", precioxKM=" + precioxKM + ", kmActual=" + kmActual + "]";
	}
	
	
	
}
