package cafeteria.controller;

import cafeteria.model.domain.Funcionario;
import cafeteria.model.service.FuncionarioService;
import spark.Route;

public class FuncionarioController {

	// Recuperar todos os funcionários:
		public static Route obterLista = (req, res) -> {
			return FuncionarioService.obterLista();
		};
	
		
	// Incluir um novo funcionário:
		public static Route incluir = (req, res) -> {
			
			String nomeFunc = req.params("nome"); // recuperar o nome
			
			Funcionario funcionario = new Funcionario(nomeFunc); //incluir funcionário através do construtor já determinado na classe `Funcionario`
			
			FuncionarioService.incluir(funcionario); // pega o `funcionario` que foi definido acima baseado no construtor `new Funcionario()` e inclui na camada service.
			
			return "Inclusão do funcionário [ " +funcionario+ " ] realizada com sucesso!";
		};
	
		
	// Excluir um funcionário existente:
		public static Route excluir = (req, res) -> {
			
			Integer registro = Integer.valueOf(req.params("id"));
			
			Funcionario funcionario = FuncionarioService.obterPorId(registro); // Recuperar o `funcionario` pra poder utilizar na mensagem de retorno abaixo...
			
			FuncionarioService.excluir(registro); // Excluir pelo `id`.
			
			return "Exclusão do funcionário [ " +funcionario+ " ] realizada com sucesso!";
		};
		
		
	// Recuperar um funcionário:
		public static Route obterPorId = (req, res) -> {
			
			Integer registro = Integer.valueOf(req.params("id"));
			
			Funcionario funcionario = FuncionarioService.obterPorId(registro); // Recuperar o `funcionario` pra poder utilizar na mensagem de retorno abaixo...
			
			return "Recuperação do funcionário [ " +funcionario+ " ] realizada com sucesso!";
		};
}