package AULA;
/** 
public class Fatura {
    int numero;
    String descricao;
    int quantidade;
    Double preco;

    public Double getValorDaFatura(){
        return preco * quantidade;
    }

    public Fatura(int numero, String descricao, int quantidade, Double preco){
        this.numero = numero;
        this.descricao = descricao;
        if (quantidade < 0) {
                this.quantidade = quantidade;
            
        }
    }
} 
*/

public class Fatura {
    private int numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(int numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = (quantidade > 0) ? quantidade : 0;
        this.preco = (preco > 0) ? preco : 0.0;
    }

    public double getValorDaFatura() {
        return quantidade * preco;
    }
    
    // Getters e Setters (opcional)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = (quantidade > 0) ? quantidade : 0;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = (preco > 0) ? preco : 0.0;
    }
}
