package exemplointerfaces.estabelecimento;

import exemplointerfaces.copiadora.Copiadora;
import exemplointerfaces.digitalizadora.Digitalizadora;
import exemplointerfaces.impressora.Deskjet;
import exemplointerfaces.impressora.Impressora;
import exemplointerfaces.impressora.Laserjet;
import exemplointerfaces.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Deskjet deskjet = new Deskjet();
		
		Impressora impressora = deskjet;
		Digitalizadora digitalizadora = em; //se colocar o deskjet aqui dará erro
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();

	}
}
