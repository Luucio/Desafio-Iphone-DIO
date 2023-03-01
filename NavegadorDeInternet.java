package dio.com.br.Lucio.Desafios;

public class NavegadorDeInternet extends App implements Iphone{
	//Atributos
		private int paginasAcessadas;
		private boolean acessoAnonimo;
		
	//Método Construtor
	public NavegadorDeInternet(int paginasAcessadas, boolean acessoAnonimo) {
			super();
			this.paginasAcessadas = paginasAcessadas;
			this.acessoAnonimo = acessoAnonimo;
		}
	//Métodos
		@Override
		public void bloquearIphone() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void desbloquarIphone() {
			// TODO Auto-generated method stub
			
		}
	
		@Override 
		public void abrirApp() {
		}
		
		@Override
		public void fecharApp() {
		}
		
		public void exibirPagina() {
			
		}
		
		public void atualizarPagina() {
			
		}
		
		public void adicionarNovaAba() {
			
		}
		
		public void fecharAba() {
			
		}
	//Métodos Assessores 
		public int getPaginasAcessadas() {
			return paginasAcessadas;
		}
		public void setPaginasAcessadas(int paginasAcessadas) {
			this.paginasAcessadas = paginasAcessadas;
		}
		public boolean isAcessoAnonimo() {
			return acessoAnonimo;
		}
		public void setAcessoAnonimo(boolean acessoAnonimo) {
			this.acessoAnonimo = acessoAnonimo;
		}
		
		
}
