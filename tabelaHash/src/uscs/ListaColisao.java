package uscs;

public class ListaColisao {
	Integer size;
	Node first;
	Node last;
	
	public ListaColisao() {
		this.size = 0;
		this.first = null;
		this.last = null;
	}
	
	public void InsereFim(int valor) {
		Node NovoNo = new Node (valor);
		if(size == 0) {
			this.first = NovoNo;
			this.last = NovoNo;
			size++;
		}else {
			this.last.next = NovoNo;
			this.last = NovoNo; //Faz o nó last caminhar
			size++;
		}
	}
	
	public void ImprimeLista () {
		if(size == 0) {
			System.out.println("Lista vazia...");
		}else {
			Node aux = this.first;
			while(aux != null) {
				System.out.print(aux.item + " ");
				aux = aux.next;
			}
			System.out.println("");
		}
	}
}
