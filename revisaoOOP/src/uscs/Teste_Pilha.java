package uscs;

public class Teste_Pilha {

	public static void main(String[] args) {
		
		
		Pilha_Int pilha = new Pilha_Int(50);
		
		pilha.Imprime_Pilha();
		pilha.push(5);
		pilha.push(10);
		pilha.push(8);
		pilha.Imprime_Pilha();
		
		pilha.pop();
		pilha.Imprime_Pilha();		
		
		pilha.Top();
		
		pilha.push(100);
		pilha.Imprime_Pilha();
		pilha.Top();
		
		pilha.Resto_Pilha();
		
		
	}

}
