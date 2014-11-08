package jsp.rejestracja;


public class Rejestracja {

	
		private String login;
		private String haslo;
		private String imie;
		private String wiek;
		
		public Rejestracja()
		{
			super();
		}
		
		public Rejestracja(String login,String haslo,String imie,String wiek)
		{
			this.setLogin(login);
			this.setHaslo(haslo);
			this.imie=imie;
			this.setWiek(wiek);
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getHaslo() {
			return haslo;
		}

		public void setHaslo(String haslo) {
			this.haslo = haslo;
		}

		public String getImie() {
			return imie;
		}

		public void setImie(String imie) {
			this.imie = imie;
		}

		public String getWiek() {
			return wiek;
		}

		public void setWiek(String wiek) {
			this.wiek = wiek;
		}

		

		
		

	}


