package uscs;

public class SLPilha {
	Node topo;
	Integer size;

	public SLPilha() {
		this.topo = null;
		this.size = 0;
	}

	public void Push(Integer item) {
		Node x = new Node(item);
		if (this.size == 0)
			this.topo = x;
		else {
			x.next = this.topo;
			this.topo = x;
		}
		this.size++;
	}

	public void Pop() {
		if (this.topo == null)
			System.out.println("Erro no pop... Pilha vazia...");
		else {
			this.topo = this.topo.next;
			this.size--;
		}
	}

	public void Imprime_Pilha() {
		if (this.topo == null)
			System.out.println("Pilha vazia...");
		else {
			Node trab = this.topo;
			System.out.println("-----------------");
			System.out.println("Dados na pilha: ");
			while (trab != null) {
				System.out.println(trab.item + " ");
				trab = trab.next;
			}
		}
	}

	public void Top() {

		if (this.size == 0)
			System.out.println("Pilha vazia....");
		else
			System.out.println("Dado no topo: " + this.topo.item);

	}

	public Integer Qtde_Valores_SLPilha() {
		if (this.size == 0)
			System.out.println("Pilha sem elementos....");
		else
			System.out.println("Pilha tem " + this.size + " elementos...");

		return this.size;
	}

	public boolean Search_Topo(Integer K) {
		if (this.size == 0) {
			System.out.println("*****Chave " + K + " não existente!Pilha vazia....");

			return false;
		}
		if (this.topo.item.equals(K)) {
			System.out.println("*****Chave " + K + " concide com topo da pilha ....");

			return true;
		} else {
			System.out.println("*****Chave " + K + " NÃO concide com topo da pilha ....");

			return false;
		}
	}

	public void Clear_SLPilha() {
		this.topo = null;
		this.size = 0;
	}

	public void LoadSLPilha(Integer[] dados) {
		this.Clear_SLPilha();
		for (int i = 0; i < dados.length; i++)
			this.Push(dados[i]);

	}
}