package pessoas;

public class Gerente extends Assistente {
	
	private int senha;
	private int numeroFuncionarios;
	private double bonificacao;

	
	public double getBonificacao() {
		return super.getBonificacao() + (this.getSalario() * 0.15);
	}
	
	
	@Override
	public String toString() {
		return "Gerente [senha=" + senha + ", numeroFuncionarios=" + numeroFuncionarios + ", bonificacao=" + bonificacao
				+ ", getBonificacao()=" + getBonificacao() + ", getSenha()=" + getSenha() + ", getNumeroFuncionarios()="
				+ getNumeroFuncionarios() + ", toString()=" + super.toString() + ", getNome()=" + getNome()
				+ ", getCPF()=" + getCPF() + ", getSalario()=" + getSalario() + ", getNumeroIdentificacao()="
				+ getNumeroIdentificacao() + "]";
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public boolean autentica(int senha) {
		if (this.senha == 123) {
		System.out.println("Acesso autorizado!");
		return true;
		}
		else {
		System.out.println("Acesso negado!");
		return false;
		}
	}
	
}


