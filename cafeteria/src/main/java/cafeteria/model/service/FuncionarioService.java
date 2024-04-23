package cafeteria.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cafeteria.model.domain.Funcionario;

public class FuncionarioService {
	// Implementação dos serviços relacionados aos funcionários
	
	// Criação de mapa para a classe: `Funcionario` nome: `funcionarios` visibilidade: `private` e definido como `static`:
	// O uso de `static` é para quando for chamar este serviço na camada de controle, não precisar ter que instanciar o objeto `FuncionarioService` pra usar o método...
		private static Map<Integer, Funcionario> funcionarios = new HashMap<Integer, Funcionario>();
		
	// Gerar o `id` do Funcionário automaticamente:
		private static Integer id = 0; 
		
	// Criação de métodos:
	// incluir (sem retorno, void) - receberá um objeto do tipo funcionario:
		public static void incluir(Funcionario funcionario) {
			
			funcionario.setId(++id); // incrementa o `id` com `++id` para utilizar abaixo no lugar e desta forma automatizar o processo de gerar id.
			
			funcionarios.put(funcionario.getId(), funcionario); // `id` é substituído por `funcionario.getId()` pra trazer o id já incrementado.
		}
		
		
	// excluir (sem retorno, void) - receberá a chave (id):
		public static void excluir(Integer id) {
			funcionarios.remove(id); // recebe informação do mapa `funcionarios` e `.remove(id)` pra remover por id;
		}
		
		
	// obterLista (coleção de funcionários) - não recebe nenhuma informação e tem relação com `funcionarios` da linha do Map<> acima:
		public static Collection<Funcionario> obterLista() {
			return funcionarios.values(); // recebe informação do mapa `funcionarios` e `.values()` pra retornar a coleção.
		}
		
		
	// obterPorId (recebe um funcionário) - receberá a chave (id):
		public static Funcionario obterPorId(Integer id) {
			return funcionarios.get(id); // recebe a informação do mapa `funcionarios` e retorna porId por isso `.get(id)`.
		}
}