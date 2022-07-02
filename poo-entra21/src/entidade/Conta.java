package entidade;

public class Conta {

	private String numeroDaAgencia;
	private String numeroDaConta;
	private double saldo;

	public Conta(String numeroDaAgencia, String numeroDaConta, double saldo) {
		super();
		this.numeroDaAgencia = numeroDaAgencia;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;

	}

	public Conta() {
		super();
	}

	public double sacar(double saque) {
		if (saque <= saldo) {
			return saldo = saldo - saque;
		} else {
			return saldo = 0;
		}
	}

	public double depositar(double deposito) {
		return saldo = (saldo += deposito);
	}

	public double efetuarRendimento(double taxaDeRendimento) {
		return saldo += (taxaDeRendimento / 100) * saldo;
	}

	public String getNumeroDaAgencia() {
		return numeroDaAgencia;
	}

	public void setNumeroDaAgencia(String numeroDaAgencia) {
		this.numeroDaAgencia = numeroDaAgencia;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

}
