package exemploenum;

//criando o Enum EstadoBrasileiro para ser usado em toda a aplicação
public enum EstadoBrasileiro {
	SAO_PAULO("Sao Paulo", "SP", 11),
	RIO_JANEIRO("Rio de Janeiro", "RJ", 12),
	PERNAMBUCO("Pernambuco", "PE", 13),
	PIAUI("Piaui", "PI", 14),
	MARANHAO("Maranhao", "MA", 15),
	CEARA("Ceara", "CE", 16);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String nome, String sigla, int ibge) {
		this.nome = nome;
		this.sigla = sigla;
		this.ibge = ibge;
	}
	
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public int getIbge() {
		return ibge;
	}
	
	public String EstadoBrasileiroUpper() {
		return nome.toUpperCase();
	}
}
