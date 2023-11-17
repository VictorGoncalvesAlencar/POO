package AULA;

public class Calculadora{
	int valor;
	
	public void somar(int num1,int num2){
		this.valor = num1 + num2;
		System.out.print("Valor: "+valor);
	}
	
	public int subtrair(int num1,int num2){
		this.valor = num1 - num2;
		return valor;
	}
	
	public int mult(int num1,int num2){
		this.valor = num1 * num2;
		return valor;
	}
	
	public int div(int num1,int num2){
		this.valor = num1 / num2;
		return valor;
	}
	
	public String verConta(){
		return "Valor: "+this.valor;
	}
}

