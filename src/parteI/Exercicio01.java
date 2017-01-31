package parteI;
import java.util.Scanner;

public class Exercicio01 {

/*	1. 	Crie um vetor, de números inteiros, de tamanho 10; 
	Faça a entrada de todos os valores, digitados via teclado. 
	Mostre os valores digitados no vetor.	*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //entrada de dados
		int valor;
		int opcao;
		int vetor[] = new int[10];
		do{
			MeusProcedimentos.menuComum();
			opcao = entrada.nextInt();
			if(opcao==1){ 
				System.out.println("Carrega o Vetor");	
				for (int i=0; i<10; i++){
					System.out.println("Digite o valor:");
					valor = entrada.nextInt(); 
					vetor[i] = valor;
				}
			}else{
				if(opcao==2){
					System.out.println("Mostra o Vetor");
					for (int i = 0; i < 10; i++) {
						System.out.println("V["+i+"]="+vetor[i]);
					}
				}
			}
		}while(opcao !=9);
		entrada.close();
	}
}
