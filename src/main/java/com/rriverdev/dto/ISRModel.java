package com.rriverdev.dto;

public class ISRModel {
	//select @Imp_ISR = round(10000 * 1.45 * 84 / (365 * 100), 2)
	
	private int cantidadPrincipal;
	private double iva;
	private int periodo;
	private int dias365;
	private int cien;
	private int dos;
	private double ISR;
	
	public ISRModel(int cantidadPrincipal, double iva, int periodo, int dias365, int cien, int dos, double iSR) {
		super();
		this.cantidadPrincipal = cantidadPrincipal;
		this.iva = iva;
		this.periodo = periodo;
		this.dias365 = dias365;
		this.cien = cien;
		this.dos = dos;
		ISR = iSR;
	}
 
	public double getISR() {
		return ISR;
	}

	public void setISR(double iSR) {
		ISR = iSR;
	}

	public int getDias365() {
		return dias365;
	}

	public void setDias365(int dias365) {
		this.dias365 = dias365;
	}
	
	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int getCien() {
		return cien;
	}

	public void setCien(int cien) {
		this.cien = cien;
	}

	public int getDos() {
		return dos;
	}

	public void setDos(int dos) {
		this.dos = dos;
	}

	public int getCantidadPrincipal() {
		return cantidadPrincipal;
	}

	public void setCantidadPrincipal(int cantidadPrincipal) {
		this.cantidadPrincipal = cantidadPrincipal;
	}
	
	
}
