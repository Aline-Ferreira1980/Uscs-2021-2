package Calculo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class metodoNewtonRaphson {
	
	public static double funcao(double x) {
		double resultado;
		//resultado = Math.pow(x,2) - 3; 			//Exercício 1 			- f(x) = x^2 - 3
		//resultado = Math.pow(x,2) - 7; 			//Exercício 2 			- f(x) = x^2 - 7
		resultado = Math.pow(x,2) - x - 5; 			//Exercício Atividade 	- f(x) = x^2 - x + 5
		return resultado;
	}
	
	public static double funcaoDerivada (double x){
		double resultado;
		//resultado = 2*x; 							//Exercício 1 			- f'(x) = 2*x
		//resultado = 2*x; 							//Exercício 2 			- f'(x) = 2*x
		resultado = 2*x - 1; 						//Exercício Atividade	- f'(x) = 2*x - 1
		return resultado;
	}
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Intevalo inicial: ");
		double iI = in.nextDouble(); 				//intervaloInicial
		System.out.println("Intevalo Final: ");
		double iF = in.nextDouble();				//intervaloFinal
		System.out.println("Erro: ");
		double erro = in.nextDouble();				//Erro do enunciado
		double calculoErro = 0;
		boolean comparaErro = false;
		
		int iteracao = 0;
		
		double X0 = iI;								//Iniciando com o Intevalo Inicial
		double X1 = 0;								//Somente iniciado um valor para não dar erro
		in.close();
		
		
		while(comparaErro == false) {
			X1 = X0 - (funcao(X0)/funcaoDerivada(X0));
			BigDecimal arredondamento = new BigDecimal (X1).setScale(4, RoundingMode.HALF_EVEN);
			X1 = arredondamento.doubleValue();
			calculoErro = X1 - X0;
			if(calculoErro < 0)
				calculoErro = calculoErro*-1;
		
			iteracao++;
			if(calculoErro < erro)
				comparaErro = true;
			X0 = X1;
		}
		System.out.println("\n----------------------\n");
		System.out.println("Resultado: " + X1);
		System.out.println("Número de iterações: " + iteracao);

	}
}
