package paquete;

public class Conversor extends ConversorClass {

	public final static String USUARIO = "fede";

	private ConversorClass primero;

	private ConversorMasa conMasa = new ConversorMasa();
	private ConversorTiempo conTiempo = new ConversorTiempo();
	private ConversorLongitud conLongitud = new ConversorLongitud();
	private ConversorCapacidad conCapacidad = new ConversorCapacidad();

	public static void main(String[] args) {
		Conversor c = new Conversor();

		// c.truncarNumero(360.123);
		c.convertir(1E+3, "gramos", "onzas");
	}

	public Conversor() {
		conCapacidad.setSiguiente(new Default());
		conLongitud.setSiguiente(conCapacidad);
		conTiempo.setSiguiente(conLongitud);
		conMasa.setSiguiente(conTiempo);

		this.setSiguiente(conMasa);
	}

	public double convertir(double valor, String de, String a) {

		double resultado = this.primero.convertir(valor, de, a);
		System.out.println("@" + USUARIO + " " + valor + " " + de + " equivale a " + resultado + " " + a);
		return resultado;
	}

	@Override
	public void setSiguiente(ConversorClass siguiente) {
		this.primero = siguiente;
	}

	public void truncarNumero(double numero) {
		System.out.println(numero);
		String valor = String.valueOf(numero);
		String parteDecimalS = valor.substring(valor.indexOf('.'));
		int parteEntera = Integer.valueOf(valor.substring(0, valor.indexOf('.')));
		int parteDecimalE = Integer.valueOf(valor.substring(valor.indexOf('.') + 1));
		float parteDecimalD = Float.parseFloat(valor.substring(valor.indexOf('.')));

		System.out.println(valor);
		System.out.println(parteEntera);
		System.out.println(parteDecimalS);
		System.out.println(parteDecimalE);
		System.out.println(parteDecimalD);

		if (parteDecimalE == 0)
			System.out.println("Retorno solo la parte entera: " + parteEntera);
		else
			System.out.println("Retorno el numero decimal truncado ");

	}

}
