package parteII;
import java.util.Scanner;

/*	1. N�mero par - 
    Fazer um procedimento que retorna Verdadeiro ou Falso conforme
	um n�mero seja par ou n�o. Se necess�rio, convencione 0 e 1, "S" e "N" ou outra
	representa��o de Falso e Verdadeiro	*/

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
		System.out.println("Digite o n�mero: ");
		x = entrada.nextInt();
				
		if (isPar(x)) {
			System.out.println("� par!");
		} else {
			System.out.println("� �mpar!");
		}
		entrada.close();
	}	
}
