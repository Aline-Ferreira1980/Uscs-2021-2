package provaCido;
public class Teste_Tree_Int {

	public static void main(String[] args) {
		
		Node_Tree no_8 = new Node_Tree(8);
		Node_Tree no_5 = new Node_Tree(5);
		Node_Tree no_7 = new Node_Tree(7);
		Node_Tree no_6 = new Node_Tree(6);
		Node_Tree no_2 = new Node_Tree(2);
		Node_Tree no_1 = new Node_Tree(1);

		
		no_5.parent = null;
		no_5.firstChild = no_8;
		no_5.next = no_6;
		
		
		no_8.parent = no_5;
		no_8.firstChild = null;
		no_8.next = no_7;
		
		no_7.parent = no_5;
		no_7.firstChild = null;
		no_7.next = null;

		
		no_6.parent = no_5;
		no_6.firstChild = no_2;
		no_6.next = no_1;
		
		no_2.parent = no_2;
		no_2.firstChild = null;
		no_2.next = no_1;
		
		no_1.parent = no_2;
		no_1.firstChild = null;
		no_1.next = null;
		
		System.out.println("************  Preorder  **********");
		System.out.println(" ");
		no_5.imprimeMaxFilho();
		
//		no_5.imprimeDadoPaiNo();
//		no_2.imprimeFilho();
//		no_2.imprimeFilhosFolha();
		
		
	}

}
