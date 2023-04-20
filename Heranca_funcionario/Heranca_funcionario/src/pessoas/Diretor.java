package pessoas;

public class Diretor extends Gerente {
	
	private double bonificacao;
	
	
	public double getBonificacao() {
		return super.getBonificacao() + (this.getSalario() * 0.10);
	}

	@Override
	public String toString() {
		return "Diretor [bonificacao=" + bonificacao + ", getBonificacao()=" + getBonificacao() + ", getSenha()="
				+ getSenha() + ", getNumeroFuncionarios()=" + getNumeroFuncionarios() + ", toString()="
				+ super.toString() + ", getNome()=" + getNome() + ", getCPF()=" + getCPF() + ", getSalario()="
				+ getSalario() + ", getNumeroIdentificacao()=" + getNumeroIdentificacao() + "]";
	}
	
		
}
