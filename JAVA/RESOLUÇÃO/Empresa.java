package RESOLUÇÃO;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        System.out.println("Informe o nome do funcionario:");
        funcionario1.nome = scanner.nextLine();
        System.out.println("Informe as horas trabalhadas do funcionario:");
        funcionario1.horasTrabalhadas = scanner.nextDouble();
        System.out.println("Informe o valor da hora do funcionario:");
        funcionario1.valorDaHora = scanner.nextDouble();
        System.out.println("\nNome: "+ funcionario1.nome + "\nSalario Liquido: "+ funcionario1.salarioFinal());

        scanner.nextLine();
        System.out.println("Informe o nome do funcionario:");
        funcionario2.nome = scanner.nextLine();
        System.out.println("Informe as horas trabalhadas do funcionario:");
        funcionario2.horasTrabalhadas = scanner.nextDouble();
        System.out.println("Informe o valor da hora do funcionario:");
        funcionario2.valorDaHora = scanner.nextDouble();
        System.out.println("\nNome: "+ funcionario2.nome + "\nSalario Liquido: "+ funcionario2.salarioFinal());

        scanner.nextLine();
        System.out.println("Informe o nome do funcionario:");
        funcionario3.nome = scanner.nextLine();
        System.out.println("Informe as horas trabalhadas do funcionario:");
        funcionario3.horasTrabalhadas = scanner.nextDouble();
        System.out.println("Informe o valor da hora do funcionario:");
        funcionario3.valorDaHora = scanner.nextDouble();
        System.out.println("\nNome: "+ funcionario3.nome + "\nSalario Liquido: "+ funcionario3.salarioFinal());
        scanner.close();

    }
}
