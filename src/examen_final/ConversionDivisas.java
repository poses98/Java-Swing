package examen_final;

public class ConversionDivisas {
	enum Divisas{
		EURO,
		DOLAR,
		YEN,
		LIBRA
	}
	private final double[] EQUIVALENCIAS = {1,0.9,0.0083,1.16};
	
	public ConversionDivisas() {
	}
	
	public double conversionEnEuros(int cuantia, Divisas divisa) {
		if(cuantia==0) {
			throw new IllegalArgumentException("cuantia cannot be zero!");
		}
		return cuantia / EQUIVALENCIAS[divisa.ordinal()];
	}
}
