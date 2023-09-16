package networkClass;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class FlaviaComputer {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "msn";
		
		if(appEscolhido == "msn") {
			smi = new MSNMessenger();
		
		}else if(appEscolhido == "tlg") {
			smi = new Telegram();
		
		}else if(appEscolhido == "fcb") {
			smi = new FacebookMessenger();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}
}
