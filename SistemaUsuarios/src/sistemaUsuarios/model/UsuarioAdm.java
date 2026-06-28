package sistemaUsuarios.model;

public class UsuarioAdm extends Usuario{
	
	private String nivelAcess;
	
	
	public UsuarioAdm(int numero, String nome, String email, String nivelAcess) {
		super(numero, nome, email);
		this.nivelAcess = nivelAcess;
	}


	public String getNivelAcess() {
		return nivelAcess;
	}

	public void setNivelAcess(String nivelAcess) {
		this.nivelAcess = nivelAcess;
	}

	
	@Override
	public void visualizar() {
	
		switch(this.nivelAcess) {
			case "1":
				nivelAcess = "Usuario";
			break;
			case "2": 
				nivelAcess = "ADM";
			break;
		}
	
		
		System.out.println("*********************************************");
		System.out.println("             DADOS DA CONTA                  ");
		System.out.println("*********************************************");
		System.out.printf("Numero da conta: %d%n", this.getNumero());		
		System.out.printf("Nome: %s%n", this.getNome());
		System.out.printf("e-mail: %s%n", this.getEmail());
		System.out.printf("Nível de acesso: %s%n", this.getNivelAcess());
	}
	
}
 