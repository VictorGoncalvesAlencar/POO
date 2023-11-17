package LISTA01.RETANGULO;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Retangulo retangulo;
        System.out.println("Base: ");
        int base = scan.nextInt();
        System.out.println("Altura: ");
        int altura = scan.nextInt();


        retangulo = new Retangulo(base, altura);
        retangulo.calculaArea(base, altura);
        scan.close();
    }
    
}
