package ENCAPSULAMENTO.aluno;

import java.util.*;

public class Disciplina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno1 ;
        

        System.out.println("Informe Nome:");
        String nome = scan.nextLine();
        

        System.out.println("Informe Matricula:");
        int matricula = scan.nextInt();

        System.out.println("Informe Media:");
        Double media = scan.nextDouble();
        
        aluno1 = new Aluno(nome, matricula, media);
        aluno1.setNome(nome);
        aluno1.setMatricula(matricula);
        aluno1.setMedia(media);
    

        System.out.println("\n"+aluno1.resultadoFinal());

        aluno1.setMedia(7.0);

        System.out.println("\n"+aluno1.resultadoFinal());
        
        scan.close();
    }
}
