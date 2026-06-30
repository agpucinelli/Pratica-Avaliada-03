package sistemaNotifica.repository;

import sistemaNotifica.model.Notifica;
import sistemaNotifica.model.notificaEmail;

public interface notificaRepository {

	public void validar();
	public void enviarMsg();
	public void criarMsg(Notifica msg);
	
}
