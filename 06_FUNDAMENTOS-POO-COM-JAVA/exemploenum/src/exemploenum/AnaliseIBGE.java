package exemploenum;

public class AnaliseIBGE {
	public static void main(String[] args) {
		//imprimindo estados brasileiros
		//podemos correr todo o enum com o for
		for(EstadoBrasileiro eb : EstadoBrasileiro.values()) {
			//System.out.println(eb.getNome() + " - " + eb.getSigla() + " - " + eb.getIbge() + " - " + eb.EstadoBrasileiroUpper());
		}
		
		//selecionando um estado especifico
		EstadoBrasileiro estadoEscolhido = EstadoBrasileiro.PERNAMBUCO;
		System.out.println(estadoEscolhido.getNome() + " - " + estadoEscolhido.getSigla());
	}
}
