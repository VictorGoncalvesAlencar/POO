
public class Endereco {
	
	private String logradouro;
	private String cidade;
	private String estado;
	
	public Endereco(String logradouro, String cidade, String estado){
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void setLogradouro(String logradouro){
		this.logradouro = logradouro;
	}
	
	public String getLogradouro(){
		return logradouro;
	}
	
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	
	public String getCidade(){
		return cidade;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	public String getEstado(){
		return estado;
	}
	
}
