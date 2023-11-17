package LISTA01.VOTOS;

import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);


        System.out.println("Eleitores: ");
        int eleitores = scan.nextInt();

        System.out.println("Votos Nulos: ");
        int nulos = scan.nextInt();

        System.out.println("Votos Brancos: ");
        int brancos = scan.nextInt();

        System.out.println("Votos Válidos: ");
        int validos = scan.nextInt();


        Votos votacao = new Votos(eleitores, nulos, brancos, validos);

        System.out.println("Porcentagem Nulo:"+votacao.percentNulos(eleitores,nulos)+
        "%\nPorcentagem Brancos:"+votacao.percentBancos(eleitores,brancos)+"%\nPorcentagem Válidos:"+
        votacao.percentValidos(eleitores,validos)+"%");

        scan.close();

    }
}
