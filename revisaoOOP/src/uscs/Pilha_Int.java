package uscs;

public class Pilha_Int {

	int[] pilha;
	int topo;

	Pilha_Int(int objeto) {
		pilha = new int[objeto];
		this.topo = -1;
	}

	Pilha_Int() {
	}

	public int getTopo() {
		return topo;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}

	public void push(int empilha) {

		if (this.topo >= pilha.length -1) {
			System.out.println("Pilha cheia!");
		}else {
			this.topo +=1;
			pilha[this.topo]= empilha;
		}
		
	}

	public Integer pop() {

		if (this.topo<= - 1) {
			System.out.println("Pilha está vazia");
			return null;
			
		}else {
			
			this.topo = this.topo -1;
			return (pilha[this.topo+1]);
			
		}
	}

	public void Imprime_Pilha() {
		int topoEntrada = this.topo;
		System.out.println("Pilha: ");
		
		if(topoEntrada <=-1) {
			
			System.out.println("Pilha está vazia!!!");
			
		}else {
			
			while(topoEntrada >= 0) {
				System.out.println(" "+ pilha[topoEntrada]);
				topoEntrada = topoEntrada - 1;
			}
		}
		System.out.println(" ");
	}
	

	public void Top() {
		if (topo <= -1)
			System.out.println("Pilha está vazia!");
		else
			System.out.println("O último elemento da fila é: " + pilha[this.topo]);
	}

	public int Resto_Pilha() {
		int resto = 0;
		
		if( pilha.length == topo -1) {
			System.out.println("A pilha está cheia!");
		}
		else {
			for(int i=0; i<=topo; i++) {
			
				resto = pilha.length - (i+1);

			}
			System.out.println("Faltam "+ (resto )+ " elementos para completar a pilha");
		}
		return resto;
	}

}
