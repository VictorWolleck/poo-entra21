package entidade;

import java.util.ArrayList;

public abstract class Pessoa {

	private String nome;
	private boolean adimplente;
	private ArrayList<Conta> contas;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, boolean adimplente, ArrayList<Conta> contas) {
		super();
		this.nome = nome;
		this.adimplente = adimplente;
		this.contas = contas;
	}

	public abstract boolean verificarAdimplente();

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", adimplente=" + adimplente + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAdimplente() {
		return adimplente;
	}

	public void setAdimplente(boolean adimplente) {
		this.adimplente = adimplente;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}

}