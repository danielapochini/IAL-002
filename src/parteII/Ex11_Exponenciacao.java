package parteII;
import java.util.Scanner;

/*	11. Exponenciação inteira - 
   	Escrever uma função que calcula um inteiro elevado 
   	a outro inteiro, usando a multiplicação. */

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
		System.out.println(n1+" elevado por " +n2+ " é: " +numElevado(n1, n2));
		entrada.close();
	}
}
