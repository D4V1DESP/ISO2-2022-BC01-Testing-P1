
public class Fecha {

	protected int dia;
	protected int mes;
	protected int anio;
	
	public Fecha(int dia, int mes, int anio) {
		P1_Metodos.comprobacionEntero(dia);
		P1_Metodos.comprobacionEntero(mes);
		P1_Metodos.comprobacionEntero(anio);
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	

}
