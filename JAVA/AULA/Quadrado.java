package AULA;
public class Quadrado {
    Double lado;
    
    public double calculaArea(){
        return lado * lado;
    }

    public double calculaPerimetro(){
        return lado * 4;
    }

    public Quadrado(Double lado){
        this.lado = lado;
    }
    
}
