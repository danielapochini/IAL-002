package parteI;
import java.util.Scanner;

public class Exercicio03 {
	
/*	3. 	Crie uma variável do tipo String de  caracteres. 
	Faça a entrada, via teclado de uma frase qualquer. 
	Mostre o total de caracteres digitados. 
	Mostre a frase digitada. 
	Mostre a frase digitada de forma inversa. 	*/

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int opcao;
		String frase;
		System.out.println("Digite uma frase:");
		frase = entrada.nextLine();
		do{
			MeusProcedimentos.menuStrings();
			opcao = entrada.nextInt();
			switch (opcao){
			case 1:
				System.out.println("===Mostra o Tamanho da frase===");
				System.out.println("Tamanho da frase digitada :" +frase.length());
				break;
			case 2:
				for (int i=0; i<frase.length();i++){
					System.out.println(i+" - "+frase.charAt(i)); //char na posição do vetor
				}
				break;
			case 3:
				System.out.println("Mostrando Invertido..");
				for (int i=frase.length()-1; i>=0; i--){ 
					System.out.println(i+ " - "+frase.charAt(i));
				}
				break;
			case 9:
				System.out.println("Fim");
				break;
			}
		}while (opcao != 9);
		entrada.close();
	}
}
