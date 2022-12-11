import java.util.Scanner;

public class P1_Metodos {
	final static Scanner sc = new Scanner (System.in);
	
	public static boolean comprobarBisiesto(Fecha fecha) {
		boolean bisiesto;
		
		if (fecha.getAnio() % 4 == 0 && ((fecha.getAnio() % 100 != 0) || (fecha.getAnio() % 400 == 0))) {
			bisiesto = true;
		}else {
			bisiesto = false;
		}
		return bisiesto;
	}
	
	 public static void comprobacionEntero(int num) { 
		 
		 	try {
			 if(num < 0) {
				 throw new negativoException("El número introducido es negativo, y este ha de ser "
				 		+ "positivo \n");
			 	}
				}catch(negativoException e) {
					System.out.println(e.getMessage());
				}
		 	try {
	 		if(num != (int)num) {
			 	throw new digitException("La variable introducida ha de ser un dígito");
				}
				}catch(digitException e) {
				System.out.println(e.getMessage());
				}
		 	}
	 
}
