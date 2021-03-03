/**
*
*/
package fecha;

/**
 * @author Juanfri
 *
 */
public class fecha {

	public int dia;
	public int mes;
	public int a�o;

	public fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public boolean valida() {

		validarFecha();

// Determinamos la cantidad de d�as del mes:
		int diasMes = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasMes = 30;
			break;
		case 2: // Verificamos si el a�o es bisiesto
			diasMes = bisiesto();
			break;

		}

		if (dia > diasMes)
			return false;
		else
			return true;

	}

	/**
	 * @return
	 */
	public int bisiesto() {
		int diasMes;
		if ((a�o % 400 == 0) || ((a�o % 4 == 0) && (a�o % 100 != 0)))
			diasMes = 29;
		else
			diasMes = 28;
		return diasMes;
	}

	/**
	 * @return 
	 * 
	 */
	public boolean validarFecha() {
		if (dia < 1 || dia > 31)
			return false;
		if (mes < 1 || mes > 12)
			return false;
		return false;
	}

}