/*3. O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do
distribuidor seja de 28% e os impostos de 45%, escrever um programa para ler o custo de
fábrica de um carro, calcular e escrever o custo final ao consumidor.*/




package LISTA01.CARROCUSTO;

public class CarroCusto {
    private Double custoFabrica;

    public CarroCusto (Double custoFabrica){
        this.custoFabrica = custoFabrica;
    }

    public Double custoFinal(){
        double x = custoFabrica + (custoFabrica * 0.45) + (custoFabrica * 0.28);
        return x;
    }

    public void setCarroFabrica(Double custoFabrica){
        this.custoFabrica = custoFabrica;
    }

    public Double getCarroFabrica(){
        return custoFabrica;
    }
}
