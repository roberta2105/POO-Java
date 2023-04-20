package pessoas;

public class Funcionario {
	
	private String nome;
	private String CPF;
	private double salario;
	private int numeroIdentificacao;
	private double bonificacao;
	
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
	
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", CPF=" + CPF + ", salario=" + salario + ", numeroIdentificacao="
				+ numeroIdentificacao + ", bonificacao=" + bonificacao + ", getBonificacao()=" + getBonificacao()
				+ ", getNome()=" + getNome() + ", getCPF()=" + getCPF() + ", getSalario()=" + getSalario()
				+ ", getNumeroIdentificacao()=" + getNumeroIdentificacao() + "]";
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		CPF = this.CPF;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	
}
}
	
		