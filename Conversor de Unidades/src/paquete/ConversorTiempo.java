package paquete;

import java.util.Map;
import java.util.TreeMap;

public class ConversorTiempo extends ConversorClass {

	private ConversorClass siguiente;
	private Map<String, Double> tiempo;

	public static void main(String[] args) {
		ConversorTiempo c = new ConversorTiempo();
		double valor = 1;
		String numero = String.valueOf(c.convertir(valor, "minutos", "segundos"));
		
		int pentera = Integer.parseInt(numero.substring(0, numero.indexOf('.')));
		String pdecimal = numero.substring(numero.indexOf('.')+1);
		System.out.println("Partes de " + numero + ": " + pentera + " " + pdecimal);
	}

	public ConversorTiempo() {
		tiempo = new TreeMap<String, Double>();
		tiempo.put("años", 365.0);
		tiempo.put("meses", 30.0);
		tiempo.put("semanas", 14.0);
		tiempo.put("dias", 1.0);
		tiempo.put("horas", (double) 1 / 24);
		tiempo.put("minutos", (double) 1 / 1440);
		tiempo.put("segundos", (double) 1 / 86400);

	}

	@Override
	public double convertir(double valor, String de, String a) {
		return cambioDeUnidad(this.tiempo, valor, de, a, this.siguiente);
	}

	@Override
	public void setSiguiente(ConversorClass siguiente) {
		this.siguiente = siguiente;
	}

}
