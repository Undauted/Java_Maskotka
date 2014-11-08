package jsp.pamiecrejestracji;

import java.util.ArrayList;
import java.util.List;

import jsp.rejestracja.Rejestracja;

public class PamiećRejestracji {

static List<Rejestracja> lista = new ArrayList<Rejestracja>();
	
	public static void dodaj(Rejestracja rejestracja)
	{
		Rejestracja rejestruj=new Rejestracja(rejestracja.getLogin(),rejestracja.getHaslo(),rejestracja.getImie(),rejestracja.getWiek());
		lista.add(rejestruj);
	}

	public void usun(int numer)
	{
		
		lista.remove(numer);
	}
	
	public List<Rejestracja> getAll()
	{
		return lista;
	}
	
	public void edytuj(int numer,Rejestracja haslo)
	{
		lista.set(numer, haslo);
	}
}
