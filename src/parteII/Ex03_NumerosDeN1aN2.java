package parteII;
import java.util.Scanner;

/* 	3.	Numeração de N1 a N2 - 
   	Declarar um procedimento semelhante ao 2, 
   	mas que recebe como parâmetros os valores inicial e final. */

public class Ex03_NumerosDeN1aN2 {
	public static void n1_e_n2(int n1, int n2){
		for(int i=n1; i<=n2; i++){
			System.out.print(i+" ");			
		}
	}
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		int n1,n2;
		System.out.println("Número inicial: ");
		n1 = entrada.nextInt();
		System.out.println("Número final: ");
		n2 = entrada.nextInt();
		
		System.out.println("Imprimindo os valores de "+n1+" até "+n2+":");
		n1_e_n2(n1,n2);
		
		entrada.close();
	}	
}