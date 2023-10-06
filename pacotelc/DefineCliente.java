package ListaDeClientesA.pacotelc;

public class DefineCliente extends Clientes {
	
	private String nome;
	private String email;
	private int idade;
	private int telefone;
	private int contador = 0;
	
	public void defineAtributos() {
		
		contador++;
		
		try {
			
		System.out.println("\n========Cadastrar Novo Cliente " + contador + "========");
		System.out.println("\nDigite o nome do(a) cliente:"); nome = scanner.nextLine();
		System.out.println("Digite o email do(a) cliente:"); email = scanner.nextLine();
		System.out.println("Digite a idade do(a) cliente:"); idade = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite o telefone do(a) cliente:"); telefone = Integer.parseInt(scanner.nextLine());
		
			if(nome.isEmpty()) {
				System.out.println("Nome/Email inválido!");
				contador--;
				defineAtributos();
			}
			if(email.isEmpty()) {
				System.out.println("Nome/Email inválido!");
				contador--;
				defineAtributos();
			}
			if(idade < 18) {
				System.out.println("O cliente não tem a idade mínima requerida!");
				contador--;
				defineAtributos();
			}
			
		}catch(NumberFormatException e) {
			System.out.println("Tipo de caracter numérico inválido, procure utilizar números inteiros: (1, 10, 100)");
			contador--;
			defineAtributos();
		}catch(NullPointerException d) {
			System.out.println("Objeto nulo/inválido!");
			contador--;
			defineAtributos();
		}
		
	}
	
	public void cliente() { 	
		defineAtributos();
		super.defineNome(nome);
		super.defineEmail(email);
		super.defineTelefone(telefone);
		super.defineIdade(idade);
		super.imprimeCliente();
	}

}
