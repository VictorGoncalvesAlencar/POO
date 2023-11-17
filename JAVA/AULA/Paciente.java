package AULA;
public class Paciente {
    String nome;
    String sexo;
    double peso;
    double altura;

    public Paciente(String nome, String sexo, double peso, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
