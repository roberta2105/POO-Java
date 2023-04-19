package Contas;

public class Conta {
	
	public static int agencia;
	
		private String titular;
		private int numero;
		private double saldo;
		private String tipo;
  
		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(int saldo) {
				this.saldo = saldo;
		}
		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		
		//Construtor default
		
		public Conta () {
	  
  }
// Consrutor com parametros
  
//  		 public Conta(String nome) {
//  			  titular = nome;
//  			  }
  
		public void depositar(double valor) {
	  saldo += valor;
  }
		public void sacar(double valor) {
	  saldo -= valor;
  }

		
}
