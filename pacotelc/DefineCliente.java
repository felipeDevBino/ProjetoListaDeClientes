package ListaDeClientesA.pacotelc;

public class DefineCliente extends Clientes {

	public void defineAtributos() {

		for(int c = 0; c < CriaListaDeClientes.quantidadeDeClientes; c++) {
			
			try {

			System.out.println("\n========Cadastrar Novo Cliente " + c + "========");
			System.out.println("\nDigite o nome do(a) cliente:"); nome[c] = scanner.nextLine();
			System.out.println("Digite o email do(a) cliente:"); email[c] = scanner.nextLine();
			System.out.println("Digite a idade do(a) cliente:"); idade[c] = Integer.parseInt(scanner.nextLine());
			System.out.println("Digite o telefone do(a) cliente:"); telefone[c] = Integer.parseInt(scanner.nextLine());
		
			if(nome[c].isEmpty()) {
				System.out.println("Nome/Email inválido!");
				defineAtributos();

			}else if(email[c].isEmpty()) {
				System.out.println("Nome/Email inválido!");
				defineAtributos();

			}else if(idade[c] < 18) {
				System.out.println("O cliente não tem a idade mínima requerida!");
				defineAtributos();
			}
			
			}catch(NumberFormatException e) {
				System.out.println("Tipo de caracter numérico inválido, procure utilizar números inteiros: (1, 10, 100)");
				defineAtributos();
			}catch(NullPointerException d) {
				System.out.println("Objeto nulo/inválido!");
				defineAtributos();
			}

		}

	}

	public void cliente() { 	
		super.defineAtributos();
		defineAtributos();
		super.imprimeClienteCriado();
	}

}
