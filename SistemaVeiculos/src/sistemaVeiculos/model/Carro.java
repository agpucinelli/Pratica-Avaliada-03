package sistemaVeiculos.model;

public class Carro {

	String modelo;
	int velocidade;
	int numero;
		
	
	public Carro(int numero, String modelo, int velocidade) {
		super();
		this.modelo = modelo;
		this.velocidade = velocidade;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void visualizar() {
		
		
	
	
		System.out.println("*********************************************");
		System.out.println("             DADOS DO VEÍCULO                ");
		System.out.println("*********************************************");
		
		System.out.printf("Nome do carro: %s%n", this.modelo);
		System.out.printf("Velocidade:  %d%n", this.velocidade);
		
		
		
		
	}
}
