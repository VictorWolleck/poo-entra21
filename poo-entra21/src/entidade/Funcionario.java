package entidade;

public class Funcionario {

	private String nome;
	private int idade;
	private double salarioBruto;
	private String cpf;
	private String dataDeAdmiss�o;

	public double calcularSalarioLiquido(double salarioBruto) {

		double salarioLiquido = salarioBruto * (0.6 / 100);

		return salarioLiquido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataDeAdmiss�o() {
		return dataDeAdmiss�o;
	}

	public void setDataDeAdmiss�o(String dataDeAdmiss�o) {
		this.dataDeAdmiss�o = dataDeAdmiss�o;
	}

}
