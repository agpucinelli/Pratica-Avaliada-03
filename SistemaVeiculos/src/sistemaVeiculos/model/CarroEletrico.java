package sistemaVeiculos.model;

public class CarroEletrico extends Carro {
	
	int nivelBateria;
	

	public CarroEletrico(int numero, String modelo, int velocidade, int nivelBateria) {
		super(numero, modelo, velocidade);
		// TODO Auto-generated constructor stub
		this.nivelBateria = nivelBateria;
	}


	public int getNivelBateria() {
		return nivelBateria;
	}


	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

	@Override
	public void visualizar() {
		
		System.out.println("*********************************************");
		System.out.println("             DADOS DO VEÍCULO                ");
		System.out.println("*********************************************");
		
		System.out.printf("Nome do carro: %s%n", this.modelo);
		System.out.printf("Velocidade:  %d%n", this.velocidade);
		System.out.printf("Nível da bateria: %d%n", this.nivelBateria);
		
	};
}
