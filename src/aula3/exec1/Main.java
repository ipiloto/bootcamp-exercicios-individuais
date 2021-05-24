package aula3.exec1;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		Pessoa ana = new Pessoa("Ana", "1");
		Pessoa bernardo = new Pessoa("Bernardo", "2");
		Pessoa caue = new Pessoa("Caue", "3");
		Pessoa daniel = new Pessoa("Daniel", "4");
		
		Pessoa[] arrayPessoas = {bernardo, caue ,ana , daniel};
		
		System.out.println(ana.precedeA(bernardo));
		System.out.println(bernardo.precedeA(ana));
		
		System.out.println(Arrays.toString(arrayPessoas));
		SortUtil.sort(arrayPessoas);
		System.out.println(Arrays.toString(arrayPessoas));
		
		
		System.out.println("===============================\n");
		
		
		Celular celular1 = new Celular("1123", "a");
		Celular celular2 = new Celular("2151551", "b");
		Celular celular3 = new Celular("3848484848", "c");
		Celular celular4 = new Celular("444", "d");
		
		Celular[] arrayCelular = {celular3, celular4, celular1, celular2};
		System.out.println(Arrays.toString(arrayCelular));
		SortUtil.sort(arrayCelular);
		System.out.println(Arrays.toString(arrayCelular));
		
	}
}
