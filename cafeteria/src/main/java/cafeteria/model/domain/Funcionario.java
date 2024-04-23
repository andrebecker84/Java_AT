package cafeteria.model.domain;

public class Funcionario {

	// Atributos:
		private Integer id; // Vai ser gerado de forma automática na classe da camada de serviço.
		
		private String nome;
		private String cargo;
		private float salario;
		
	// Construtor:
		public Funcionario() {
			this.setNome("Jimi Hendrix");
			this.setCargo("Barista");
			this.setSalario(1500);
		}
		
		public Funcionario(String nome) {
			this();
			this.setNome(nome);
		}
	
	// Mensagem de retorno com os dados do funcionario:
		@Override
		public String toString() {
			return String.format("%d : %s - %s - %.2f", id, nome, cargo, salario);  // Coloco os tipos: %d (Integer) - %s (string) - %s (string) e %.2f (float com 2 casas decimais) e depois as referencias (id, nome, cargo e salario).
		}
		
	// Getters & Setters:

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		public float getSalario() {
			return salario;
		}

		public void setSalario(float salario) {
			this.salario = salario;
		}
		
}