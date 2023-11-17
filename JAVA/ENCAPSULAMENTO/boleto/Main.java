package ENCAPSULAMENTO.boleto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Boleto boleto = new Boleto(123, "TECLADO", 12, 100.0);

        System.out.println(boleto.exibir());

        if (boleto.pagar(10,10.0,100.0)) {
            System.out.println("\nPago com sucesso !!!\n");
        } else {
            System.out.println("\nNao ta pago\n");
        }

         System.out.println(boleto.exibir());

         scan.close();

    }
}
