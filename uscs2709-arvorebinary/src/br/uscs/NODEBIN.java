package br.uscs;

public class NODEBIN {

	Integer item;
	NODEBIN parent;
	NODEBIN left;
	NODEBIN right;

	public NODEBIN(Integer item) {
		this.item = item;
		this.parent = null;
		this.left = null;
		this.right = null;

	}

	public boolean isEmpty() {
		if (this.item == null)
			return true;
		else
			return false;
	}

	public NODEBIN left() {
		if (this.left == null)
			return null;
		else
			return this.left;

	}

	public NODEBIN right() {
		if (this.right == null)
			return null;
		else
			return this.right;

	}

	public boolean isRight() {
		if (this.right != null)
			return true;
		else
			return false;
	}

	public boolean isLeft() {
		if (this.right != null)
			return true;
		else
			return false;
	}

	public void binaryPreorder() {
		System.out.print(this.item + " ");

		if (this.isLeft())
			this.left.binaryPreorder();

		if (this.isRight())
			this.right.binaryPreorder();
	}

	public void binaryPosorder() {

		if (this.isLeft())
			this.left.binaryPosorder();
		if (this.isRight())
			this.right.binaryPosorder();

		System.out.print(this.item + " ");
	}

	public void binaryInorder() {

		if (this.isLeft())
			this.left.binaryInorder();

		System.out.print(this.item + " ");

		if (this.isRight())
			this.right.binaryInorder();

	}

//	public void addNode(int chave, String nome) {
//		SearchTreeNode newNode = new SearchTreeNode(chave, nome);
//
//		if (root == null)
//			this.insert_root(newNode);
//		else {
//			SearchTreeNode NodeTrab = this.root;
//			while (true) {
//				if (chave < NodeTrab.key) {
//					if (NodeTrab.left == null) {
//						NodeTrab.left = newNode;
//						newNode.parent = NodeTrab;
//						newNode.nome = nome;
//						return;
//					} else
//						NodeTrab = NodeTrab.left;
//				}
//
//				else {
//					if (NodeTrab.right == null) {
//						NodeTrab.right = newNode;
//						newNode.parent = NodeTrab;
//						newNode.nome = nome;
//						return;
//					} else
//						NodeTrab = NodeTrab.right;
//				}
//			}
//		}
//
//	}
}
