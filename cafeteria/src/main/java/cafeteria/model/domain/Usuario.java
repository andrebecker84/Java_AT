package cafeteria.model.domain;

public class Usuario {
    
	// Atributos
		private int registro;
		private String nome;
		private String email;
		private String idade;
		private boolean maiorIdade;
	
	// Construtor padrão
		public Usuario() {
			this.setNome("André Luis Becker");
		}

	// Construtor que receba o nome
		public Usuario(String nome) {
			this.setNome(nome); 
		}
	
	// Mensagem de sucesso na inclusão do usuário
		@Override
		public String toString() {
			return " + A inclusão do usuário " + nome + " foi realizada com sucesso!"; 
		}
	
	// Getters & Setters
		public int getRegistro() {
			return registro;
		}
	
		public void setRegistro(int registro) {
			this.registro = registro;
		}
		
		public String getNome() {
			return nome;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}
	
		public String getEmail() {
			return email;
		}
	
		public void setEmail(String email) {
			this.email = email;
		}
	
		public String getIdade() {
			return idade;
		}
	
		public void setIdade(String idade) {
			this.idade = idade;
		}
	
		public boolean isMaiorIdade() {
			return maiorIdade;
		}
	
		public void setMaiorIdade(boolean maiorIdade) {
			this.maiorIdade = maiorIdade;
		}
	
	
}