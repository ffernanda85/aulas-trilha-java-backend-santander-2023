package apps;

public class Telegram extends ServicoMensagemInstantanea{

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}
	
}
