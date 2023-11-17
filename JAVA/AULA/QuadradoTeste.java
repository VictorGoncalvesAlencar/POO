package AULA;
import java.util.Scanner;

public class QuadradoTeste {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Quadrado quadrado1;
        Quadrado quadrado2;


        System.out.println("Informe o valor do lado 1:");
        Double lado = scanner.nextDouble();

        System.out.println("Informe o valor do lado 2:");
        Double lado2 = scanner.nextDouble();
        
        quadrado1 = new Quadrado(lado);
        System.out.println("Valor lado:"+ quadrado1.lado);
        System.out.println("Valor Area:"+ quadrado1.calculaArea());
        System.out.println("Valor Perimetro:"+ quadrado1.calculaPerimetro());

        quadrado2 = new Quadrado(lado2);
        System.out.println("Valor lado:"+ quadrado2.lado);
        System.out.println("Valor Area:"+ quadrado2.calculaArea());
        System.out.println("Valor Perimetro:"+ quadrado2.calculaPerimetro());

        scanner.close();
    }


}
