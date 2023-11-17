package AULA;
import java.util.*;

public class Calc {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calculadora conta = new Calculadora();
		
		conta.somar(10,10);
		
		//System.out.print("\n "+conta.verConta());
		
		conta.subtrair(40,10);
		
		System.out.print("\n "+conta.verConta());
		
		conta.mult(10,10);
		
		System.out.print("\n "+conta.verConta());

		conta.div(200,7);
		
		System.out.print("\n "+conta.verConta());
		scanner.close();
	}
}

