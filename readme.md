 SENTENCIAS:
		 Una sentencia es una orden que se le da al programa para realizar una tarea
		 espec'ifica, estas pueden ser:
		  int i = 1; declarar una variable e inicializarla.
		  import java.awt.*; importar una clase
		  System.out.println("Mostrar una linea"); Mostrar un mensaje en pantalla.
		  rect.mover(10, 20); llamar a una función.
		  
		 Las sentencias terminan con ; este carárter separa una sentencia de la siguiente.
		 		//imprime un mensaje con salto de línea.
		
 BLOQUES DE CODIGO:
		 Un bloque de código es un grupo de sentencias que se comportan como una
		 unidad. Un bloque de código está limitado por las llaves de apertura { y cierr }.
		 
		
 EXPRESIONES:
		 Una expresión es todo aquello que se puede poner a la derecha del operador
		  asignación = Por ejemplo:
		  x = 123;
		  y = (x+100)/4;
		  area circulo.calcularArea(2.5);
		  Rectangulo r = new Rectangulo(10, 10, 200, 300);
		  
		 La primera expresión asigna un valor a la variable x.
		 La segunda, realiza una operación.
		 La tercer, es una llamada a una función miembro calcularArea desde un objeto circulo de una clase determinada.
		 La cuarta, reserva espacio en memoria para un objeto de la clase Rectangulo
		 mediante la llamada a una función especial denominada constructor.
		 
		
	VARIABLES
		 Una variable es un nombre que se asocia a una porción de la memoria del
		 ordenador, en la que se guarda el valor asignado a dicha variable.
		 Todas las variables han de declararse antes de usarlas, la declaración consiste en una sentencia en la que figura el tipo de dato y el nombre que asignamos a la variable. Una vez declarad se le podrá asignar valores.
		 Java tiene tres tipos de variables:
		  	de instancia.
		  	de clase.
		  	locales.
		  
		 Las variables de instancia o miembros de datos: Se la usan para guardar los atributos de un objeto particular.
		 Las variables de clase o miembros datos estáticos: Son similares a las variables de instancia, con excepción de los valores que guardan son los mismos para todos los objetos de una determinada clase.
     En el siguiente ejemplo, PI guarda el mismo valor para todos los objetos de la clase Circulo, pero el radio de cada circulo(objeto) puede ser diferente.
		 
		 class Circulo{
		   	static final double PI = 3.141516;
		   	double radio;
		   }
		   
		 Las variables locales: se itulizan dentro de las funciones miembro o métodos.
		 En el siguiente ejemplo area es una variable local a la función calcularArea en la que se guarda el valor del área de un objeto de la clase Circulo.
		
		 class Circulo{
		  	double calcularArea(){
		  		double area = PI * radio * radio;
		  		return area;
		  }
		  
		 Las variables locales se declaran en el momento en el que son necesarias.
		 También se pueden inicializar en el momento en el que son declaradas.
		   
		   int x = 0;
		   String nombre = "Angel";
		   double a = 3.5, b = 0.0, c = *2.4;
		   boolean bNuevo = true;
		   int [] datos;
		   
	  Delante del nombre de cada variable se ha de especificar el tipo de variable
	  que hemos destacado en la letra negrita. 
	  
	  VARIABLES BOOLEANAS
	  Una variable booleana solamente puede guardar uno de los dos posibles valores:
	  true (verdadero) y false (falso).
	  
	  boolean encontrado = false;
	  {...}
	  encontrado =  true;
	  
	VARIABLES ENTERAS
	  Una variable entera consiste en cualquier cifra precedida por el signo más
	  (opcional), para los positivos, o el signo menos, para los negativos.
	  Son ejemplos de números enteros:
	  12, -36, 0, 4687, -3560
	  Como ejemplos de declaración de variables enteras tenemos:
	  	int numero =  1025;
	  	int x, y; // declaracion de dos variables.
	  	long m = 30L;
	    En la tercera linea 30, es un número de tipo int por defecto, le ponemos el subfijo L en mayúscula o minúscula para indicar que es de tipo long.
    Existen como vemos en la taba varios tipos de números enteros (byte, short, int, long).
		
		VARIABLES CON COMA FLOTANTE
		 Las variables del tipo float o double (como flotante) se usan para guardar 
		 números en memoría que tienen parte entera y parte decimal.
		  	double PI = 3.141516;
		  	double G = 9.7805;
		  
		VALORES CONSTANTES
		Cuando se declara una variable del tipo final, se ha de inicializar y cualquier intento de modificarla en el curso de la ejecución del programa da lugar a un error.
		Normalmente, las constantes de un programa se suelen poner en letras mayúsculas para distinguirlas de las que no son constantes. He aquí ejemplos de declaración de constantes.
		   	final double PI = 3.141516;
		   	final int MAX_DATOS = 150;
		   
		LAS CADENAS DE CARACTERES O STRINGS
		Las cadens de caracteres o strings en Java son los objetos String
		  	String mensaje = "El primer programa";
		  
		   
		