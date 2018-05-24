package paquete;

public class Default extends ConversorClass{

	@Override
	public double convertir(double valor, String de, String a) {
		System.out.println("No identifiqué alguna de las unidades");
		return -1;
	}

	@Override
	public void setSiguiente(ConversorClass siguiente) {
		
	}
}
