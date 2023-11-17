package RELACIONAMENTOS.contaBancararia_test;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa cliente = new Pessoa("Fulano","46378","Rua A, 25", "578-290", 2000.0);

        ContaBancaria conta = new ContaBancaria(cliente, 1001);

        System.out.println("Conta: "+conta.getNumeroDaConta()+"\tSaldo: "+conta.getSaldo());

        if (conta.depositar(1000.0)) {
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Conta: "+conta.getNumeroDaConta()+"\tSaldo: "+conta.getSaldo());
        } else {
            System.out.println("Não foi possivel realizar o deposito!");
        }

        if (conta.sacar(1300.0)) {
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Conta: "+conta.getNumeroDaConta()+"\tSaldo: "+conta.getSaldo());
        } else {
            System.out.println("Não foi possivel realizar o saque!");
            System.out.println("Conta: "+conta.getNumeroDaConta()+"\tSaldo: "+conta.getSaldo());
        }

        Pessoa clienteTeste = conta.getCliente();

        System.out.println(clienteTeste.informacoes());

        clienteTeste.setNome("Joao");
        clienteTeste.setCpf("1234567890");
        clienteTeste.setEndereco("Rua do Indiano");
        clienteTeste.setRenda(5000.0);


        System.out.println("\n"+conta.getCliente().informacoes());


        scan.close();
    }
}
 