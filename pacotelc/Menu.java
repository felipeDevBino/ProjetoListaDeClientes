package ListaDeClientesA.pacotelc;

public class Menu {

	public static void main(String[] args) {

		CriaListaDeClientes criaLista = new CriaListaDeClientes();
		criaLista.lista();
		
		criaLista.scanner.close();
		
	}

}
