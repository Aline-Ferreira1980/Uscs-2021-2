package uscs;

public class Teste_SLPilha {
	public static void main(String[] args) {
		SLPilha x = new SLPilha();
		x.Imprime_Pilha();
		x.Search_Topo(99);
		x.Top();
		x.Qtde_Valores_SLPilha();
		x.Push(5);
		x.Push(10);
		x.Push(8);
		x.Qtde_Valores_SLPilha();
		x.Search_Topo(99);
		x.Search_Topo(8);
		x.Top();
		x.Imprime_Pilha();
		x.Pop();
		x.Imprime_Pilha();
		x.Top();
		x.Qtde_Valores_SLPilha();
		x.Search_Topo(10);
		x.Search_Topo(8);
		x.Search_Topo(99);
		x.Clear_SLPilha();
		x.Imprime_Pilha();
		Integer[] dados = { 10, 20, 30 };
		x.LoadSLPilha(dados);
		x.Imprime_Pilha();
	}
}