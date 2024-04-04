package cafeteria.controller;

import cafeteria.model.Usuario;
import spark.Request;
import spark.Response;
import spark.Route;

public class UsuarioController implements Route {
	// Implementação através de uma interface para as rotas e lógica para manipulação dos usuários
	
	@Override
	public String handle(Request request, Response response) throws Exception {
		
		StringBuilder html = new StringBuilder();
		
		Usuario usuario = new Usuario();
		
		html.append(usuario);
		
		html.append("<a href='/'><br><br><-- Voltar</a>, " + usuario.getNome() + " ?");
		
		return html.toString();
	}
    
}