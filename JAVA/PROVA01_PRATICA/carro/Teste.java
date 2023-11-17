package PROVA01_PRATICA.carro;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite marca: ");
        String marca1 = scan.nextLine();
        scan.nextLine();
        Carro carro1 = new Carro(marca1,"Toumato");
        Carro carro2 = new Carro("FUINHA", "T222", 10, 10.0);
        

        System.out.println(carro1.descricao());
        System.out.println("Sua autonomia:"+carro1.autonomia());
        System.out.println("Sua autonomia:"+carro1.autonomia("gasolina"));
        System.out.println("Sua autonomia:"+carro1.autonomia("alcool"));
        
        
        System.out.println(carro2.descricao());
        System.out.println("Sua autonomia:"+carro2.autonomia("gasolina",10));
        System.out.println("Sua autonomia:"+carro2.autonomia("alcool",10));
        scan.close();
    }
}
