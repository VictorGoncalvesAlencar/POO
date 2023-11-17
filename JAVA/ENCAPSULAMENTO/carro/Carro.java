package ENCAPSULAMENTO.carro;

public class Carro {
    private Double combustivel;
    private Double quilometragem;

    public Carro(Double combustivel){
        this.combustivel = combustivel;
        this.quilometragem = 0.0;
    }

    public void percorrerDistancia(int distancia){
        if (distancia >= combustivel * 12) {
            System.out.println("Voce Não Tem O Combustivel Necessario!");
        }else{
        this.quilometragem += distancia;
        this.combustivel -= distancia/12;  } 
    }

    public void abastecer(Double litros){
        this.combustivel += litros;
    }

    public Double autonomia(){
        return combustivel * 12;
    }

    public Double getCombustivel (){
        return combustivel;
    }

    public Double getQuilometragem (){
        return quilometragem;
    }

    public void setCombustivel (Double combustivel){
        this.combustivel = combustivel;
    }

    public void setQuilometragem (Double quilometros){
        this.quilometragem = quilometros;
    }



}
