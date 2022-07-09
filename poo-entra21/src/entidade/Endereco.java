package entidade;

public class Endereco {

	private String cep;
	private String logradouro;
	private String numero;
	private String bairro;
	private String estado;

	public Endereco() {
		super();
	}

	public Endereco(String cep, String logradouro, String numero, String bairro, String estado) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endere�o [cep=" + cep + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro
				+ ", estado=" + estado + "]";
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
