package cafeteria.controller;

import java.util.ArrayList;
import java.util.Arrays;

import cafeteria.model.Funcionario;
import spark.Route;

public class FuncionarioController {

	// Recuperar todos os funcionários:
		public static Route obterLista = (req, res) -> {
			
			// Criação da Lista de Funcionários e Retorno
			return new ArrayList<Funcionario>(
					
					// Adição de funcionários
					Arrays.asList(
							new Funcionario(),
							new Funcionario("Bob Dylan"),
							new Funcionario("Kurt Cobain"),
							new Funcionario("Ozzy Osbourne")
							)
					);
			};
	
	// Incluir um novo funcionário:
		public static Route incluir = (req, res) -> {
			return "Inclusão de funcionário";
		};
	
	// Excluir um funcionário existente:
		public static Route excluir = (req, res) -> {
			
			Integer index = Integer.valueOf(req.params("id"));
			
			return "Exclusão de funcionário " + index;
		};
		
	// Recuperar um funcionário:
		public static Route obterPorId = (req, res) -> {
			
			Integer index = Integer.valueOf(req.params("id"));
			
			return "Obter o funcionário " + index;
		};
	
}