package ListaDeClientesA.pacotelc;

import java.util.Scanner;

public abstract class Clientes {

	public Scanner scanner = new Scanner(System.in);
	protected String nome[];
	protected String email[];
	protected int idade[];
	protected int telefone[];

	public void defineAtributos() {
		this.nome = new String[CriaListaDeClientes.quantidadeDeClientes];
		this.email = new String[CriaListaDeClientes.quantidadeDeClientes];
		this.idade = new int[CriaListaDeClientes.quantidadeDeClientes];
		this.telefone = new int[CriaListaDeClientes.quantidadeDeClientes];
	}
	

	public void imprimeClienteCriado() {

		for(int icc = 0; icc < CriaListaDeClientes.quantidadeDeClientes - 1; icc++) {
			System.out.println("\n========Novo Cliente " + icc + " Cadastrado========");
			System.out.println("\nNome: " + nome[icc]);
			System.out.println("Email: " + email[icc]);
			System.out.println("Idade: " + idade[icc]);
			System.out.println("Telefone: " + telefone[icc]);
		}
		
	}
	
	public void imprimeClienteDaLista(int posicaoNaLista) {

		System.out.println("\n========Cliente " + posicaoNaLista + "========");
		System.out.println("\nNome: " + nome[posicaoNaLista]);
		System.out.println("Email: " + email[posicaoNaLista]);
		System.out.println("Idade: " + idade[posicaoNaLista]);
		System.out.println("Telefone: " + telefone[posicaoNaLista]);

	}

}
