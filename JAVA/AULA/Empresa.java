package AULA;
public class Empresa {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 40, 20);
        Funcionario funcionario2 = new Funcionario("Maria", 35, 25);
        Funcionario funcionario3 = new Funcionario("Pedro", 45, 18);

        System.out.println("Funcionário 1:");
        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Salário Final: " + funcionario1.salarioFinal());

        System.out.println("\nFuncionário 2:");
        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Salário Final: " + funcionario2.salarioFinal());

        System.out.println("\nFuncionário 3:");
        System.out.println("Nome: " + funcionario3.nome);
        System.out.println("Salário Final: " + funcionario3.salarioFinal());
    }
}
