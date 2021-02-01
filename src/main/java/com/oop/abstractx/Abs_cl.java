package com.oop.abstractx;

import java.io.Serializable;

public class Abs_cl implements Serializable {

	private String anakart;
	 private String seskart;
	 private String tvkart;
	 
	 
	 public Abs_cl() {
		 anakart="anakart modeli yazmadınız";
		 seskart="seskart modeli yazmadınız";
		 tvkart="tvkart modeli yazmadınız";
	 }

	public Abs_cl(String anakart, String seskart, String tvkart) {
		super();
		this.anakart = anakart;
		this.seskart = seskart;
		this.tvkart = tvkart;
		
	}
	
	
	public void bilgisayarOzellikleri() {
		System.out.println("\nAna Kartınız: " + getAnakart() + "\nSes Kartınız: " + getSeskart() +"\nTV Kartınız: " + getTvkart());
	}
	
	
	

	@Override
	public String toString() {
		return "Abs_cl [anakart=" + anakart + ", seskart=" + seskart + ", tvkart=" + tvkart + "]";
	}

	public String getAnakart() {
		return anakart;
	}

	public void setAnakart(String anakart) {
		this.anakart = anakart;
	}

	public String getSeskart() {
		return seskart;
	}

	public void setSeskart(String seskart) {
		this.seskart = seskart;
	}

	public String getTvkart() {
		return tvkart;
	}

	public void setTvkart(String tvkart) {
		this.tvkart = tvkart;
	}

	
	
}
