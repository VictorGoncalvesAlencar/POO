package ENCAPSULAMENTO.boleto;

public class Boleto {
    private int codigo;
    private String descricao;
    private int diaVencimento;
    private Double valor;
    private boolean status;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public Boleto(int codigo ,String descricao ,int diaDeVencimento ,Double valor ){
        this.codigo = codigo;
        this.descricao = descricao;
        this.diaVencimento = diaDeVencimento;
        this.valor = valor;
        this.status = false;
    }

    public String exibir(){
        String resp =  "Codigo:"+codigo+"\nDescrição: "+descricao+"\nDia vencimento: "+diaVencimento+"\nValor: "+valor+"\nStatus: ";
        if (status) {
            resp += "Boleto Pago!!!";
        } else {
            resp += "Boleto Não Pago!!!";
        }
        return resp;
    }

    
    public boolean pagar(int dia, Double desconto, Double valorPago){
        if (status) {
            return false;
        }
        Double valorAPagar;
        if (dia > diaVencimento) {
            valorAPagar = valor * 1.1;
        }else{
            valorAPagar= valor - desconto;
        }
        if (valorPago >= valorAPagar) {
            status = true;
            return true; 
        }
        return false;
    }


}
        
   