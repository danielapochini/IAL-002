package parteII;
import java.util.Scanner;

/*	10. Média de 3 - 
   	Declarar uma função que recebe e calcula a média aritmética 
   	de 3 números */

public class Ex10_MediaDeTresNumeros {
	
	public static double mediaAritmetica(int v1, int v2, int v3){
		int media=(v1+v2+v3)/3;
		return media;
	}

	public static void main(String[] args) {
		int v1; 
		int v2;
		int v3;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o primeiro valor:");
		v1 = entrada.nextInt();
		System.out.println("Digite o segundo valor");
		v2 = entrada.nextInt();
		System.out.println("Digite o terceiro valor:");
		v3 = entrada.nextInt();
		System.out.println("A média aritmetica dos três valores é: " +mediaAritmetica(v1, v2, v3));
		entrada.close();
	}

}
