package principal;



import model.entities.Pesquisador;

import model.repository.PesquisadorRepository;


public class Principal {

	public static void main(String[] args) {
		
		PesquisadorRepository PesquisadorRep = new PesquisadorRepository();
		Pesquisador roger = new Pesquisador("Son Goku", "12345672364", 123455);
		
		
	
		
		PesquisadorRep.consultarPorId(12);
	


		
		
		
	}
}
