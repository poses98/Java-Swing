package examen_final;

import static org.junit.Assert.*;

import org.junit.Test;

import examen_final.ConversionDivisas.Divisas;

public class TestDivisas {
	ConversionDivisas conv = new ConversionDivisas();
	@Test
	public void testConversionEnEuros1() {
		double resultadoReal = conv.conversionEnEuros(100, Divisas.DOLAR);
		double resultadoEsperado = 111.11111111111111;
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	public void testConversionEnEuros2() {
		double resultadoReal = conv.conversionEnEuros(100, Divisas.LIBRA);
		double resultadoEsperado = 111.11111111111111;
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	public void testConversionEnEuros3() {
		double resultadoReal = conv.conversionEnEuros(100, Divisas.YEN);
		double resultadoEsperado = 111.11111111111111;
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	public void testConversionEnEuros4() {
		try {
			conv.conversionEnEuros(0,Divisas.DOLAR);
			System.out.println("Deberia haber saltado excepcion");
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}
	@Test
	public void testConversionEnEuros5() {
		try {
			conv.conversionEnEuros(-2,Divisas.DOLAR);
			System.out.println("Deberia haber saltado excepcion");
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}
	
	

}
