package proyectoRemiseria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa e = new Empresa();
		
		e.ingresarVehiculos("1234", "Mercedez Benz", "JXZ","2020", Tipo.PREMIUM,500,0);
		e.ingresarVehiculos("4321", "BMW", "KLP","2022", Tipo.PREMIUM,550,0);
		e.ingresarVehiculos("4321", "BMW", "KLP","2022", Tipo.PREMIUM,550,0);//Debe mostrar mensaje de que no acepta repetidos. 
		e.ingresarVehiculos("555", "Toyota", "Hilux","2018", Tipo.GRANDE,300,50000);
		e.ingresarVehiculos("1000", "Honda", "Fit","2011", Tipo.PEQUEÑO,250,17000);
		e.ingresarVehiculos("336699", "Chevrolet", "Tracker","2015", Tipo.MEDIANO,180,78000);
		e.ingresarVehiculos("997722", "Peugeot", "JAQ","2013", Tipo.PEQUEÑO,133,120000);
		
		System.out.println("");
		e.listarVehiculos();
		System.out.println("");
		
		e.alquilarVehiculo("1234", "34087408");
		e.alquilarVehiculo("1234", "33459817"); //Error. Ya está alquilado. No disponible.
		e.alquilarVehiculo("8888", "10146972"); //Error al no existir un vehículo con esa patente.
		e.alquilarVehiculo("4321", "15678994");
		e.alquilarVehiculo("555", "27389202");
		e.alquilarVehiculo("1000", "22847494");
		e.alquilarVehiculo("1000", "38100203"); //Error. Ya está alquilado. No disponible.
		e.alquilarVehiculo("555", "40272929"); //Error. Ya está alquilado. No disponible.
		e.alquilarVehiculo("555", "35928110"); //Error. Ya está alquilado. No disponible.
		e.alquilarVehiculo("336699", "29488848");
		e.alquilarVehiculo("1234", "9234848");
		
		
		System.out.println("");
		e.listarVehiculos();
		System.out.println("");
		
		System.out.println("");
		e.listarVehiculosAlquilados();
		System.out.println("");
		
		e.realizarDevolucion("34087408",170); //Tiene que dar $85.000
		e.realizarDevolucion("33459817",215); //Error. Nunca fue alquilado bajo ese dni.
		e.realizarDevolucion("40272929",330.9);//Error. Nunca fue alquilado bajo ese dni.
		e.realizarDevolucion("15678994",271.98); //Tiene que dar $149.589
		e.realizarDevolucion("27389202",345); //Tiene que dar $103.500
		e.realizarDevolucion("22847494",499);//Tiene que dar $ 124.750 y de km actual 448 km. 
		e.realizarDevolucion("38100203",278); //Error. Nunca fue alquilado bajo ese dni.
		
		System.out.println("");
		e.listarVehiculos();
		System.out.println("");
		
	}
}
