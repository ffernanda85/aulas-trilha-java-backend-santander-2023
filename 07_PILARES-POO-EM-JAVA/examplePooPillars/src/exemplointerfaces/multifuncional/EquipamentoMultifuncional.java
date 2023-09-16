package exemplointerfaces.multifuncional;

import exemplointerfaces.copiadora.Copiadora;
import exemplointerfaces.digitalizadora.Digitalizadora;
import exemplointerfaces.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {

	public void imprimir() {
		System.out.println("IMPRIMINDO MULTIFUNCIONAL");
	}

	public void copiar() {
		System.out.println("COPIANDO MULTIFUNCIONAL");
	}

	public void digitalizar() {
		System.out.println("DIGITALIZANDO MULTIFUNCIONAL");
	}

}
