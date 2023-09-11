package exemploconstructor;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa fernanda = new Pessoa("Flavia Fernanda", "555.555.555-55");
		
		//definimos o endereço de Fernanda
		fernanda.setEndereco("Rua Belo Horizonte, 42 - Nossa Senhora do Ó");
		
		//imprimindo Fernanda 
		System.out.println(fernanda.getNome() + " - " + fernanda.getCpf());
	}
}
