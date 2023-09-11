package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe Santiago");
		felipe.setIdade(38);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
	}
}
