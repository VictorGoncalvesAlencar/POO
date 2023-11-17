package AULA;
public class Main {
    public static void main(String[] args) {
        // Instanciando duas faturas
        Fatura fatura1 = new Fatura(1, "Mouse", 2, 50.0);
        Fatura fatura2 = new Fatura(2, "Teclado", -1, -30.0); // Testando valores negativos

        // Obtendo e exibindo o valor das faturas
        System.out.println("Fatura 1:");
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço: " + fatura1.getPreco());
        System.out.println("Valor da Fatura: " + fatura1.getValorDaFatura());
        System.out.println();

        System.out.println("Fatura 2:");
        System.out.println("Número: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preço: " + fatura2.getPreco());
        System.out.println("Valor da Fatura: " + fatura2.getValorDaFatura());
    }
}
