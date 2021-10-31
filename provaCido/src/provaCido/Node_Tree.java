package provaCido;


public class Node_Tree {
	Integer item;
	Node_Tree parent; // referencia para o pai
	Node_Tree firstChild; // referencia para filho � esquerda
	Node_Tree next; // referencia para proximo irm�o

	// construtor para cria��o dos n�s isolados (sem liga��es)
	public Node_Tree(Integer dado) {
		this.item = dado;
		this.parent = null;
		this.firstChild = null;
		this.next = null;

	}

	// retorna true se o n� for interno, false se o n� for folha(sem filhos)
	public boolean EhInterno() {
		if (this.firstChild != null) {
			return true;
		} else
			return false;
	}

	// fun��o EhFolha retorna true se o no for folha e false se o no n�o for folha
	public boolean EhFolha() {
		if (this.firstChild == null) {
			return true;
		} else
			return false;
	}

	// fun��o que retorna a referencia do pai
	public Node_Tree pai() {
		if (this.parent == null) { // esse n� � root
			return null;
		} else
			return this.parent; // esse n� n�o � root
	}

	// fun��o que retorna o dado armazenado do no(retorna informa��o do n�
	public Integer retornaDadoArmazenado() {
		return this.item;
	}

	// fun��o para imprimir o dado armazenado no pai de um n�
	public void imprimeDadoPaiNo() {
		if (this.parent != null)
			System.out.println("O dado armazenado no pai �: " + this.parent.item);
		else
			System.out.println("Esse n� n�o tem pai!!!");
	}

	// fun��o igual � ehFolha
	public boolean teste() {
		return firstChild == null ? true : false;
	}

	// impress�o dos filhos do n�
	public void imprimeFilho() {

		if (this.firstChild == null) {
			System.out.println("N� n�o tem filho");

		} else {

			Node_Tree noIrmao = this.firstChild;

			while (noIrmao != null) {

				System.out.println("Filho n�:" + noIrmao.item);

				noIrmao = noIrmao.next;
			}

			System.out.println("Acabaram os nos");
		}
	}
	

	public void imprimeFilhosFolha() {
		
		if(this.firstChild == null) {
			System.out.println("O No � folha");
		}else{
			Node_Tree auxiliar = this.firstChild;
			System.out.println("Os filhos folhas do n� " + this.item + " s�o: ");
			while(auxiliar.EhFolha()) {
				if(auxiliar.EhFolha()) {
				System.out.println(auxiliar.item + "");
			}
			auxiliar = auxiliar.next;
		}
		System.out.println("");
				}
	}
	
	public void preorder() {
		System.out.print(this.item + " ");

		while(true) {
		if (this.firstChild != null)
			this.firstChild.preorder();

		if (this.next !=null)
			this.next.preorder();
		}
	}
	
	public boolean isLeft() {
		if (this.firstChild != null)
			return true;
		else
			return false;
	}
	public boolean isRight() {
		if (this.next != null)
			return true;
		else
			return false;
	}
	
	public void imprimeMaxFilho() {
		if(this.firstChild.item > this.next.item) {
			System.out.println("FirstChild � maior "+ this.firstChild.item);
		}
		else {
			System.out.println("Next � maior "+ this.next.item);
		}
	}
}


