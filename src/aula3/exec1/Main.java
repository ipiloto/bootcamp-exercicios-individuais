package aula3.exec1;

public class Main {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Ana", "1");
		Pessoa pessoa2 = new Pessoa("Bernardo", "1");
		
		System.out.println(pessoa.precedeA(pessoa2));
		System.out.println(pessoa2.precedeA(pessoa));
		
	}
}
