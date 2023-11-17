
import java.util.*;

public class Contato {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Endereco endereco = new Endereco("Rua A", "Januária", "MG");
		
		Pessoa pessoa = new Pessoa("Fulano", endereco, "99999-999");
		
		System.out.println("Nome: "+pessoa.getNome());
		
		System.out.println("Logradouro: "+pessoa.getEndereco().getLogradouro());
		scan.close();
	}
}
