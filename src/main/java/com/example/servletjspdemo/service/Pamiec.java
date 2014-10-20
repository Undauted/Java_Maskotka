package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Maskotka;


public class Pamiec {

	private List<Maskotka> lista = new ArrayList<Maskotka>();
	
	public void dodaj(Maskotka pluszak)
	{
		Maskotka maskotka=new Maskotka(pluszak.getImie(),pluszak.getRodzaj(),pluszak.getMaterial(),pluszak.getInteraktywna(),pluszak.getZdjecie());
		lista.add(maskotka);
	}
	
	public List<Maskotka> getAll()
	{
		return lista;
	}
	
	
}
