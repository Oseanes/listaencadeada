/*
* A Classe Celula irá armazenar um dados do tipo int
* e uma referência tipo Celula;
*/

public class Celula{
	public  int elemento;
	 public Celula proximo;
	
	public Celula ( int elemento){
		this.elemento = elemento;
		proximo = null;
	}

	public int getElemento (){
		return elemento;
	}

}
