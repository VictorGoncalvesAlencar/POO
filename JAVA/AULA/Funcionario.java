package AULA;
public class Funcionario {
    String nome;
    double horasTrabalhadas;
    double valorDaHora;

    public Funcionario(String nome, double horasTrabalhadas, double valorDaHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorDaHora = valorDaHora;
    }

    public double salarioFinal() {
        double salarioBruto = horasTrabalhadas * valorDaHora;
        double descontoPrevidencia = salarioBruto * 0.11;
        return salarioBruto - descontoPrevidencia;
    }
}
