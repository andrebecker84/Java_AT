package cafeteria.model;

public class Funcionario {

	// Atributos
		private int registro;
		private String nome;
		private String cargo;
		private float salario;
		
	// Construtor
		public Funcionario() {
			this.setNome("Jimi Hendrix");
		}
		
		public Funcionario(String nome) {
			this();
			this.setNome(nome);
		}
	
	// Mensagem de retorno com os dados do funcionario
		@Override
		public String toString() {
			return "Funcionario [" + registro + " ]" + nome;
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