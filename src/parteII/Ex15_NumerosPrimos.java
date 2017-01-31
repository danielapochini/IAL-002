package parteII;
import java.util.Scanner;

/*	15. Números primos - 
   	Um número é dito ser primo quando é divisível somente por si
   	e pela unidade. Faça um algoritmo que verifica, através de uma função, 
   	se um número é ou não primo.
	
	[Dica: divida o número N por todos os números de 2 a N-1. Se o resto da divisão
	de N por algum dos números der zero, ele não é primo] 	*/

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
