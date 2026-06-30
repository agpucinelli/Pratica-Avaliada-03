package sistemaNotifica;

import java.util.InputMismatchException;
import java.util.Scanner;
import sistemaNotifca.util.Cores;
import sistemaNotifica.controller.notificaController;
import sistemaNotifica.model.Notifica;
import sistemaNotifica.model.NotificaSms;
import sistemaNotifica.model.notificaEmail;


public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);
	private static final notificaController notificaController = new notificaController();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao;
		System.out.println(Cores.TEXT_YELLOW_BOLD+"***********SISTEMA NOTIFICAÇÃO GENERATION***************"+Cores.TEXT_RESET);
		criarMsgTeste();
		
		

		do {
		System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLUE_BACKGROUND);	
		System.out.println("*******************************************************");
		System.out.println("                                                       ");
		System.out.println("                    SISTEMA NOTIFICAÇÃO                ");
		System.out.println("                                                       ");
		System.out.println("*******************************************************");
		System.out.println("                                                       ");
		System.out.println("                  1 - CRIAR MENSAGEM                   ");
		System.out.println("                  2 - LISTAR / TESTAR TODAS MENSAGENS  ");
		
		
		System.out.println("                  0 - SAIR                             ");
		System.out.println("                                                       ");
		System.out.println("*******************************************************"+ Cores.TEXT_RESET);
		
		
		
		
		
		try {
			opcao = leia.nextInt();
			leia.nextLine();
		} catch(InputMismatchException e) {
			opcao = -1;
			System.out.println("\nDigite um número inteiro entre 0 e 8");
			leia.nextLine();
		}
		
		if(opcao == 0) {
			System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + "BANCO MIL GRAU  - SEMPRE COM VOCE");
		}
		
		switch(opcao) {
		
		case 1:
			System.out.println("Criar Notificação \n\n");
			criarMsg();
			keyPress();
			break;
		
		case 2:
			System.out.println("Listar/Testar Notificação \n\n");
			enviarMsg();
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
		
		
	public static void enviarMsg() {
		notificaController.enviarMsg();
		
	}


	public static void  criarMsgTeste() {
		notificaController.criarMsg(new notificaEmail("ANDRE-1","Bem vindo ao sistema de Notificações da Generation", "a@a.com"));
		notificaController.criarMsg(new notificaEmail("ANDRE-2","Bem vindo ao sistema de Notificações da Generation", "11999999999"));
		notificaController.criarMsg(new NotificaSms("ANDRE-3","Bem vindo ao sistema de Notificações da Generation", "11999999999"));
		notificaController.criarMsg(new notificaEmail("ANDRE-4","Bem vindo ao sistema de Notificações da Generation", "andre"));
		notificaController.criarMsg(new notificaEmail("ANDRE-5","", "a"));
		notificaController.criarMsg(new NotificaSms("ANDRE-6","Bem vindo ao sistema de Notificações da Generation", "1199"));
		System.out.println(Cores.TEXT_GREEN_BOLD+"6 tipos de Mensagens teste criadas!"+Cores.TEXT_RESET);
		
	}

	public static void keyPress() {
	System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
	leia.nextLine();
	}	
	
	public static void criarMsg() {
		System.out.println("Digite o nome do Destinatario: ");
		String nome = leia.nextLine();
		System.out.println("Digite a mensagem: ");
		String msg = leia.nextLine();

		
		System.out.println("Digite o tipo da Nível de acesso: (1 -E-MAIL || 2 - SMS) ");
		int tipo = leia.nextInt();		
		 
		switch(tipo) {
		
		case 1 ->{
			System.out.println("Digite o endereço de e-mail: ");
			String email = leia.next();
			
			notificaController.criarMsg(new notificaEmail(nome,msg,email));
		}
		case 2 ->{			

			System.out.println("Digite o numero do telefone (Ex.11999999999): ");
			String telefone = leia.next();
			
			
			notificaController.criarMsg(new NotificaSms(nome,msg,telefone));
		}
		default -> System.out.println(Cores.TEXT_RED + "Tipo de Notificação inválida!" + Cores.TEXT_RESET);
		}
	
		
		
	}

}
