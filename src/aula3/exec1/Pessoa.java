package aula3.exec1;

public class Pessoa implements Precedente<Pessoa>{

	private String nome;
	private String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public boolean precedeA(Precedente<Pessoa> precedente) {
		Pessoa pessoa = (Pessoa) precedente;
		return this.nome.compareTo(pessoa.getNome()) < 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	@Override
	public String toString() {
		return cpf +" - "+ nome;
	}

}
