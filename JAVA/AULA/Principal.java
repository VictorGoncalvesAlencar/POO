package AULA;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a matricula:");
        int matricula = scan.nextInt();
        scan.nextLine();
        System.out.println("Informe nome:");
        String nome = scan.nextLine();
        System.out.println("Informe cpf:");
        String cpf = scan.nextLine();
        System.out.println("Informe endereco:");
        String endereco = scan.nextLine();

        Aluno aluno1 = new Aluno(matricula, nome, cpf, endereco);
        System.out.print(aluno1.toString());




        scan.close();
    }


}