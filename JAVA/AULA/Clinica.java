package AULA;
public class Clinica {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("João", "Masculino", 70.5, 1.75);
        Paciente paciente2 = new Paciente("Maria", "Feminino", 65.2, 1.68);

        System.out.println("Paciente 1:");
        System.out.println("Nome: " + paciente1.nome);
        System.out.println("Sexo: " + paciente1.sexo);
        System.out.println("IMC: " + paciente1.calcularIMC());

        System.out.println("\nPaciente 2:");
        System.out.println("Nome: " + paciente2.nome);
        System.out.println("Sexo: " + paciente2.sexo);
        System.out.println("IMC: " + paciente2.calcularIMC());
    }
}
