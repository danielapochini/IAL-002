package parteII;
// import java.util.GregorianCalendar;
import java.util.Scanner;

/*	13. Bissexto - 
   	Um ano é bissexto se for divisível por 4 exceto os séculos, que são
   	bissextos se forem múltiplos de 400. Implementar uma função que recebe o número
   	de um ano e retorna Verdadeiro se o ano for bissexto ou Falso caso contrário.*/

public class Ex13_Bissexto {

	public static double anoBissexto(int ano){
	if ((ano % 4 == 0) && ( (ano % 100 != 0) || (ano % 400 == 0))){
		System.out.println("É Bissexto!");
		return ano;
	}else{
		System.out.println("Não é Bissexto!");
		return ano;
	}
	
	// poderia utilizar-se return new GregorianCalendar().isLeapYear(ano);
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um ano válido: ");
		int ano = entrada.nextInt();
		System.out.println(anoBissexto(ano));
		entrada.close();
	}

}
