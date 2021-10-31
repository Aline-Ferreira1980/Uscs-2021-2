package urijudge;

import java.util.Scanner;

public class OMaior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a,b,c, maiorAB, maiorResultado;

		a = sc.nextInt();
		b=sc.nextInt();
		c = sc.nextInt();
		
		maiorAB = (a+b+Math.abs(a-b))/2;
		maiorResultado = (maiorAB + c+ Math.abs(maiorAB-c))/2;
		
		System.out.println( maiorResultado + " eh o maior");
		
		sc.close();
	}

}
