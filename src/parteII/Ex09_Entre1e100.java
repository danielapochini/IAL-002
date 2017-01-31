package parteII;
import java.util.Scanner;

/*	9. 	Entre 0 e 100 - 
   	Implementar uma função que recebe um número qualquer e 
   	retorna Verdadeiro se o número está entre 0 e 100, 
   	caso contrário retorna Falso.	*/

public class Ex09_Entre1e100 {
	public static boolean valorEntre0e100(int n){
		if (n>=0 && n<=100){
			System.out.println("está entre 0 e 100!");
			return true;
		}else{
			System.out.println("não está entre 0 e 100!");
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
