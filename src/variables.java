public class Variables {

	public static void main(String[] args) {
		// PRACTICANDO Y CONOCIENDO AL TIPO DE VARIABLES QUE MANEJAMOS EN EL LENGUAJE JAVA
		boolean valido = false; // El tipo de variable boolean adopta solo dos valores; true o false.
		byte bytes = (byte) 12345; //Casteamos a la variable para forzar al tipo byte.
		int parametro_1 = 10;
		int parametro_2 = 3;
		float resultDivision = parametro_1 / parametro_2;// Operacion sin castear.
		float resultDivisionFloat =(float) parametro_1 / parametro_2;//Casteamos al tipo float
		double resultDivisionDouble =(double) parametro_1 / parametro_2;//Casteamos al tipo double
		
		System.out.println("Trabajando con distintos tipos de variables");
		System.out.println("Podemos acceder al primer byte (0-255): " + bytes);
		System.out.println("La variable parametro_1 es del tipo entera y su valor es: " + parametro_1);
		System.out.println("La variable parametro_2 es del tipo entera y su valor es: " + parametro_2);
		
		System.out.println("La operacion de division arroja el siguiente resultado:  " + resultDivision);
		System.out.println("La operacion de division arroja el siguiente resultado:  " + resultDivisionFloat);
		System.out.println("La operacion de division arroja el siguiente resultado:  " + resultDivisionDouble);
	}
}