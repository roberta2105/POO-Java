package Contas;

public class ContaCorrente extends Conta {
		
	private double tarifa;
	private double limite;
	
	public ContaCorrente(String nome) {
		this.setTitular(nome);
		
	}
		public double getTarifa() {
		return tarifa;
	}
		public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
		public double getLimite() {
		return limite;
	}
		public void setLimite(double limite) {
		this.limite = limite;
	}
		@Override
		public String toString() {
			return "ContaCorrente [tarifa=" + tarifa + ", limite=" + limite + "]";
		}
}
