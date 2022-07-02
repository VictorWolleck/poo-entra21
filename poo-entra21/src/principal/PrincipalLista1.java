package principal;

import entidade.Conta;

public class PrincipalLista1 {

	public static void main(String[] args) {

		Conta conta1 = new Conta("123-7", "12345-6", 300);

		System.out.println("Saldo antes do saque:" + conta1.getSaldo()+ "\n");
		conta1.sacar(250);
		System.out.println("Saldo depois do saque:" + conta1.getSaldo()+ "\n");
		System.out.println("Saldo antes do segundo saque:" + conta1.getSaldo()+ "\n");
		conta1.sacar(300);
		System.out.println("Saldo depois do segundo saque:" + conta1.getSaldo()+ "\n");
		System.out.println("Saldo antes do deposito:" + conta1.getSaldo()+ "\n");
		conta1.depositar(200);
		System.out.println("Saldo depois do deposito:" + conta1.getSaldo()+ "\n");
		System.out.println("Saldo antes do rendimento 0,5%:" + conta1.getSaldo()+ "\n");
		conta1.efetuarRendimento(0.5);
		System.out.println("Saldo depois do rendimento 0,5%:" + conta1.getSaldo()+ "\n");
		System.out.println("Saldo antes do rendimento 0,8%:" + conta1.getSaldo()+ "\n");
		conta1.efetuarRendimento(0.8);
		System.out.println("Saldo depois do rendimento 0,8%:" + conta1.getSaldo()+ "\n");
		System.out.println("Saldo atual é:" + conta1.getSaldo()+ "\n");
	}

}
