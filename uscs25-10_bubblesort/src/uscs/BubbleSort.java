package uscs;

import java.util.Arrays;

public class BubbleSort {

	public static int contador=0;

	public static void main (String [] args ) { 
		
		int[] lista1 = new int[100];
		lista1[0]=100;
		for(int i=1;i<lista1.length;i++)
			lista1[i]=lista1[i-1]-1;

		lista1 = bubble(lista1); 

		System.out.println("*********************************************************");
		System.out.println("Total de opera??es p/array com 100 posi??es:  " + contador);
		System.out.println (Arrays.toString(lista1) ) ; 
		
		contador = 0;
		int[] lista2 = new int[200];
		lista2[0]=200;
		for(int i=1;i<lista2.length;i++)
			lista2[i]=lista2[i-1]-1;

		lista2 = bubble(lista2); 
		
		System.out.println("********************************************************");
		System.out.println("Total de opera??es p/array com 200 posi??es:  " + contador);
		System.out.println (Arrays.toString(lista2) ) ; 
		
		contador=0;
		int[] lista3 = new int[300];
		lista3[0]=300;
		for(int i=1;i<lista3.length;i++)
			lista3[i]=lista3[i-1]-1;

		lista3 = bubble(lista3); 
		
		System.out.println("********************************************************");
		System.out.println("Total de opera??es p/array com 300 posi??es:  " + contador);
		System.out.println (Arrays.toString(lista3) ) ; 
		
		contador=0;
		int[] lista4 = new int[400];
		lista4[0]=400;
		for(int i=1;i<lista4.length;i++)
			lista4[i]=lista4[i-1]-1;

		lista4 = bubble(lista4); 
		
		System.out.println("********************************************************");
		System.out.println("Total de opera??es p/array com 400 posi??es:  " + contador);
		System.out.println (Arrays.toString(lista4) ) ; 
		
		contador=0;
		int[] lista5 = new int[500];
		lista5[0]=500;
		for(int i=1;i<lista5.length;i++)
			lista5[i]=lista5[i-1]-1;

		lista5 = bubble(lista5); 
		
		System.out.println("********************************************************");
		System.out.println("Total de opera??es p/array com 500 posi??es:  " + contador);
		System.out.println (Arrays.toString(lista5) ) ; 
		System.out.println("********************************************************");
	
	}
	public static int[] bubble(int[] lista) { 

		int aux; 
		int n = lista.length; 

		for (int i = 1; i < n ; i++ ) 
			for (int j = 1; j < n ; j ++) {
				if (lista[j-1]  > lista[j] )  { 
					contador++;
					aux = lista[j-1]; 
					lista[j-1] = lista[j]; 
					lista[j] = aux; 
				}
			}
		return lista; 
	}
}