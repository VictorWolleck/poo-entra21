package entidade;

public class ChefeDeSecao extends Funcionario {

	public ChefeDeSecao(String nome, double salario) {
		super(nome, salario);
		
	}
	public double calcularSalarioLiquido() {
		return calcularSalarioLiquido() + calcularAdicional();
	}
	public double calcularAdicional() {
		return 300;
	}
}
