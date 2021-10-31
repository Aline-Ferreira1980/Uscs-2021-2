package provaCido;


public class Node_Tree {
	Integer item;
	Node_Tree parent; // referencia para o pai
	Node_Tree firstChild; // referencia para filho à esquerda
	Node_Tree next; // referencia para proximo irmão

	// construtor para criação dos nós isolados (sem ligações)
	public Node_Tree(Integer dado) {
		this.item = dado;
		this.parent = null;
		this.firstChild = null;
		this.next = null;

	}

	// retorna true se o nó for interno, false se o nó for folha(sem filhos)
	public boolean EhInterno() {
		if (this.firstChild != null) {
			return true;
		} else
			return false;
	}

	// função EhFolha retorna true se o no for folha e false se o no não for folha
	public boolean EhFolha() {
		if (this.firstChild == null) {
			return true;
		} else
			return false;
	}

	// função que retorna a referencia do pai
	public Node_Tree pai() {
		if (this.parent == null) { // esse nó é root
			return null;
		} else
			return this.parent; // esse nó não é root
	}

	// função que retorna o dado armazenado do no(retorna informação do nó
	public Integer retornaDadoArmazenado() {
		return this.item;
	}

	// função para imprimir o dado armazenado no pai de um nó
	public void imprimeDadoPaiNo() {
		if (this.parent != null)
			System.out.println("O dado armazenado no pai é: " + this.parent.item);
		else
			System.out.println("Esse nó não tem pai!!!");
	}

	// função igual à ehFolha
	public boolean teste() {
		return firstChild == null ? true : false;
	}

	// impressão dos filhos do nó
	public void imprimeFilho() {

		if (this.firstChild == null) {
			System.out.println("Nó não tem filho");

		} else {

			Node_Tree noIrmao = this.firstChild;

			while (noIrmao != null) {

				System.out.println("Filho nº:" + noIrmao.item);

				noIrmao = noIrmao.next;
			}

			System.out.println("Acabaram os nos");
		}
	}
	

	public void imprimeFilhosFolha() {
		
		if(this.firstChild == null) {
			System.out.println("O No é folha");
		}else{
			Node_Tree auxiliar = this.firstChild;
			System.out.println("Os filhos folhas do nó " + this.item + " são: ");
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
			System.out.println("FirstChild é maior "+ this.firstChild.item);
		}
		else {
			System.out.println("Next é maior "+ this.next.item);
		}
	}
}


