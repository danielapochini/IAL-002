package parteII;
import java.util.Scanner;

/*	9. 	Entre 0 e 100 - 
   	Implementar uma fun��o que recebe um n�mero qualquer e 
   	retorna Verdadeiro se o n�mero est� entre 0 e 100, 
   	caso contr�rio retorna Falso.	*/

public class Ex09_Entre1e100 {
	public static boolean valorEntre0e100(int n){
		if (n>=0 && n<=100){
			System.out.println("est� entre 0 e 100!");
			return true;
		}else{
			System.out.println("n�o est� entre 0 e 100!");
			return false;
		}
	}
	public static void main(String[] args) {
		int valor;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um valor:");
		valor = entrada.nextInt();
		System.out.println(valorEntre0e100(valor));
		entrada.close();
	}

}
