package uscs;

public class Node_Int {

	Integer item;
	Node_Int parent;
	Node_Int firstChild;
	Node_Int next;

	public Node_Int(Integer dado) {
		this.item = dado;
		this.firstChild = null;
		this.parent = null;
		this.next = null;
	}

	public void imprimeFilhos() {
		if (this.firstChild == null) {
			System.out.println("Nó sem filhos...");
		} else {
			Node_Int trab = this.firstChild;
			while (trab != null) {
				System.out.println(trab.item);
				trab = trab.next;
			}
		}
	}

	public Node_Int pai() {
		if (this.parent == null)
			return null;
		else
			return this.parent;
	}

	public void imprimePai() {
		if (this.parent == null) {
			System.out.println("Nó raiz. Nada para ser impresso!");
		} else {
			System.out.println(this.parent.item);
		}
	}

	public boolean EhInterno() {
		if (this.firstChild != null) {
			return true;
		} else {
			return false;
		}
	}

	public void imprimeFilhosFolhas() {
		if (this.firstChild == null) {
			System.out.println("Nó sem filhos");
		} else {
			Node_Int trab = this.firstChild;
			while (trab != null) {
				if (!trab.EhInterno()) // nó é folha, quando não tem filho é folha / QUANDO NÃO TEM FILHO É FOLHA!!!
					System.out.println(trab.item);
				trab = trab.next;
			}
		}
	}

	public void DobrarFilhos() {
		if (this.firstChild == null) {

			System.out.println("Nó sem filhos");
		} else {
			Node_Int filho = this.firstChild;
			while (filho != null) {
				filho.item = filho.item * 2;
				filho = filho.next;
			}
		}
	}

	public void DobrarPai() {
		if (this.parent == null) {
			System.out.println("Nó não tem pai");
		} else {
			parent.item = parent.item * 2;
		}
	}
}
