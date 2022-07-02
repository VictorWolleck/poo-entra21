package entidade;

public class ChefeDeSecao extends Funcionario {

	public double calcularSalarioLiquido(double salarioBruto) {
		double adicionalChefe = 300;
		double salarioLiquido = salarioBruto * (0.6 / 100);
		return salarioLiquido + adicionalChefe;
	}

}
