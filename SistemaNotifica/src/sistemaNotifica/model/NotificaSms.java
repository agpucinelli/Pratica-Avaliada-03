package sistemaNotifica.model;

import sistemaNotifca.util.Cores;

public class NotificaSms extends Notifica {
	
	public NotificaSms(String nome, String msg, String telefone) {
		super(nome, msg);
		this.telefone = telefone;
	}

	String telefone;

	

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
		if(telefone.isEmpty()) {
			System.out.println(Cores.TEXT_RED_BOLD + "Erro: O e-mail está vazio." + Cores.TEXT_RESET);
		}else if(!telefone.matches("^[1-9]{2}9[0-9]{8}$")) {
			System.out.println(Cores.TEXT_RED_BOLD + "Erro: O telefone é inválido." + Cores.TEXT_RESET);
		}
		System.out.println("\nEnviar mensagem para "+nome+ "\nTelefone: "  + telefone + "\nMensagem: "+  msg);
	}

}
