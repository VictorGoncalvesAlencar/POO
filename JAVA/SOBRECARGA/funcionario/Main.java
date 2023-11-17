package SOBRECARGA.funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Funcionario f1 = new Funcionario("Joao", 1500.0, 9);
        Funcionario f2 = new Funcionario("Maria",2000.0,12);

        System.out.print("##--Teste Estrutura de Menu--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Vendedor          |\n");  
        System.out.print("| Opção 2 - Gerente           |\n");
        System.out.print("|-----------------------------|\n");

        int aux = 1;
        do {
            
            System.out.print("Digite uma opção: ");
            int opcao = scan.nextInt();
            
            switch (opcao) {
            case 1:
                System.out.println("O salario: "+f1.mostraSalario());
                break;
            case 2:
                System.out.println("Informe o total de vendas: ");
                Double totalDeVendas = scan.nextDouble();
                System.out.println("O salario: "+f2.mostraSalario(totalDeVendas));
                break; 
            default:
                aux = 0;
                break;       
            }
        } while (aux != 0);
        




        scan.close();
    }
}
