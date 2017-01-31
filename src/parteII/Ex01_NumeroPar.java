package parteII;
import java.util.Scanner;

/*	1. Número par - 
    Fazer um procedimento que retorna Verdadeiro ou Falso conforme
	um número seja par ou não. Se necessário, convencione 0 e 1, "S" e "N" ou outra
	representação de Falso e Verdadeiro	*/

public class Ex01_NumeroPar {
	public static boolean isPar(int numero){
		boolean v;
		if (numero % 2 == 0){
			v = true;
		} else {
			v = false;
		}
			return v;		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x;
		System.out.println("Digite o número: ");
		x = entrada.nextInt();
				
		if (isPar(x)) {
			System.out.println("É par!");
		} else {
			System.out.println("É ímpar!");
		}
		entrada.close();
	}	
}
