package entidade;

import java.util.ArrayList;

public class PessoaFisica extends Pessoa {

	// Atributos
	private String cpf;
	private String dataNascimento;
	private char sexo;

	public PessoaFisica() {
		super();
		
	}

	public PessoaFisica(String nome, boolean adimplente, ArrayList<Conta> contas) {
		super(nome, adimplente, contas);
		
	}

	public PessoaFisica(String cpf, String dataNascimento, char sexo) {
		super();
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}

	
	@Override
	public boolean verificarAdimplente() {
		
		return false;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
