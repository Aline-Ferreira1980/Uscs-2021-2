package uscs;

public class Teste_PilhaChar {

	public static void main(String[] args) {
		
		Pilha_Char pilha = new Pilha_Char(100);

		pilha.Push('a');
		pilha.Push('#');
		pilha.Push('@');
		
		pilha.Imprime_Pilha();
		
		pilha.Pop();
		pilha.Imprime_Pilha();
		
		//pilha.Emplilhar_Char();

		pilha.ValidaExpressaoAritmetica();
		
		pilha.Imprime_Pilha();
	}
	

}
