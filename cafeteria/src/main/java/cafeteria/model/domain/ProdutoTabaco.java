package cafeteria.model.domain;

public class ProdutoTabaco extends Produto {

	// Atributos da classe filha Produto
		private int codigo;
		private String origem;         // regiao, importado, nacional
		private String intensidade;    // suave, média, forte
		private String tipo;           // p/ enrolar, p/ cachimbo, rapé, kumbaya, mascar, charutos, cigarrilhas e cigarros
		private boolean premiado;      // especiais(premiados)
		
	// mensagem
		@Override
		public String toString() {
			return super.toString() + "; Tabaco: " + origem;
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
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public boolean isPremiado() {
			return premiado;
		}
		public void setPremiado(boolean premiado) {
			this.premiado = premiado;
		}	
			
}