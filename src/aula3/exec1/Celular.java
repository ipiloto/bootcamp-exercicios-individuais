package aula3.exec1;

public class Celular implements Precedente<Celular>{

	private String number;
	private String holder;
	
	public Celular(String nome, String cpf) {
		this.number = nome;
		this.holder = cpf;
	}

	@Override
	public boolean precedeA(Precedente<Celular> precedente) {
		Celular celular = (Celular) precedente;
		return this.number.compareTo(celular.getNumber()) < 0;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	@Override
	public String toString() {
		return holder +" - "+ number;
	}

}
