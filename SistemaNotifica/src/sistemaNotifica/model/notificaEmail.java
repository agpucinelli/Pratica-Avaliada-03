package sistemaNotifica.model;

import sistemaNotifca.util.Cores;

public class notificaEmail extends Notifica {
	
	String email;

	public notificaEmail(String nome, String msg, String email) {
		super(nome, msg);
		this.email = email;
	}

	

	public String getEmail() { 
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	@Override
	public void enviarMsg() {
		super.enviarMsg();
		if(nome.isEmpty()) {
			System.out.println(Cores.TEXT_RED_BOLD + "Erro: A nome do destinatário está vazio." + Cores.TEXT_RESET);
		}
		if(msg.isEmpty()) {
			System.out.println(Cores.TEXT_RED_BOLD + "Erro: A mensagem está vazia." + Cores.TEXT_RESET);
		}
		if(email.isEmpty()) {
			System.out.println(Cores.TEXT_RED_BOLD + "Erro: O e-mail está vazio." + Cores.TEXT_RESET);
		}else if(!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
			System.out.println(Cores.TEXT_RED_BOLD + "Erro: O e-mail é inválido." + Cores.TEXT_RESET);
		}
		
		System.out.println("\nEnviar mensagem por e-mail para "+nome+ "\ne-mail: "  + email + "\nMensagem: "+  msg);
	}
	
}
