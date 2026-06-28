package sistemaUsuarios.model;

public class Usuario {
	
	private String nome;
	private String email;
	private int numero;
	
	
	public Usuario(int numero, String nome, String email) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.email = email;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
			
	public void visualizar( ) {
		
		
		
		
		System.out.println("*********************************************");
		System.out.println("             DADOS DA CONTA                  ");
		System.out.println("*********************************************");
		System.out.printf("Numero da conta: %d%n", this.numero);		
		System.out.printf("Nome: %s%n", this.nome);
		System.out.printf("e-mail: %s%n", this.email);
		System.out.println("Nível de acesso: Usuário");
		
		
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

}
