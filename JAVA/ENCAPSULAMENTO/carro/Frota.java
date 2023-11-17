package ENCAPSULAMENTO.carro;

import java.util.*;

public class Frota {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Carro carro1 = new Carro(10.0);

        System.out.println("Sua autonomia e :"+carro1.autonomia());
        System.out.println("Sua quilometragem e: "+carro1.getQuilometragem());

        System.out.println("Abastecer carro:");
        Double litros = scan.nextDouble();
        carro1.abastecer(litros);
        System.out.println("Sua autonomia e :"+carro1.autonomia());
        System.out.println("Informe a Distancia: ");
        int distancia = scan.nextInt();
        carro1.percorrerDistancia(distancia);
        System.out.println("Sua quilometragem e: "+carro1.getQuilometragem());

        System.out.println("Teste quilometros SET : ");
        Double quilometros = scan.nextDouble();
        carro1.setQuilometragem(quilometros);
        System.out.println("Sua quilometragem e: "+carro1.getQuilometragem());

        System.out.println("Teste combustivel SET : ");
        Double combustivel = scan.nextDouble();
        carro1.setCombustivel(combustivel);
        System.out.println("Sue conbustivel e: "+carro1.getCombustivel());
        

        scan.close();
    }




}
