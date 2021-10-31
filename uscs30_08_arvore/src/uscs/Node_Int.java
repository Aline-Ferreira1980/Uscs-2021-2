package uscs;

public class Node_Int {
//definição da estrutura do nó da arvore.

	Integer item;
	Node_Int parent; // referencia para o pai
	Node_Int firstChild; // referencia para filho à esquerda
	Node_Int next; // referencia para proximo irmão

	// construtor para criação dos nós isolados (sem ligações)
	public Node_Int(Integer dado) {
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
	public Node_Int pai() {
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

			Node_Int noIrmao = this.firstChild;

			while (noIrmao != null) {

				System.out.println("Filho nº:" + noIrmao.item);

				noIrmao = noIrmao.next;
			}

			System.out.println("Acabaram os nos");
		}
	}
	

	public void imprimeFilhosFolha() {
		
		if(this.firstChild == null) {
			System.out.println("O No já é folha");
		}else{
			Node_Int auxiliar = this.firstChild;
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
}

//ret_Root(): retorna o node root da árvore
//parent(): retorna o pai do nó
//imprime_Parent(): imprime o dado armazenado no pai
//children(): retorna lista com os filhos do nó
//imprime_Filhos(): Imprime dados dos filhos do nó
//isInternal(): testa se nó é node interno
//isExternal(): testa se nó é node externo
//size(): retorna o número de nodes na árvore
//isEmpty(): testa se a árvore é vazia
//dept(): retorna o número de ancestrais do node
//height(): retorna a altura do node
//preorder(): retorna nodes em ordem preorder
//postorder(): retorna nodes em ordem postorder
//listNodes(): retorna uma coleção dos nodes da árvore
//replace(v,e): altera o dado em um determinado node