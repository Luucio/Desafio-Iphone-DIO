package dio.com.br.Lucio.Desafios;

public class AparelhoTelefonico extends App implements Iphone{
	//Atributos
		private String numero;
		private String contatos;
		private int chamadasEfetuadas;
		private int chamadasAtendidas;
		private int chamadasDesligadas;
	//Método Construtor
		public AparelhoTelefonico(String numero, String contatos, int chamadasEfetuadas, int chamadasAtendidas,
				int chamadasDesligadas) {
			super();
			this.numero = numero;
			this.contatos = contatos;
			this.chamadasEfetuadas = chamadasEfetuadas;
			this.chamadasAtendidas = chamadasAtendidas;
			this.chamadasDesligadas = chamadasDesligadas;
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
		
		public int ligar() {
			return chamadasEfetuadas;
		}
		
		public int atender() {
			return chamadasAtendidas;
		}
		
		public int desligar() {
			return chamadasDesligadas;
		}
		

		public void correioDeVoz() {
			
		}
	//MétodosAssessores

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getContatos() {
			return contatos;
		}

		public void setContatos(String contatos) {
			this.contatos = contatos;
		}

		public int getChamadasEfetuadas() {
			return chamadasEfetuadas;
		}

		public void setChamadasEfetuadas(int chamadasEfetuadas) {
			this.chamadasEfetuadas = chamadasEfetuadas;
		}

		public int getChamadasAtendidas() {
			return chamadasAtendidas;
		}

		public void setChamadasAtendidas(int chamadasAtendidas) {
			this.chamadasAtendidas = chamadasAtendidas;
		}

		public int getChamadasDesligadas() {
			return chamadasDesligadas;
		}

		public void setChamadasDesligadas(int chamadasDesligadas) {
			this.chamadasDesligadas = chamadasDesligadas;
		}
}
