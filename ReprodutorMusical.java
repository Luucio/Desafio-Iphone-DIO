package dio.com.br.Lucio.Desafios;

public class ReprodutorMusical extends App implements Iphone {
	//Atributos
		private String musica;
		private int quantidadeMusica;
		private String album;
		private String favorito;

	//Método Construtor	
	public ReprodutorMusical(String musica, int quantidadeMusica, String album, String favorito) {
			super();
			this.musica = musica;
			this.quantidadeMusica = quantidadeMusica;
			this.album = album;
			this.favorito = favorito;
		}

	//Métodos
		@Override
		public void bloquearIphone() {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void desbloquarIphone() {
			// TODO Auto-generated method stub
			
		};
	
		@Override 
		public void abrirApp() {
		}
	
		@Override
		public void fecharApp() {
		}
		
		public void tocarMusica(String musica){
			
		}
		
		public void pausarMusica(String musica) {
			
		}
		
		public void selecionarMusica() {
			
		}
		
		public void selecionarAlbum(String album) {
			
		}
		
		public String adicionarFavorito() {
			return favorito;
		}
	//Métodos Assessores
		public String getMusica() {
			return musica;
		}

		public void setMusica(String musica) {
			this.musica = musica;
		}

		public int getQuantidadeMusica() {
			return quantidadeMusica;
		}

		public void setQuantidadeMusica(int quantidadeMusica) {
			this.quantidadeMusica = quantidadeMusica;
		}

		public String getAlbum() {
			return album;
		}

		public void setAlbum(String album) {
			this.album = album;
		}

		public String getFavorito() {
			return favorito;
		}

		public void setFavorito(String favorito) {
			this.favorito = favorito;
		}
		
		
}
