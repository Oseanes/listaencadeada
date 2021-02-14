public class ListaEncadeada{
	
	Celula primeiroElemento;
	public int quantItems = 0;
	public ListaEncadeada (){
		this.primeiroElemento = null;
	}

	public void inserir (int posicao, int elemento){
		Celula novoElemento = new Celula (elemento);

		if ( quantItems == 0){
			//se for o primeiro elemento;
			primeiroElemento = novoElemento;
			quantItems ++;

		} else {
			//se a posição informada for igual a quantidade de item;
			// irá percorrer todo a lista;
			Celula elemAux0 = primeiroElemento; // elemAux0 irá auxiliar a percorrer a lista;
			if (posicao > 0 && posicao == quantItems){
				while (elemAux0.proximo != null){
				        elemAux0 = elemAux0.proximo;
				}

			elemAux0.proximo = novoElemento;
			quantItems ++;

			} else if (posicao > 0 && posicao < quantItems){
				Celula elemAux1 = primeiroElemento;

				for (int i = 0 ; i < posicao - 1 ; i ++){
					elemAux1 = elemAux1.proximo;
				}

				novoElemento.proximo = elemAux1.proximo;
				elemAux1.proximo = novoElemento;
				quantItems ++;
			}
		}
	}

	public void display () {

		Celula percorrer = primeiroElemento;
		while (percorrer != null){

			System.out.println (percorrer.elemento);
			percorrer = percorrer.proximo;
		}

		System.out.println (quantItems + ": Items");
	}


	public void inserirInicio (int elemento){

		Celula elemAux3 = primeiroElemento;
		Celula novoElemento = new Celula (elemento);
		novoElemento.proximo = primeiroElemento;
		primeiroElemento = novoElemento; 
		quantItems ++;
	}
	
	public void removerInicio (){
		 primeiroElemento = primeiroElemento.proximo;
		quantItems --;
	}
	
	public void remover (int posicao){
		int i = 0;
		Celula elemAux3 = primeiroElemento;
		Celula temporariaPonteiro = null;
		while (elemAux3 != null){
			if ( i == posicao){
				temporariaPonteiro = elemAux3.proximo;
				i = 0;
				break; 
			}
		elemAux3 = elemAux3.proximo;
		i ++;
		}
		Celula elemAux4 = primeiroElemento;
		while (elemAux4 != null){
			if (i == posicao - 1){
				elemAux4.proximo = temporariaPonteiro;
				break;
			}
		elemAux4 = elemAux4.proximo;
		i++;
		}
	quantItems --;
	}
}
