package uscs;

public class Teste_SLFila {
	public static void main(String[] args) {
		
		SLFila_Int x = new SLFila_Int();
		x.Imprime_Fila();
		x.Enqueue(5);
		x.Enqueue(10);
		x.Enqueue(8);
		x.Imprime_Fila();
		x.Dequeue();
		x.Imprime_Fila();
		x.Primeiro();
		x.Ultimo();
		x.Qtde_Valores_SLFila();
		x.Search_Primeiro(10);
		x.Search_Primeiro(99);
		x.Clear_SLFila();
		Integer[] dados = { 10, 20, 30 };
		x.LoadSLFila(dados);
		x.Imprime_Fila();
	}
}