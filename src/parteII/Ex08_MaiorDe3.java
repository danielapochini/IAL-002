package parteII;
import java.util.Scanner;

/*	8. 	Maior de 3 - 
  	Escrever uma função que recebe 3 números e retorna o maior	*/

public class Ex08_MaiorDe3 {
	
	public static double maiorDeTres(int n1, int n2, int n3){
		if (n1>n2 && n1>n3){
			return n1;
		}
		if (n2>n1 && n2>n3){
			return n2;
		}else{
			return n3;
		}
	}

	public static void main(String[] args) {
		int n1 =0;
		int n2 =0;
		int n3 =0;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o primeiro valor:");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo valor:");
		n2 = entrada.nextInt();
		System.out.println("Digite o terceiro valor:");
		n3 = entrada.nextInt();
		System.out.println("O maior entre os três valores é: " +maiorDeTres(n1, n2, n3));
		entrada.close();
	}

}
