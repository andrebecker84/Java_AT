package cafeteria.model.domain;

import java.util.List;

public class Loja {

	// Atributos
		private Integer id;
		private String nome;
		private String email;
		private String localidade;
		private int anoFundacao;
	
	// Relacionamento com Funcionario (1/1)
		private Funcionario funcionario;
		
	// Relacionamento com Produto (1/MUITOS) e (MUITOS/MUITOS)
		private List<Produto> produtos;
	
	// Mensagem de retorno com o nome da Loja
		@Override
		public String toString() {
			return "Loja " + nome;
		}
	
	// Getters & Setters
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getLocalidade() {
			return localidade;
		}
		public void setLocalidade(String localidade) {
			this.localidade = localidade;
		}
		public int getAnoFundacao() {
			return anoFundacao;
		}
		public void setAnoFundacao(int anoFundacao) {
			this.anoFundacao = anoFundacao;
		}

		public Funcionario getFuncionario() {
			return funcionario;
		}

		public void setFuncionario(Funcionario funcionario) {
			this.funcionario = funcionario;
		}

		public List<Produto> getProdutos() {
			return produtos;
		}

		public void setProdutos(List<Produto> produtos) {
			this.produtos = produtos;
		}
	
}