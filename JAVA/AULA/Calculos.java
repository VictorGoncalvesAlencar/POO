package AULA;
import java.util.*;

public class Calculos{
	String name;
	int t;
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calculadora2 calc = new Calculadora2();
		
		System.out.print("Informe N1: ");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Informe N2: ");
		double numero2 = scanner.nextDouble();
		
		System.out.print("\nSoma: "+calc.somar(numero1, numero2));
		System.out.print("\nSubtracao: "+calc.subtrair(numero1, numero2));
		System.out.print("\nMultiplicao: "+calc.multiplicar(numero1, numero2));
		System.out.print("\nDivisao: "+calc.dividir(numero1, numero2));
		scanner.close();
	}
	
	
	
	
}
