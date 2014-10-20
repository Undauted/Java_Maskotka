package com.example.servletjspdemo.domain;

public class Maskotka {
	private String imie;
	private String rodzaj;
	private String material;
	private String interaktywna;
	private String zdjecie;
	
	public Maskotka()
	{
		super();
	}
	
	public Maskotka(String imie,String rodzaj,String material,String interaktywna,String zdjecie)
	{
		this.setImie(imie);
		this.setRodzaj(rodzaj);
		this.material = material;
		this.interaktywna = interaktywna;
		this.zdjecie = zdjecie;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getRodzaj() {
		return rodzaj;
	}

	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getInteraktywna() {
		return interaktywna;
	}

	public void setInteraktywna(String interaktywna) {
		this.interaktywna = interaktywna;
	}

	public String getZdjecie() {
		return zdjecie;
	}

	public void setZdjecie(String zdjecie) {
		this.zdjecie = zdjecie;
	}

}
