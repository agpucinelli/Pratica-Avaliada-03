package sistemaUsuarios.controller;

import java.util.ArrayList;
import java.util.List;

import sistemaUsuarios.model.Usuario;
import sistemaUsuarios.repository.usuariosRepository;

public class usuariosController implements usuariosRepository {
	
	private List<Usuario> listaUsuario = new ArrayList <Usuario>();
	int numero = 0;
	

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		for(var usuario: listaUsuario ) {
			usuario.visualizar();
		}
	}

	@Override
	public void cadastrar(Usuario usuario) {
		// TODO Auto-generated method stub
		listaUsuario.add(usuario);
		
		if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || !usuario.getEmail().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
			System.out.printf("Usuário %d criado %n", usuario.getNumero());
						
			}else {
		System.out.printf("Usuário %d criado %n", usuario.getNumero());
			}
		
		
            

        } 
	@Override
	public void cadastrarUser(Usuario usuario) {
		// TODO Auto-generated method stub
		
		
		if (usuario.getNome().isEmpty()) {
			System.out.printf("Usuário %d não foi criado, pois nome está vazio. %n", usuario.getNumero());
		}
			else if(usuario.getEmail().isEmpty()) {
				System.out.printf("O e-mail está vazio, preencha com um e-mail válido");
				
			}else if(!usuario.getEmail().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
				
				System.out.printf("Usuário %d não foi criado, O e-mail é inválido, por favor digite um e-mail válido.", usuario.getNumero() );
			}else {
				System.out.printf("Usuário %d criado %n", usuario.getNumero());
				listaUsuario.add(usuario);
			}
		
		
            

        } 
	
	
	@Override
	public void testarUsuarios() {
		// TODO Auto-generated method stub
		for(var usuario: listaUsuario ) {
			System.out.println("*********************************************");
			System.out.println("             DADOS DA CONTA                  ");
			System.out.println("*********************************************");
			System.out.printf("Numero da conta: %d%n", usuario.getNumero());
			System.out.printf("Nome: %s%n", usuario.getNome());
			System.out.printf("e-mail: %s%n", usuario.getEmail());
			System.out.println("Nível de acesso: Usuário");
			
			 if (usuario.getNome().isEmpty()) {
				 
				 			
					System.out.printf("Usuário está sem nome! %n");
					
					

		        } else {
		        	System.out.println("Nome: "+ usuario.getNome());
		        }
			 
			 
			 if (usuario.getEmail().isEmpty()) {
		            System.out.println("O e-mail está vazio/nulo ");
		            

		        }  else if (!usuario.getEmail().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
		            System.out.println("O e-mail está em formato inválido! ");

		        } else {
		        	System.out.println("Usuário Validado com Sucesso! ");
		            
		        }
		}
	}
	
	
	//METODO AUXILIAR
	
		public int gerarNumero() {
			return ++ numero;
			
		}

		
	
	
}
