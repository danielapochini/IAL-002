package parteI;
import java.util.Scanner;

public class Exercicio04 {

/*	4.	Crie um vetor, de números inteiros, de tamanho 10; 
	Preencha o vetor com números aleatórios compreendidos entre 1 e 100; 
	Mostre os valore do vetor. 
	Mostre o maior valor entre eles. 
	Mostre o menor valor entre eles. */	

	public static void main(String[] args) {
		int[]v= new int[10];
		int n;
		Scanner entrada = new Scanner (System.in);
		int opcao;
		do{
			MeusProcedimentos.menuAleatorio();
			opcao = entrada.nextInt();
			switch (opcao){
			case 1:
				System.out.println("===Carregando o Vetor===");
				for (int i=0; i<v.length;i++){
					n = (int)((Math.random()*100));  //numeros aleatorios entre 0 e 1 - descola 3 casas
					//v[i] recebe n & 20 iterações
					v[i] = n;
				}
				break;
			case 2:
				System.out.println("===Mostrando o Vetor===");
				for (int i=0; i<v.length;i++){
					System.out.println("v["+i+"]= "+v[i]);
				}
				break;
			case 3:
				System.out.println("===Maior Valor entre o Vetor===");
				int maior = MeusProcedimentos.maior(v);
				System.out.println("O maior valor é de: " +maior);
				break;
			case 4:
				System.out.println("===Menor Valor entre o Vetor===");
				int menor = MeusProcedimentos.menor(v);
				System.out.println("O menor valor é de: " +menor);
				break;

			case 9:
				System.out.println("===Fim===");
				break;
			}
		}while (opcao != 9);
		entrada.close();
	}
}


