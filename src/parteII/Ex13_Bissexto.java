package parteII;
// import java.util.GregorianCalendar;
import java.util.Scanner;

/*	13. Bissexto - 
   	Um ano � bissexto se for divis�vel por 4 exceto os s�culos, que s�o
   	bissextos se forem m�ltiplos de 400. Implementar uma fun��o que recebe o n�mero
   	de um ano e retorna Verdadeiro se o ano for bissexto ou Falso caso contr�rio.*/

public class Ex13_Bissexto {

	public static double anoBissexto(int ano){
	if ((ano % 4 == 0) && ( (ano % 100 != 0) || (ano % 400 == 0))){
		System.out.println("� Bissexto!");
		return ano;
	}else{
		System.out.println("N�o � Bissexto!");
		return ano;
	}
	
	// poderia utilizar-se return new GregorianCalendar().isLeapYear(ano);
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um ano v�lido: ");
		int ano = entrada.nextInt();
		System.out.println(anoBissexto(ano));
		entrada.close();
	}

}
