package parteII;
import java.util.Scanner;

/* 	4.	Números pares
   	Escrever um procedimento que recebe dois números e 
	mostra na tela os números pares situados entre os dois, inclusive. 
	Testar com um programa que lê os números inicial e final e, 
	se este maior que o inicial, chama o procedimento. */

public class Ex04_NumerosParesEntreN1eN2 {
	
	public static void numPar(int n1,int n2){
		int i = n1;
		do {
			if (i % 2 != 0) {
				i = i++;
			}
			System.out.println(i);
			i = i + 2;
		} while (i <= n2);
	}
 
	public static void main(String[] args) {
		int n1,n2;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Escreva o Valor Inicial:");
		n1 = entrada.nextInt();
		
		System.out.println("Escreva o Valor Final:");
		n2 = entrada.nextInt();
		if(n2>n1){
			System.out.println("Os numeros pares contidos entre "+n1+" e "+n2+" são:");
			Ex04_NumerosParesEntreN1eN2.numPar(n1, n2);
		}else{
			System.out.println("Valor Final deve ser MAIOR que o Inicial");
		}
		entrada.close();
	}
 
}