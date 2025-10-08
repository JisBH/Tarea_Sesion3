package paquete;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	private String numero;
	private String titular;
	private Double saldo;
	private List <Movimiento> mMovimientos;
	
	
	public Cuenta(String numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.mMovimientos = new ArrayList<Movimiento>();
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public void ingresar(Double i) {
		this.saldo += i;		
	}

	public void retirar(Double i) {
		if(this.saldo - i >= -500)
			this.saldo -= i;
		else
			System.out.println("Fondos insuficientes (saldo " + this.saldo + "€ en la cuenta " + this.numero + " para el reintegro de " + i + "€");
	}

}
