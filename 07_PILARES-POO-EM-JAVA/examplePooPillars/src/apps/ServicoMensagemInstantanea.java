package apps;

public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();

	protected void salvarHistoricoMensagem(){
		System.out.println("Salvando historico de mensagens");
		
	}
	
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
}
