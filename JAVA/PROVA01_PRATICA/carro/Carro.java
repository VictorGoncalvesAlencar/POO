package PROVA01_PRATICA.carro;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Double quantidadeDeCombustivel;

    public Carro( String marca, String modelo,int ano, Double quantidadeDeCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public Carro( String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = 0;
        this.quantidadeDeCombustivel = 10.0;
    }

    public Double autonomia(){
        Double autonomia = quantidadeDeCombustivel * 15;
        return autonomia;
    }

    public Double autonomia(String tipo){
        if (tipo =="gasolina") {
            Double autonomia = quantidadeDeCombustivel * 15;
            return autonomia;
        }

        if (tipo =="alcool") {
            Double autonomia = quantidadeDeCombustivel * 10;
            return autonomia;
        }

        Double autonomia = 0.0;
        return autonomia ;
    }

    public Double autonomia(String tipo, int mais){
        Double aux = quantidadeDeCombustivel + mais;
        if (tipo =="gasolina") {
            Double autonomia = aux * 15;
            return autonomia;
        }

        if (tipo =="alcool") {
            Double autonomia = aux * 10;
            return autonomia;
        }
        
        Double autonomia = 0.0;
        return autonomia ;
    }

    public String descricao(){
        String texto = "Marca: "+marca+"\nModelo: "+modelo+"\nAno: "+ano+"\nQTD Combustivel: "+quantidadeDeCombustivel;
        return texto;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setQuantidadeDeCombustivel(Double quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }
    public int getAno() {
        return ano;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Double getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }
}
