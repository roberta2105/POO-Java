package Contas;


public class ContaPoupanca extends Conta {
	
	private double rendimento;

		public ContaPoupanca() {
		}

		public double getRendimento() {
		return rendimento;
	}

		public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

		@Override
		public String toString() {
			return "ContaPoupanca [rendimento=" + rendimento + ", getRendimento()=" + getRendimento()
					+ ", getTitular()=" + getTitular() + ", getNumero()=" + getNumero() + ", getSaldo()=" + getSaldo()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}

		public void setCartaoDebito(int i) {
			
		}
}
