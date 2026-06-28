package sistemaUsuarios.repository;

import sistemaUsuarios.model.Usuario;

public interface usuariosRepository {

	public void listarTodas();
	public void cadastrar(Usuario conta);
	public void cadastrarUser(Usuario conta);
	public void testarUsuarios();
	
	
}
