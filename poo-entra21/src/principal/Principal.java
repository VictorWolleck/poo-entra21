package principal;

import model.repository.VacinaRepository;

public class Principal {

	public static void main(String[] args) {
		
		VacinaRepository teste = new VacinaRepository();
		
		teste.pesquisarTodas();
	}
}
