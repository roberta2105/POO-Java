package Contas;

public class ContaPoupancaEspecial extends ContaPoupanca {
	
	private double cartaoDebito;
	
	
	@Override
	public String toString() {
		return "ContaPoupancaEspecial [cartaoDebito=" + cartaoDebito + ", getCartaoDebito()=" + getCartaoDebito()
				+ ", getRendimento()=" + getRendimento() + ", toString()=" + super.toString() + ", getTitular()="
				+ getTitular() + ", getNumero()=" + getNumero() + ", getSaldo()=" + getSaldo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public double getCartaoDebito() {
		return cartaoDebito;
	}

	public void setCartaoDebito(double cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}

}
