package application;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
	public static void main(String[] args) {
		String [] candidatesSeleted = {"FELIPE", "FLÁVIA", "IZABELA", "MÁRCIA", "JULIA"};
		
		for(String candidate: candidatesSeleted) {
			callCandidates(candidate);
		}
	}
	
	static void callCandidates(String candidate) {
		int attempts = 1;
		boolean answered = false;
		boolean keepTrying = true;
		
		do {
			answered = toMeet();
			keepTrying = !answered;
			
			if(keepTrying) {
				attempts++;
			}else {
				System.out.println("CONTATO REALIZADO COM SUCESSO!");
			}
			
		} while (attempts < 3 && keepTrying == true);
		
		if(answered) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidate + " APÓS " + attempts + " TENTATIVA(S).");
		
		}else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM O(A) " + candidate + ".");
		}
	}
	

	static boolean toMeet() {
		return new Random().nextInt(3)==1;	
	}
	
	static void analyzeCandidate(double salaryClaim) {
		double baseSalary = 2000.0;
		
		if(baseSalary > salaryClaim) {
			System.out.println("LIGAR PARA O CANDIDATO");
		
		}else if(baseSalary == salaryClaim) {
			System.out.println("LIGAR PARA CANDIDATO, COM CONTRA PROPOSTA");
		
		}else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
	
	static void candidateSelection() {
		String [] candidates = {"FELIPE", "FLÁVIA", "IZABELA", "MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

		int selectedCandidates = 0;
		int index = 0;
		
		while(selectedCandidates < 5 && index < candidates.length) {
			double baseSalary = 2000.0;
			double candidateSalary = valorPretendido();
			String candidate = candidates[index];
			
			System.out.println("O salário pretendido por " + candidate + " foi: " + candidateSalary);
			if(baseSalary >= candidateSalary) {
				selectedCandidates++;
				System.out.println("O candidato " + candidate + " foi selecionado para a vaga");
			}
			index++;
		}
	}

	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void printingCandidates() {
		String [] candidates = {"FELIPE", "FLÁVIA", "IZABELA", "MÁRCIA", "JULIA"};
		
		System.out.println("Imprimindo candidatos utilizando o for");
		
		for(int i = 0; i < candidates.length; i++) {
			System.out.println("O candidato nº " + (i + 1) + " é: " + candidates[i]);
		}
		
		System.out.println("Imprimindo candidatos utilizando o for each");
		
		for(String candidate: candidates) {
			System.out.println("O candidato selecionado foi: " + candidate);
		}
	}
	
}
