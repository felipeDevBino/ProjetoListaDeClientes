package ListaDeClientesA.pacotelc;

import java.util.Scanner;

public abstract class Clientes {

	public Scanner scanner = new Scanner(System.in);
	private String nome;
	private String email;
	private int idade;
	private int telefone;
	private int contador = 0;
	
	public void defineNome(String nome) {
		this.nome = nome;

	}
	
	public void defineEmail(String email) {
		this.email = email;

	}
	
	public void defineIdade(int idade) {
		this.idade = idade;
		
	}
	
	public void defineTelefone(int telefone) {
		this.telefone = telefone;
		
	}

	public void imprimeCliente() {
		
		contador++;
		
		System.out.println("\n========Novo Cliente " + contador + " Cadastrado========");
		System.out.println("\nNome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Idade: " + idade);
		System.out.println("Telefone: " + telefone);
		
	}
	
}
