package examen_final;

import examen_final.ConversionDivisas.Divisas;

public class EjemploUso {

	public static void main(String[] args) {
		ConversionDivisas conv = new ConversionDivisas();
		System.out.println(conv.conversionEnEuros(100, Divisas.YEN));
		System.out.println(conv.conversionEnEuros(100, Divisas.EURO));
		System.out.println(conv.conversionEnEuros(100, Divisas.DOLAR));
		System.out.println(conv.conversionEnEuros(100, Divisas.LIBRA));
	}

}
