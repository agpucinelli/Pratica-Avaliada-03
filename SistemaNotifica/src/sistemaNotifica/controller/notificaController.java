package sistemaNotifica.controller;

import java.util.ArrayList;
import java.util.List;
import sistemaNotifica.model.Notifica;
import sistemaNotifica.model.notificaEmail;
import sistemaNotifica.repository.notificaRepository;

public class notificaController implements notificaRepository {

	private List<Notifica> listaNotifica = new ArrayList<Notifica>();
	
	@Override
	public void validar() {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void enviarMsg() {
		
		for(var msg : listaNotifica) {
			
			
			msg.enviarMsg();
		}
		
	}

	

	@Override
	public void criarMsg(Notifica msg) {
		// TODO Auto-generated method stub
		listaNotifica.add(msg);
		System.out.println("Notificação criada");
		
	}

	

	
}
