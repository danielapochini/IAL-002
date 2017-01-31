package parteII;
import java.util.Scanner;

/*	14. Fatorial - 
   	Faça uma função que recebe como parâmetro um inteiro e retorna 
   	seu fatorial. Utilize essa função para mostrar o Arranjo e a 
   	Combinação de n, tomados p a p, onde n e p são números inteiros. */

public class Ex14_Fatorial {
	
	public static long fatorial(int n){
		long fat=1;
		if(n!=0){
			for(int i = 1; i <= n; i++){
				fat=fat*i;
			}
		}
		return fat;
	}

	public static void main(String[] args) {
		double comb;
		double arran;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor para N: ");
		int n = entrada.nextInt();
		System.out.println("Digite um valor para P: ");
		int p = entrada.nextInt();
		arran= +fatorial(n)/+fatorial(n-p);
		comb = +fatorial(n)/(+fatorial(p)*+fatorial(n-p));
		System.out.println("A combinação simples dos valores é :" +comb);
		System.out.println("O arranjo simples dos valores é :" +arran);
		entrada.close();
	}

}
