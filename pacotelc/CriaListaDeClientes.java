package ListaDeClientesA.pacotelc;

public class CriaListaDeClientes extends DefineCliente {
	
	public int quantidadeDeClientes;
	
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
		
		for(int lc = 0; lc < quantidadeDeClientes; lc++) {
			super.cliente();
		}

	}

}
