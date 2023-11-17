package SOBRECARGA.funcionario;

public class Funcionario {
    private String nome;
    private Double salarioBase;
    private int tempoDeServico;

    public Funcionario(String nome, Double salarioBase, int tempoDeServico){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tempoDeServico = tempoDeServico;
    }

    public Double mostraSalario(){
        
        if (tempoDeServico <= 10) {
            Double salario = salarioBase + salarioBase*0.12;
            return salario;
        } else{
            Double salario = salarioBase + salarioBase*0.17;
            return salario;
        }
        
    }

    public Double mostraSalario(Double totalDeVendas){
        if (tempoDeServico <= 10) {
            Double salario = salarioBase + (salarioBase*0.05)+(totalDeVendas*0.015);
            return salario;
        } else {
            Double salario = salarioBase + (salarioBase*0.1)+(totalDeVendas*0.02);
            return salario;
        }

    }

    public void setNome(String nome){
        this.nome =nome;
    }

    public String getNome(){
        return nome;
    }


}
