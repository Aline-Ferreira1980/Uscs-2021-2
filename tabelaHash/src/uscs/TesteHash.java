package uscs;

public class TesteHash {

	public static Integer hash(Integer key) {
		return (key % 9);
	}

	public static void main(String[] args) {

		// Criado um vetor com Listas de Colis�es, por este motivo foi usada a classe
		// para que seja armazenada a lista em cada posi��o do vetor
		
		ListaColisao tabHash[] = new ListaColisao[10];

		for (int i = 0; i < tabHash.length; i++) {
			tabHash[i] = new ListaColisao();
			// System.out.print("Posi��o " + i + " da tabela hash: ");
			// tabHash[i].ImprimeLista();
		}

		Integer UniversoValores[] = {85,97,49,70,27,71,90,91,95};
		for (int i = 0; i < UniversoValores.length; i++) {
		
			tabHash[hash(UniversoValores[i])].InsereFim(UniversoValores[i]);
			// System.out.println("�ndice: " + i + " Valor: " + UniversoValores[i]);
		}

		for (int i = 0; i < tabHash.length; i++) {
			System.out.print("Posi��o " + i + " da tabela hash: ");
			tabHash[i].ImprimeLista();
		}

	}

}
//