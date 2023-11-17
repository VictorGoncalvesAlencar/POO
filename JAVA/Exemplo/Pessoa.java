
public class Pessoa {
	
	private String nome;
	private Endereco endereco;
	private String telefone;
	
	public Pessoa(String nome, Endereco endereco, String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}
	
	public Endereco getEndereco(){
		return endereco;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
}
