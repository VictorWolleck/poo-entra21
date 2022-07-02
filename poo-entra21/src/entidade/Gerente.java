package entidade;

public class Gerente extends Funcionario {

	public Gerente() {
		super();

	}

	public double calcularSalarioLiquido(double salarioBruto, double comissao) {

		double salarioLiquido = salarioBruto * (0.6 / 100);
		salarioLiquido += comissao;
		return salarioLiquido;
	}

}
