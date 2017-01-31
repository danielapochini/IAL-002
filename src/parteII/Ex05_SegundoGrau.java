package parteII;
import java.util.Scanner;

/* 	5. 	Equa��o do segundo grau � 
   	Escreva um procedimento que recebe os coeficientes
   	a, b e c de uma equa��o do segundo grau, calcula e mostra suas ra�zes. */

public class Ex05_SegundoGrau {
	
	public static double eqSegGrau(int a, int b, int c){
		double delta,x1,x2;
		delta = (b*b)-(4*a*c);
		if (delta < 0) {
			System.out.println("N�o existe raizes");
		} else{
			if (delta == 0) {
				x1 = (-b-Math.sqrt(delta))/(2*a); 
				System.out.println("S� h� uma raiz para equa��o: "+x1);
			} else{
				x1 = (-b-Math.sqrt(delta))/(2*a);
		        x2 = (-b+Math.sqrt(delta))/(2*a);
		        System.out.println("As raizes s�o: "+x1+" e "+x2);
			}
		}
		return delta;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva o valor de A:");
		int a = entrada.nextInt();
		
		System.out.println("Escreva o valor de B:");
		int b = entrada.nextInt();
		
		System.out.println("Escreva o valor de C:");
		int c = entrada.nextInt();

		System.out.println(+eqSegGrau(a, b, c));
		entrada.close();
	}

}
