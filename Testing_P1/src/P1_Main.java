import java.util.Scanner;

public class P1_Main {
	final static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {

		int anio = sc.nextInt();
		P1_Metodos.comprobacionEntero(anio);
		
		Fecha fecha = new Fecha(20, 12, anio);
		
		boolean bisiesto = P1_Metodos.comprobarBisiesto(fecha);

		System.out.println(bisiesto);
	}

}
