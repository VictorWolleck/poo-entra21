package entidade;

public class ChefeDeSecao extends Funcionario {

	public ChefeDeSecao(String nome, double salario, Endereco endereco) {
		super(nome, salario, endereco);
		
	}
	public double calcularSalarioLiquido() {
		return calcularSalarioLiquido() + calcularAdicional();
	}
	public double calcularAdicional() {
		return 300;
	}
}
