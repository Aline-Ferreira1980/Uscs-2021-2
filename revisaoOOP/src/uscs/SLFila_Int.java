package uscs;

public class SLFila_Int {
	public Integer size;
	public Node first;
	public Node last;

	public SLFila_Int() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}

	public void Enqueue(Integer n) {
		Node novo_node = new Node(n);
		if (this.size == 0) {
			this.first = novo_node;
			this.last = novo_node;
			this.size = this.size + 1;
		} else {

			this.last.next = novo_node;
			this.last = novo_node;
			this.size = this.size + 1;

		}
	}

	public Integer Dequeue() {
		if (this.size == 0) {
			System.out.println("Erro no Dequeue... Fila vazia...");
			return null;
		} else {

			if (this.size == 1) {
				Integer dado_retornado = this.first.item;
				this.first = null;
				this.last = null;
				this.size = 0;
				return dado_retornado;
			} else {
				Integer dado_retornado = this.first.item;
				this.first = this.first.next;
				this.size = this.size - 1;
				return dado_retornado;
			}

		}
	}

	public void Imprime_Fila() {
		if (this.size == 0)
			System.out.println("\nNão há dados para imprimir! Fila vazia...");

		else {

			Node Node_trab = this.first;
			System.out.println("\nDados na Fila: ");
			System.out.println("----------------");
			while (Node_trab != null) {
				System.out.print(Node_trab.item + " ");
				Node_trab = Node_trab.next;
			}
			System.out.println("");

		}
	}

	public void Primeiro() {
		if (this.size == 0)
			System.out.println("Primeiro elemento não existe. Fila vazia....");
		else
			System.out.print("\nPrimeiro elemento: " + this.first.item);

	}

	public void Ultimo() {
		if (this.size == 0)
			System.out.println("Último elemento não existe. Fila vazia....");
		else
			System.out.print("\nPrimeiro elemento: " + this.last.item);

	}

	public Integer Qtde_Valores_SLFila() {
		if (this.size == 0) {
			System.out.println("\nNão há elementos na Fila! Fila vazia....");

			return 0;
		} else {
			System.out.print("\nQtde de elementos na Fila: " + this.size);
			return this.size;
		}
	}

	public boolean Search_Primeiro(Integer K) {

		if (this.size == 0) {
			System.out.println("\n*****Chave " + K + " não existente! Fila vazia....");

			return false;
		}
		if (this.first.item.equals(K)) {
			System.out.println("\n*****Chave " + K + " concide com primeiro da Fila ....");
			return true;
		} else {
			System.out.println("\n*****Chave " + K + " NÃO concide com primeiro da Fila ....");

			return false;
		}
	}

	public void Clear_SLFila() {
		this.size = 0;
		this.first = null;
		this.last = null;
	}

	public void LoadSLFila(Integer[] dados) {
		this.Clear_SLFila();
		for (int i = 0; i < dados.length; i++)
			this.Enqueue(dados[i]);

	}
}