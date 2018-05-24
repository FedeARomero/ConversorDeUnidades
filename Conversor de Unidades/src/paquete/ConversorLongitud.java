package paquete;

import java.util.Map;
import java.util.TreeMap;

public class ConversorLongitud extends ConversorClass{
	
	private ConversorClass siguiente;
	private Map<String, Double> longitud;
	
	public static void main(String[] args) {
		ConversorLongitud c = new ConversorLongitud();
		double valor = 1E1;
		
		System.out.println(valor + " pulgadas equivale a " + c.convertir(valor, "pulgadas", "centimetros") + " centimetros");
	}

	public ConversorLongitud() {
		longitud = new TreeMap<String, Double>();
		longitud.put("kilometros" 	, 1E+3 );
		longitud.put("hectometros" 	, 1E+2 );
		longitud.put("decametros"	, 1E+1 );
		longitud.put("metros"  		, 1E0 );
		longitud.put("decimetros" 	, 1E-1 );
		longitud.put("centimetros" 	, 1E-2 );
		longitud.put("milimetros" 	, 1E-3 );
		longitud.put("pulgadas" 	, 0.0254 );
		longitud.put("pies" 		, 0.03048 );
		longitud.put("yardas" 		, 0.9144 );
		longitud.put("millas" 		, 1609.347 );
		longitud.put("leguas" 		, 48280.32 );
		
	}
	
	public double convertir(double valor, String de, String a) {
		return cambioDeUnidad(this.longitud, valor, de, a, this.siguiente);
	}

	@Override
	public void setSiguiente(ConversorClass siguiente) {
		this.siguiente = siguiente;
	}
}
