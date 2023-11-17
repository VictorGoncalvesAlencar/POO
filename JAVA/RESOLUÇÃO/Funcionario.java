package RESOLUÇÃO;

public class Funcionario {
    String nome;
    Double horasTrabalhadas;
    Double valorDaHora;

    public Double salarioFinal(){
        Double salario = horasTrabalhadas * valorDaHora;
        salario =  salario - (salario * 0.11);
        return salario;
    }
}
