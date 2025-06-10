public class OperadoresRelacionales {

	public static void main(String[] args) {
		/**
		 * OPERADORES DE RELACION
		 * ----------------------
		 * Los operadores relacionales son símbolos que se usan para comparar dos valores. 
		 * Si el resultado de la comparación es correcto la expresión considerada es verdadera
		 * caso contrario es falsa. 
		 */
		int x =8;
		int y= 5;
		System.out.println("\nTRABAJANDO CON LOS OPERADORES DE RELACIONES");
		System.out.println("-------------------------------------------");
		boolean compara = (x < y);
		System.out.println("x < y es " + compara);
		compara = (x > y);
		System.out.println("x > y es " + compara);
		compara = (x == y);
		System.out.println("x == y es " + compara);
		compara = (x != y);
		System.out.println("x != y es " + compara);
		compara = (x <= y);
		System.out.println("x <= y es " + compara);
		compara = (x >= y);
		System.out.println("x >= y es " + compara);

	}
}