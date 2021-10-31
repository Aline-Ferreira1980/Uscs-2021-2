package uscs;

import java.util.Scanner;

public class Pilha_Char {

	Character[] pilha;
	int topo;

	public Pilha_Char(Character[] pilha, int topo) {
		this.pilha = pilha;
		this.topo = topo;
	}

	public Pilha_Char(int objeto) {
		this.pilha = new Character[objeto];
		this.topo = -1;
	}

	public int getTopo() {
		return topo;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}

	public void Push(Character fila) {

		if (this.topo >= pilha.length - 1) {
			System.out.println("Pilha cheia!");
		} else {
			this.topo += 1;
			pilha[this.topo] = fila;
		}
	}

	public Character Pop() {
		if (this.topo <= -1) {
			System.out.println("Pilha está vazia");
			return null;

		} else {

			this.topo = this.topo - 1;
			return (pilha[this.topo + 1]);

		}
	}

	public void Imprime_Pilha() {

		int topoEntrada = this.topo;
		System.out.println("Pilha: ");

		if (topoEntrada <= -1) {

			System.out.println("Pilha está vazia!!!");

		} else {

			while (topoEntrada >= 0) {
				System.out.println(" " + pilha[topoEntrada]);
				topoEntrada = topoEntrada - 1;
			}
		}
		System.out.println("");
	}

	public void Clear() {
		this.topo = -1;
	}

	public void Emplilhar_Char() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um texto: ");

		String letra = sc.nextLine();

		System.out.println("Entre com um caracter delimitador: ");

		String delimitador = sc.next();
		sc.close();

		Character token = delimitador.charAt(0);

		for (int i = 0; i < letra.length(); i++) {
			if (letra.charAt(i) == token) {
				this.Push(token);
				System.out.println(token + ", ");
			}
		}
	}

	public boolean ValidaExpressaoAritmetica() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a expressão aritmetica: ");
		String expressao = sc.next();
		sc.close();

		Integer numero = expressao.length();

		if (numero == 0) {
			System.out.println("Expressão nula!!!");
			return false;
		} else {
			for (int i = 0; i < numero; i++) {
				if (expressao.charAt(i) == '(')
					this.Push(expressao.charAt(i));
				else if (expressao.charAt(i) == ')') {
					// this.Push(expressao.charAt(i));
					if (this.topo == -1) {
						System.out.println("Fechamento de parenteses errado...");
						return false;
					} else
						this.Pop();
				}

			}
			if (this.topo != -1) {
				System.out.println("Fechamento de parenteses errado...");
				return false;
			}

			System.out.println("Expressão válida, parenteses colocados corretamente!");
			return true;
		}
	}
}