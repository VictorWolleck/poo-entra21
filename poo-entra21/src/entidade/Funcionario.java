package entidade;

public class Funcionario {

	private String nome;
	private double salario;
	private Endereco endereco;

	public Funcionario(String nome, double salario, Endereco endereco) {
		this.nome = nome;
		this.salario = salario;
		this.setEndereco(endereco);
	}

	
	
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", endereco=" + endereco + "]";
	}




	public double calcularPagamento() {
		return this.getSalario() - this.calcularDesconto();
	}

	private double calcularDesconto() {
		// TODO usar uma constante para o desconto
		return this.getSalario() * 0.15;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void toString(Endereco endereco1) {
		// TODO Auto-generated method stub

	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
