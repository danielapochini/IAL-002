package parteII;
/* 2. Numera��o de 1 a 100 - 
   Elaborar um procedimento que mostra os n�meros de 1 a 100.*/

public class Ex02_Numeros1A100 {
	public static void numeros_de_1_a_100_for(){
		for (int i=1; i<=100; i++){			
			System.out.print(i+" ");
		}
	}
	
	public static void numeros_de_1_a_100_while(){
		int i=1;
		while (i<=100) {
			System.out.print(i+" ");
			i++;			
		}
	}
	
	public static void numeros_de_1_a_100_dowhile(){
		int i=1;
		do{
			System.out.print(i+" ");
			i++;
		}while(i<=100);
	}
	
	public static void main(String[] args) {
		System.out.println("Imprimindo os n�meros:");
		numeros_de_1_a_100_for();
		System.out.println();
		numeros_de_1_a_100_while();
		System.out.println();
		numeros_de_1_a_100_dowhile();
	}
}
