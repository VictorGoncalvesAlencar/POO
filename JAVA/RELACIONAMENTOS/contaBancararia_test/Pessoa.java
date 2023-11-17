package RELACIONAMENTOS.contaBancararia_test;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private Double renda;

    public Pessoa(String nome, String cpf, String endereco, String telefone, Double renda) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.renda = renda;
    }

    public String informacoes(){
        return "Nome: "+nome+"\nCPF: "+cpf+"\nEndereço: "+endereco+"\nTelefone: "+telefone+"\nRenda: "+renda;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Double getRenda() {
        return renda;
    }
    public void setRenda(Double renda) {
        this.renda = renda;
    }

    
}
