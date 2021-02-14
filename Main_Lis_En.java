public class Main_Lis_En {
	public static void main (String [] args){

		ListaEncadeada lista = new ListaEncadeada ();
		lista.display ();
		lista.inserir (0, 23);
		lista.inserir (1, 11);
		lista.inserir (2, 90);
		lista.inserir (2, 80);
		lista.inserir (1, 120);
		lista.inserirInicio (10);
		lista.removerInicio ();
		lista.remover (2);
		lista.display ();
		//System.out.println ("Quantidade Items:" + lista.quantItems);
	}

}
