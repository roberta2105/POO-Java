package Contas;

public class ContaCorrenteEspecial extends ContaCorrente {

	public ContaCorrenteEspecial(String nome) {
		super(nome);
	}
	
	private double cartãoCredito;
	private double cartãoInvestimento;
	
	public double getCartãoCredito() {
		return cartãoCredito;
	}
	public void setCartãoCredito(double cartãoCredito) {
		this.cartãoCredito = cartãoCredito;
	}
	public double getCartãoInvestimento() {
		return cartãoInvestimento;
	}
	public void setCartãoInvestimento(double cartãoInvestimento) {
		this.cartãoInvestimento = cartãoInvestimento;
	}
	@Override
	public String toString() {
		return "ContaCorrenteEspecial [cartãoCredito=" + cartãoCredito + ", cartãoInvestimento=" + cartãoInvestimento
				+ ", getCartãoCredito()=" + getCartãoCredito() + ", getCartãoInvestimento()=" + getCartãoInvestimento()
				+ ", getTarifa()=" + getTarifa() + ", getLimite()=" + getLimite() + ", toString()=" + super.toString()
				+ ", getTitular()=" + getTitular() + ", getNumero()=" + getNumero() + ", getSaldo()=" + getSaldo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	}
	
	

