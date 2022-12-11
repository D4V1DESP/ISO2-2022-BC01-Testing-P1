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
	
	public static int comprobacionEntero(int num) { 
		 
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
	 	
	 	return num;
}
	 
	 public static boolean comprobarFecha(Fecha fecha) {
		 boolean fechaCorrecta = true;
		 
		 if(fecha.getDia() < 0 || fecha.getDia() > 31) {
			 fechaCorrecta = false;
		 }
		 if(fecha.getMes() < 1 || fecha.getMes() > 12) {
			 fechaCorrecta = false;
		 }
		 if(fecha.getAnio() < 0) {
			 fechaCorrecta = false;
		 }
		 
		 return fechaCorrecta;
	 } 
}
