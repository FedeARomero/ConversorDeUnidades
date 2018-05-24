package paquete;

import java.util.Map;

public abstract class ConversorClass {

	public abstract void setSiguiente(ConversorClass siguiente);

	public abstract double convertir(double valor, String de, String a);

	public double cambioDeUnidad(Map<String, Double> unidades, double valor, String de, String a, ConversorClass siguiente) {

		if (unidades.containsKey(de) && unidades.containsKey(a))
			return valor * (unidades.get(de) / unidades.get(a));
		else
			return siguiente.convertir(valor, de, a);
	}

}
