/* 2. Escreva um programa para ler o número total de eleitores de um município, o número de
votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em
relação ao total de eleitores. */


package LISTA01.VOTOS;

public class Votos {
    int eleitores;
    int nulos;
    int brancos;
    int validos;

    public Votos(int eleitores, int nulos, int brancos, int validos) {
        this.eleitores = eleitores;
        this.nulos = nulos;
        this.brancos = brancos;
        this.validos = validos;
    }

    public Double percentNulos(int eleitores, int nulos){
        if (eleitores == 0) {
            return 0.0; 
        }
    
        double percentual = ((double) nulos / eleitores) * 100.0;
        return percentual;
    }

    public Double percentBancos(int eleitores, int brancos){
        if (eleitores == 0) {
            return 0.0; 
        }
    
        double percentual = ((double) brancos / eleitores) * 100.0;
        return percentual;
    }

    public Double percentValidos(int eleitores, int validos){
        if (eleitores == 0) {
            return 0.0; 
        }
    
        double percentual = ((double) validos / eleitores) * 100.0;
        return percentual;
    }
}
