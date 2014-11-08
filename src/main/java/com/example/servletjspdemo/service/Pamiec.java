package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Maskotka;
import jsp.pamiecrejestracji.*;

public class Pamiec {

	static List<Maskotka> lista = new ArrayList<Maskotka>();
	
	public static void dodaj(Maskotka pluszak)
	{
		Maskotka maskotka=new Maskotka(pluszak.getImie(),pluszak.getRodzaj(),pluszak.getMaterial(),pluszak.getInteraktywna(),pluszak.getZdjecie());
		lista.add(maskotka);
	}

	public void usun(int numer)
	{
		
		lista.remove(numer);
	}
	
	public List<Maskotka> getAll()
	{
		return lista;
	}
	

	
}
