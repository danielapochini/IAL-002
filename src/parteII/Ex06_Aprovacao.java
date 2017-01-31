package parteII;
import java.util.Scanner;

/*	6. 	Aprovação - 
   	Escrever uma função que recebe uma nota de 0 a 10 e retorna
   	verdadeiro ou falso (ou outros valores convencionados como tal) 
   	se o aluno foi aprovado, isto é, se tirou 6 ou mais. */

public class Ex06_Aprovacao {

	public static double notasAluno(double a){
		if (a >=6) {
			System.out.println("Você foi aprovado!");
		}else{
			System.out.println("Você foi reprovado!");
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota;
		System.out.println("Digite a nota do aluno: ");
		nota = entrada.nextDouble();
		System.out.println("Sua nota é: " +notasAluno(nota));
		entrada.close();
	}

}
