package examplePooPillars;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		//jeep.ligar();
		jeep.setChassi("123456");
		//System.out.println("O Chassi do Jeep é " + jeep.getChassi());
				
		Moto bros2014 = new Moto();
		//bros2014.ligar();
		bros2014.setChassi("456789");
		//System.out.println("O Chassi da Bros é " + bros2014.getChassi());
		
		Veiculo coringa = bros2014;
		coringa.ligar();
	}
}
