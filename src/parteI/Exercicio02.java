package parteI;
import java.util.Scanner;

public class Exercicio02 {

/*	2. 	Crie um vetor  de tamanho 10, constituído de “String”  de caracteres. 
	Faça a entrada de dados através do teclado. 
	Mostre os valores digitados nesse vetor*/
	
	public static void main(String[] args) {
		String palavra[] = new String[10]; //definindo vetor de String de tamanho 10
		int opcao;
		Scanner entrada = new Scanner (System.in);
		do{
			MeusProcedimentos.menuComum();
			opcao = entrada.nextInt();
			if(opcao==1){ 
				System.out.println("Carrega o Vetor");
				for (int i = 0; i < 10; i++) { //contador de 0 a 10
					System.out.println("Digite a palavra: ");
					palavra[i] = entrada.nextLine();
				}
			}else{
				if(opcao==2){
					System.out.println("Mostra o Vetor");
					for (int i=0; i < 10; i++){
						System.out.println("V["+i+"]="+palavra[i]);
					}
				}
			}
		}while(opcao !=9);
		entrada.close();
	}
}