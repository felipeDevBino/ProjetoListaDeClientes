package ListaDeClientesA.pacotelc;

public class CriaListaDeClientes extends DefineCliente {
	
	public static int quantidadeDeClientes;
	public int posicaoNaLista;

	public void lista() {
		
		try {
			System.out.println("Digite quantos clientes deseja adicionar na lista:"); quantidadeDeClientes = Integer.parseInt(scanner.nextLine());
			if(quantidadeDeClientes <= 0) {
				System.out.println("Quantidade inválida!");
				lista();
			}
		}catch(NumberFormatException e) {
			System.out.println("Tipo de caracter numérico inválido, procure utilizar números inteiros: (1, 10, 100)\n");
			lista();
		}
		super.cliente();
		buscaNaLista();
	}

	public void buscaNaLista() {

		try {
			System.out.println("\nDigite o número da lista para ver o cliente específico (inicia em zero):"); posicaoNaLista = Integer.parseInt(scanner.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("Tipo de caracter numérico inválido, procure utilizar números inteiros: (1, 10, 100)");
			buscaNaLista();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida ou inexistente!");
			buscaNaLista();
		}catch(Exception e) {
			System.out.println("Posição inválida ou inexistente!");
			buscaNaLista();
		}

		if(posicaoNaLista >= 0 && posicaoNaLista < quantidadeDeClientes) {
			imprimeClienteDaLista(posicaoNaLista);	
		}else {
			System.out.println("Posição inválida!");
			buscaNaLista();
		}

	}

}
