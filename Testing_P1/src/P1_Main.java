import java.util.Scanner;

public class P1_Main {
	final static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
	
		int dia = 2;
		int mes = 12;
		int anio = 200;
		Fecha fecha = new Fecha(dia, mes, anio);
		
		boolean fechaCorrecta = P1_Metodos.comprobarFecha(fecha);
		
		boolean bisiesto = P1_Metodos.comprobarBisiesto(fecha);

		System.out.println(bisiesto);
		System.out.println(fechaCorrecta);
	}

}
