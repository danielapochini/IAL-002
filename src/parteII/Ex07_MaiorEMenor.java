package parteII;
import java.util.Scanner;

/*	7. 	Maior e menor com menu - 
   	Faça duas funções: uma que recebe dois números e
   	retorna o maior e outra que recebe o mesmo mas retorna o menor. 
   	Implementar um programa com um menu de 4 opções: 
   	ler dois números, testar uma e outra função e terminar. */

public class Ex07_MaiorEMenor {
	public static double maiorDeDois (int n1, int n2){
		if (n1 > n2){
			return n1;
		}else{
			return n2;
		}
	}
	
	public static double menorDeDois (int x1, int x2){
		if (x1 < x2){
			return x1;
		}else{
			return x2;
			}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int opcao;
		int n1 = 0;
		int n2 = 0;
		do {
			System.out.println("1 - Carregar Numeros");
			System.out.println("2 - Mostrar Maior");
			System.out.println("3 - Mostrar Menor");
			System.out.println("9 - Fim");
			System.out.println("Selecione: ");
			opcao = entrada.nextInt();
			switch (opcao){
			case 1:
				System.out.println("Digite o primeiro valor: ");
				n1 = entrada.nextInt();
				System.out.println("Digite o segundo valor: ");
				n2 = entrada.nextInt();
				break;
			case 2:
				System.out.println("O maior dos dois numeros é: " +maiorDeDois(n1, n2));
				break;
			case 3:
				System.out.println("O menor dos dois numeros é: " +menorDeDois(n1, n2));
				break;
			case 4:
				System.out.println("Fim!");
				break;
			}
			
		} while (opcao !=9);
		entrada.close();
	}

}
