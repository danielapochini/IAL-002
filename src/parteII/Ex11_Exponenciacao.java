package parteII;
import java.util.Scanner;

/*	11. Exponencia��o inteira - 
   	Escrever uma fun��o que calcula um inteiro elevado 
   	a outro inteiro, usando a multiplica��o. */

public class Ex11_Exponenciacao {
	public static double numElevado(int num, int elev){
		num = (int) Math.pow(num, elev);
		return num;
	}
	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor:");
		n1 = entrada.nextInt();
		System.out.println("Digite outro valor: ");
		n2 = entrada.nextInt();
		System.out.println(n1+" elevado por " +n2+ " �: " +numElevado(n1, n2));
		entrada.close();
	}
}
