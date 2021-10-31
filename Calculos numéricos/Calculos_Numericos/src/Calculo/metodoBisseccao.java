package Calculo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class metodoBisseccao {

	public static double funcao(double x) {
		double resultado;
		
		//A função deve ser mudada conforme o exercício
		
		//resultado = Math.pow(x,2) - 3*x -3;					// = x^2 - 3*x - 3 
		//resultado = Math.pow(x,2) - x - 4;					// = x^2 - x - 4
		//resultado = Math.log(x)/Math.log(2.71828182846) - 1; 	// = ln(x) - 1
		resultado = Math.pow(x,3) - 17;						// = x^3 - 17
		//resultado = Math.pow(x,1/4); 							// = raiz quarta (x)

		return resultado;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Intevalo inicial: ");
		double iI = in.nextDouble(); 				//intervaloInicial
		System.out.println("Intevalo Final: ");
		double iF = in.nextDouble();				//intervaloFinal
		double mI = 0;								//mediaIntervalos
		System.out.println("Número de iterações: ");
		double iteracao = in.nextDouble();
		in.close();
		
		
		
		for(int i = 0; i < iteracao; i++) {
			mI = (iI + iF)/2;
				if(funcao(mI) > 0 && funcao (iF) > 0) {
					BigDecimal valorArredondado = new BigDecimal (mI).setScale(4, RoundingMode.HALF_EVEN);
					if(i < iteracao -1)
						iF = valorArredondado.doubleValue();
					mI = valorArredondado.doubleValue();
					
				}
				else if(funcao(mI) < 0 && funcao (iI) < 0) {
					BigDecimal valorArredondado = new BigDecimal (mI).setScale(4, RoundingMode.HALF_EVEN);
					if(i < iteracao -1)
						iI =valorArredondado.doubleValue();
					mI = valorArredondado.doubleValue();
					
				}
				else
					break;
								
		}
		System.out.println("Intevalo Inicial = " + iI);
		System.out.println("Resultado = " + mI);
		System.out.println("Intervalo Final = " + iF);
		}

}




