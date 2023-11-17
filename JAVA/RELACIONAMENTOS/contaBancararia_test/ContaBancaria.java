package RELACIONAMENTOS.contaBancararia_test;

public class ContaBancaria {
    private Pessoa cliente;
    private int numeroDaConta;
    private Double saldo;

    public ContaBancaria(Pessoa cliente, int numeroDaConta) {
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;
    }

    public boolean sacar(Double saque){
        if (saldo >= saque) {
            saldo -= saque;
            return true;
            
        }
        return false;
    }

    public boolean depositar(Double deposito){
        this.saldo += deposito;
        return true;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    

    
}


