package br.uscs;

public class TesteBinaryTree {

	public static void main(String[] args) {

		NODEBIN no_50 = new NODEBIN(50);
		NODEBIN no_45 = new NODEBIN(45);
		NODEBIN no_70 = new NODEBIN(70);
		NODEBIN no_37 = new NODEBIN(37);
		NODEBIN no_46 = new NODEBIN(46);
		NODEBIN no_68 = new NODEBIN(68);
		NODEBIN no_89 = new NODEBIN(89);
		NODEBIN no_34 = new NODEBIN(34);
		

		no_50.parent = null;
		no_50.left = no_45;
		no_50.right = no_70;
		
		no_45.parent = no_50;
		no_45.left = no_37;
		no_45.right = no_46;
		
		no_70.parent = no_50;
		no_70.left = no_68;
		no_70.right = no_89;
		
		no_37.parent = no_45;
		no_37.left = no_34;
		no_37.right = null;
		
		no_46.parent = no_45;
		no_46.left = null;
		no_46.right = null;
		
		no_68.parent = no_70;
		no_68.left = null;
		no_68.right = null;
		
		no_89.parent = no_70;
		no_89.left = null;
		no_89.right = null;
		
		no_34.parent = no_37;
		no_34.left = null;
		no_34.right = null;
		
		System.out.println("************  Preorder  **********");
		System.out.println(" ");
		no_50.binaryPreorder();
		System.out.println();
		System.out.println("");
		System.out.println("************  Posorder  **********");
		System.out.println();
		no_50.binaryPosorder();
		System.out.println("");
		
		System.out.println();
		System.out.println("************  Inorder  **********");
		System.out.println("");
		no_50.binaryInorder();
	}

}
