package sistemaUsuarios;

import java.util.InputMismatchException;
import java.util.Scanner;

import sistemaUsuarios.controller.usuariosController;
import sistemaUsuarios.model.Usuario;
import sistemaUsuarios.model.UsuarioAdm;
import sistemaUsuarios.util.Cores;

public class Menu {

	private static final usuariosController usuariosController = new usuariosController();
	private static final Scanner leia = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		criarContasTeste();
		
		do {
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLUE_BACKGROUND);	
		System.out.println("*******************************************************");
		System.out.println("                                                       ");
		System.out.println("                    SISTEMA USUÁRIOS                   ");
		System.out.println("                                                       ");
		System.out.println("*******************************************************");
		System.out.println("                                                       ");
		System.out.println("                  1 - CRIAR USUÁRIO                    ");
		System.out.println("                  2 - LISTAR TODOS USUÁRIOS            ");
		System.out.println("                  3 - TESTAR TODOS USUÁRIOS            ");
		System.out.println("                  0 - SAIR                             ");
		System.out.println("                                                       ");
		System.out.println("*******************************************************");
		
		
		
		
		
		
		System.out.println("                                                       ");
		System.out.println("*******************************************************");
		System.out.println("                 DIGITE UMA OPÇÃO                      ");
		System.out.println("*******************************************************");
		
	
	
	
	
	try {
		opcao = leia.nextInt();
		leia.nextLine();
	} catch(InputMismatchException e) {
		opcao = -1;
		System.out.println("\nDigite um número entre 0 e 6");
		leia.nextLine();
	}
	
	if(opcao == 0) {
		System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + "SISTEMA USUARIOS MIL GRAU  - SEMPRE COM VOCE");
	}
	
	switch(opcao) {
	
	case 1:
		System.out.println("Criar usuário \n\n");
		cadastrarConta();
		keyPress();
		break;
	
	case 2:
		System.out.println("Listar contas \n\n");
		listarTodas();
		keyPress();
		
		break;
	case 3:
		System.out.println("Testar Usuários \n\n");
		usuariosController.testarUsuarios();
		keyPress();
		
		break;	
	
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
		
		// TODO Auto-generated method stub
		usuariosController.listarTodas();
		
	}

	
	public static void  criarContasTeste() {
		
		
		usuariosController.cadastrar(new Usuario(usuariosController.gerarNumero(),"Roberto Silva", "a@a.com"));
		usuariosController.cadastrar(new UsuarioAdm(usuariosController.gerarNumero(), "Marcia Condarco", "a@a.com", "2"));
		usuariosController.cadastrar(new UsuarioAdm(usuariosController.gerarNumero(), "ANDRE", "ANDRE", "2"));
		usuariosController.cadastrar(new Usuario(usuariosController.gerarNumero(), "", ""));
	} 

	
	public static void cadastrarConta() {
		System.out.println("Digite o nome do usuário: ");
		String nome = leia.nextLine();
		System.out.println("Digite o e-mail do usuario: ");		
		String email = leia.nextLine();
		System.out.println("Digite o tipo da Nível de acesso: (1 -Usuario || 2 - ADM) ");
		String tipo = leia.nextLine();
		
		
		 
		switch(tipo) {
		
		case "1" ->{
			
			usuariosController.cadastrarUser(new Usuario(usuariosController.gerarNumero(), nome, email));
		}
		case "2" ->{			

			usuariosController.cadastrarUser(new UsuarioAdm(usuariosController.gerarNumero(),nome, email, tipo ));
		}
		default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválida!" + Cores.TEXT_RESET);
		}
	}
}
