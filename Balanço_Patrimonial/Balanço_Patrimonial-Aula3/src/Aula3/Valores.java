package Aula3;

import java.util.Random;

public class Valores {
	
		public int jan;
		public int fev;	
		public int mar;
		public int abr;
		public int mai;	
		public int jun;	
		public int jul;
		
		Random aleatorio = new Random();
		
		int valor = aleatorio.nextInt(100000);
		
		public Valores() {
			System.out.println("O objeto foi criado!");
		}
		
		public Valores(int jan, int fev, int mar) {
			this.jan= valor;
			this.fev= valor;
			this.mar= valor;
		}
		
		public Valores(int jan, int fev, int mar, int abr, int mai, int jun, int jul) {
			this.jan= valor;
			this.fev= valor;
			this.mar= valor;
			this.abr= valor;
			this.mai= valor;
			this.jun= valor;
			this.jul= valor;
		}
		}

	

