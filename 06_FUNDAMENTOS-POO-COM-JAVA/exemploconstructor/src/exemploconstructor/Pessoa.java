package exemploconstructor;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	
	//criando o método construtor
	//precisa possuir o mesmo nome da classe
	//não possui retorno
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
