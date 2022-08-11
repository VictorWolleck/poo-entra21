package entidade;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, boolean adimplente) {
		super(nome, adimplente);

	}

	public PessoaJuridica(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	@Override
	public boolean verificarAdimplente() {

		return false;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
