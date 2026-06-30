package sistemaNotifica.model;

public class Notifica {
	
	String nome;
	String msg;

	public Notifica(String nome, String msg) {
		super();
		this.nome = nome;
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public void enviarMsg() {
		
			
		System.out.println("*********************************************");
		System.out.println("             DADOS DA MENSAGEM               ");
		System.out.println("*********************************************");
		//System.out.printf("Numero da conta: %d%n", this.numero);
		
		System.out.printf("Nome do Destinatario: %s%n", this.nome);
		System.out.printf("Mensagem: %s%n", this.msg);
		
		
		
		
	}
	

}
