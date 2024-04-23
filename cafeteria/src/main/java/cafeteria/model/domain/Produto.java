package cafeteria.model.domain;

public class Produto {
    
	// Atributos da classe mãe
		private int codigo;
		private String tipo;
		private String classificacao;
		private int validade;
		private boolean disponibilidade;
		
	// Mensagem
		@Override
		public String toString() {
			return "Produto " + classificacao + tipo;
		}
		
	// Getters & Setters
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getClassificacao() {
			return classificacao;
		}
		public void setClassificacao(String classificacao) {
			this.classificacao = classificacao;
		}
		public int getValidade() {
			return validade;
		}
		public void setValidade(int validade) {
			this.validade = validade;
		}
		public boolean isDisponibilidade() {
			return disponibilidade;
		}
		public void setDisponibilidade(boolean disponibilidade) {
			this.disponibilidade = disponibilidade;
		}
		
	
}