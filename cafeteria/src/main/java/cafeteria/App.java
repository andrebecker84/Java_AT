package cafeteria;

import static spark.Spark.*; // Utilizando `import static` para simplificar o código

import cafeteria.controller.FuncionarioController;
import cafeteria.controller.UsuarioController;

public class App {
    public static void main(String[] args) {
    	
    	// Configuração das rotas e inicialização do Spark Java para a porta 8080
    		port(8080);
    	
        // Configurando as rotas usando lambda
        // Chamar a página `index.html`
    		get("/", (req, res) -> {return App.class.getResourceAsStream("/index.html");});
        
        // Usuário:
    		get("/usuario", new UsuarioController()); // Configurando as rotas pra camada controller do `Usuario()` com implementação do `handle`
        
        // Funcionário:
    	// Configuração de Rotas para o Contexto (GET, POST, DELETE)
    		get("/funcionario/lista", FuncionarioController.obterLista);
    		post("/funcionario/incluir", FuncionarioController.incluir);
    		delete("/funcionario/:id/excluir", FuncionarioController.excluir);
    		get("/funcionario/:id", FuncionarioController.obterPorId);
        
        
        // Exemplo de rota para listar todos os produtos
	    // Formatar os dados em JSON e retornar
        
        // Mensagem de inicialização da aplicação
	        System.out.println(".-----------------------------------------------------.");
	    	System.out.println("| Cafeteria Virtual Premium inicializada com sucesso! |");
	    	System.out.println("`-----------------------------------------------------`");
	    	System.out.println(" ");
    }
}