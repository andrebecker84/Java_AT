package cafeteria.model.domain;

public class ProdutoCafe extends Produto {

	// Atributos da classe filha Produto
		private int codigo;
		private String origem;         // regiao, importado, nacional
		private String intensidade;    // suave, média, intensa
		private String tipoMetodo;     // grãos, torrados e moídos, cápsulas, drip coffee, sachês, solúveis, moagens especiais, microlotes
		private String caracteristica; // orgânico, descafeinado, aromatizado, especiais(premiados)
		
	// mensagem
		@Override
		public String toString() {
			return super.toString() + "; Café: " + origem;
		}
		
	// Getters & Setters	
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getOrigem() {
			return origem;
		}
		public void setOrigem(String origem) {
			this.origem = origem;
		}
		public String getIntensidade() {
			return intensidade;
		}
		public void setIntensidade(String intensidade) {
			this.intensidade = intensidade;
		}
		public String getTipoMetodo() {
			return tipoMetodo;
		}
		public void setTipoMetodo(String tipoMetodo) {
			this.tipoMetodo = tipoMetodo;
		}
		public String getCaracteristica() {
			return caracteristica;
		}
		public void setCaracteristica(String caracteristica) {
			this.caracteristica = caracteristica;
		}
	
}