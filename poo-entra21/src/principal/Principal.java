package principal;

import entidade.Endereco;
import entidade.Funcionario;

public class Principal {

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("12345", "Rua Roger Romeu", "45", "Prainha", "SC" );
		Funcionario jose = new Funcionario("José Augustus", 2500, endereco1);
		
		
		System.out.println(jose.toString());
		
	}
}
