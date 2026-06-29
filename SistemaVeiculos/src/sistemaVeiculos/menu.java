package sistemaVeiculos;

import java.util.InputMismatchException;
import java.util.Scanner;
import sistemaVeiculos.controller.veiculosController;
import sistemaVeiculos.model.Carro;
import sistemaVeiculos.model.CarroEletrico;
import sistemaVeiculos.util.Cores;

public class menu {
	
	private static final Scanner leia = new Scanner(System.in);
	private static final veiculosController veiculosController = new veiculosController();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		criarContasTeste();
		
		
		
		
		do {
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLUE_BACKGROUND);	
		System.out.println("*******************************************************");
		System.out.println("                                                       ");
		System.out.println("                    1000 GRAU CARS                     ");
		System.out.println("                                                       ");
		System.out.println("*******************************************************");
		System.out.println("                                                       ");
		System.out.println("                  1 - CRIAR VEICULO                    ");
		System.out.println("                  2 - LISTAR TODAS VEICULOS            ");
		System.out.println("                  3 - TESTAR CARROS                    ");
		
		System.out.println("                  0 - SAIR                             ");
		System.out.println("                                                       ");
		System.out.println("*******************************************************" + Cores.TEXT_RESET);

		try {
			opcao = leia.nextInt();
			leia.nextLine();
		} catch(InputMismatchException e) {
			opcao = -1;
			System.out.println("\nDigite um número inteiro entre 0 e 3");
			leia.nextLine();
		}
		
		if(opcao == 0) {
			System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + "1000 GRAU CARS  - DIRIGINDO COM VOCE");
		}
		
		switch(opcao) {
		
		case 1:
			System.out.println("Criar veiculo \n\n");
			cadastrarVeiculo();
			keyPress();
			break;
		
		case 2:
			System.out.println("Listar contas \n\n");
			listarTodas();
			keyPress();
			
			break;
		case 3:
			System.out.println("Testar Veiculos \n\n");
			acelerar();
			keyPress();
			break;
			
		case 0:
			System.out.println("Sair \n\n");
			keyPress();
			leia.close();
			System.exit(0);
			
			
			
			
		}
			
		} while (!(opcao == 0));
		System.out.println("SISTEMA ENCERRADO");
	
	leia.close();
}

public static void keyPress() {
	System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
	leia.nextLine();
}
		
	
	
	
	private static void listarTodas() {
		
		
		veiculosController.listarTodas();
	
		
	}

	public static void  criarContasTeste() {
		
		
		veiculosController.cadastrar(new CarroEletrico (veiculosController.gerarNumero(),"Prisma1", 100, 100 ));
		veiculosController.cadastrar(new CarroEletrico (veiculosController.gerarNumero(),"Prisma2", 100, 30 ));
		veiculosController.cadastrar(new CarroEletrico (veiculosController.gerarNumero(),"Prisma3", -100, 0 ));
		veiculosController.cadastrar(new CarroEletrico (veiculosController.gerarNumero(),"Prisma4", 0, -30 ));
	}
	
	public static void acelerar() {
		veiculosController.acelerar();
		
	}	
	

	public static void cadastrarVeiculo() {
		System.out.printf("Digite o modelo do carro: ");
		String modeloCarro = leia.nextLine();
		System.out.println("Digite a velocidade do carro: ");
		
		int velocidadeCarro = leia.nextInt();
		
			System.out.println("Digite o nível da bateria: ");
			int nivelBateria = leia.nextInt();
			leia.nextLine();

			veiculosController.cadastrar(new CarroEletrico(veiculosController.gerarNumero(), modeloCarro, velocidadeCarro, nivelBateria));
		
	}
	
}
