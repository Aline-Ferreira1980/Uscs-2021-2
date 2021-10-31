package urijudge;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer peca, numeroPeca;
		Double valorTotal = null, valorPeca, valorGeral= 0.0;;
		DecimalFormat df = new DecimalFormat("###0.00");
		 
		
		peca = sc.nextInt();
		numeroPeca = sc.nextInt();
		valorPeca = sc.nextDouble();
		valorTotal = valorPeca * numeroPeca;
		valorGeral = valorGeral + valorTotal;
		peca = sc.nextInt();
		numeroPeca = sc.nextInt();
		valorPeca = sc.nextDouble();
		valorTotal = valorPeca * numeroPeca;
		
	
		valorGeral = valorGeral + valorTotal;
		
		
		System.out.println("VALOR A PAGAR: R$ " + df.format(valorGeral));
		
		sc.close();

	}

}
