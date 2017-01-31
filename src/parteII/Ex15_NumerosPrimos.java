package parteII;
import java.util.Scanner;

/*	15. N�meros primos - 
   	Um n�mero � dito ser primo quando � divis�vel somente por si
   	e pela unidade. Fa�a um algoritmo que verifica, atrav�s de uma fun��o, 
   	se um n�mero � ou n�o primo.
	
	[Dica: divida o n�mero N por todos os n�meros de 2 a N-1. Se o resto da divis�o
	de N por algum dos n�meros der zero, ele n�o � primo] 	*/

public class Ex15_NumerosPrimos {
	 public static boolean numPrimo (int numero){  
         for (int i = 2 ; i < numero; i++){  
             if (numero%i == 0) return false;  
         }  
         return true;  
    }  
	 
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor:");
		int valor = entrada.nextInt();
		System.out.println(numPrimo(valor));
		entrada.close();
	}

}
