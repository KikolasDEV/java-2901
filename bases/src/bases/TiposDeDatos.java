package bases;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TiposDeDatos {
	public static void main(String[] args) {
		char annio = 'à';
		
		System.out.println(annio);
		
		int num = 3;
		
		double d1 = 0.1;
		double d2 = 0.2;
		
		double suma = d1 + d2;
		
		System.out.println(suma);
		
		System.out.println("Hola\r\n"
				+ "Qué tal");
		
		System.out.println();
		
		System.out.println("""
				Hola
				Qué tal
				""");
		
		// double dPrimitivo = null;
		Double dEncapsulado = null;
		
		System.out.println(dEncapsulado);
		
		String textoConNumero = "1234";
		
		int numero = Integer.parseInt(textoConNumero);
		
		System.out.println(numero * 2);
		
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		
		System.out.println(bd1);
		System.out.println(bd2);
		
		BigDecimal bdSuma = bd1.add(bd2);
		
		System.out.println(bdSuma);
		
		LocalDateTime ahora = LocalDateTime.now();
		
		System.out.println(ahora);
		
		LocalDate dia = LocalDate.of(2025, 1, 31);
		
		System.out.println(dia.plusMonths(1));
		
		LocalTime hora = LocalTime.now();
		
		System.out.println(hora);
		
	}
}
