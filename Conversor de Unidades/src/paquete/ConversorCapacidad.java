package paquete;

import java.util.Map;
import java.util.TreeMap;

public class ConversorCapacidad extends ConversorClass{
	
	private ConversorClass siguiente;
	private Map<String, Double> capacidad;
	
	public static void main(String[] args) {
		ConversorCapacidad c = new ConversorCapacidad();
		double valor = 123.45;
		
		System.out.println(valor + " decimetros cubicos equivale a " + c.convertir(valor, "decimetros cubicos", "mililitros") + " mililitros");
		
	}

	public ConversorCapacidad() {
		capacidad = new TreeMap<String, Double>();
		capacidad.put("kilolitros" 	, 1E3);//kilolitros
		capacidad.put("hectolitros" , 1E2);//hectolitros
		capacidad.put("decalitros"	, 1E1 );//decalitros
		capacidad.put("litros"  	, 1E0);//litros
		capacidad.put("decilitros" 	, 1E-1);//decilitros
		capacidad.put("centilitros" , 1E-2);//centilitros
		capacidad.put("mililitros" 	, 1E-3);//mililitros
		capacidad.put("pintas" 		, 0.473);//pintas
		capacidad.put("galones"		, 3.785);//galones
		capacidad.put("barriles"	, 158.987);//barriles
		capacidad.put("kilometros cubicos"	, 1E+12);//kilometros cubicos
		capacidad.put("metros cubicos" 		, 1E+3 );//metros cubicos
		capacidad.put("decimetros cubicos"	, 1E0 );//decimetros cubicos
		capacidad.put("centimetros cubicos"	, 1E-3 );//centimetros cubicos
		capacidad.put("milimetros cubicos"	, 1E-6 );//milimetros cubicos
		
	}

	@Override
	public double convertir(double valor, String de, String a) {
		return cambioDeUnidad(this.capacidad, valor, de, a, this.siguiente);
	}

	@Override
	public void setSiguiente(ConversorClass siguiente) {
		this.siguiente = siguiente;
	}
}
