package sistemaVeiculos.controller;

import java.util.ArrayList;
import java.util.List;
import sistemaVeiculos.model.Carro;
import sistemaVeiculos.model.CarroEletrico;
import sistemaVeiculos.repository.veiculosRepository;
import sistemaVeiculos.util.Cores;

public class veiculosController implements veiculosRepository {
	
	private static final int CONSUMO_POR_ACELERACAO = 2;

	private List<CarroEletrico> listaVeiculos = new ArrayList<CarroEletrico>();
	
	int numero = 0;

	@Override
	public void listarTodas() {
		for(var carro : listaVeiculos) {
			carro.visualizar();
			
			
		}
		
	}

	

	@Override
	public void cadastrar(Carro carro) {
		listaVeiculos.add((CarroEletrico) carro);
		System.out.println("Carro adicionado " + carro.getModelo());
	}
	
	public int gerarNumero() {
		return ++ numero;
		
	}

	@Override
	public void acelerar() {
		for(var carro : listaVeiculos) {
		
			
		int consumoBateria =  (carro.getVelocidade()/CONSUMO_POR_ACELERACAO);
				
		
		
		System.out.println("*****************************************************");
		System.out.println("*****************************************************");
		System.out.println("*****************************************************");

		if(carro.getVelocidade()<=0) {
			System.out.println(Cores.TEXT_RED_BOLD + "Erro no valor da velocidade está negativo."+ Cores.TEXT_RESET);
		}
		if(carro.getNivelBateria()<=0) {
			System.out.println(Cores.TEXT_RED_BOLD + "Erro no valor do nível de bateria está negativo."+ Cores.TEXT_RESET);
		}
		if(carro.getNivelBateria()>100) {
			System.out.println(Cores.TEXT_RED_BOLD + "Erro no valor do nível de bateria está maior que 100%."+ Cores.TEXT_RESET);
		}
		
		
		System.out.println("MODELO DO VEICULO: " + carro.getModelo());
		System.out.println("VELOCIDADE ATUAL " + carro.getVelocidade());
		System.out.println("CONSUMO POR ACELERAÇÃO: " + consumoBateria + "%");
		System.out.println("NÍVEL DA BATERIA:  " + carro.getNivelBateria() + "%");
		System.out.println(carro.getModelo()+ " tem velocidade " + carro.getVelocidade() + "KM/h");
		
		
		
		if(consumoBateria>carro.getNivelBateria() || consumoBateria<0 ) 
		{
			System.out.println("Bateria insuficiente");
		}else {
			System.out.println("Bateria OK");
		}
		
		
		
		
		}
	}



	
		
	


}
