package parteI;
import java.util.Scanner;

public class Exercicio05 {

/*	5.	Crie 3 vetores, v1, v2 e v3 de tamanho 10, de números inteiros. 
	Preencha o vetor v1 com números aleatórios compreendidos entre 30 e 50. 
	Preencha o vetor v2 com números aleatórios compreendidos entre 50 e 70. 
	Preencha o vetor v3 onde cada uma de suas posições corresponde à soma dos valores contidos nas posições dos vetores v1 e v2. 
	Mostre os vetores v1, v2 e v3. 
	Qual o maior número contido no vetor v3. 
	Qual o menor numero contido no vetor v2. 
	Mostre a média aritmética dos valores contidos no vetor v1.	*/
	
	public static void main(String[] args) {
		int[]v1= new int[10];
		int[]v2= new int[10];
		int[]v3= new int[10];
		int n1;
		int n2;
		Scanner entrada = new Scanner (System.in);
		int opcao;
		do{
			MeusProcedimentos.menuTresVetores();
			opcao = entrada.nextInt();
			switch (opcao){
			case 1:
				System.out.println("===Carregando o Vetor===");
				for (int i = 0; i < v1.length; i++) { //carregando v1
					n1 = 30 + (int)(Math.random() * (20+1));
					v1[i] = n1;
				}
				for (int i = 0; i < v2.length; i++) { //carregando v2
					n2 = 50 + (int) (Math.random() * (20+1));
					v2[i] = n2;
				}
				for (int i=0; i<10; i++){ //carregando v3
					v3[i] = v1[i]+v2[i];
				}
				break;
			case 2:
				System.out.println("===Mostrando o Primeiro Vetor===");
				for (int i = 0; i < v1.length; i++) {
					System.out.println("v["+i+"]= "+v1[i]);
				}
				System.out.println("===Mostrando o Segundo Vetor===");
				for (int i = 0; i < v2.length; i++) {
					System.out.println("v["+i+"]= "+v2[i]);
				}
				System.out.println("===Mostrando o Terceiro Vetor===");
				for (int i=0; i<10; i++){
					System.out.println("v["+i+"]= "+v3[i]);
				}
				break;
			case 3:
				System.out.println("===Maior Valor no Terceiro Vetor===");
				int maior = MeusProcedimentos.maior(v3);
				System.out.println(maior);
				break;
			case 4:
				System.out.println("===Menor Valor no Segundo Vetor===");
				int menor = MeusProcedimentos.menor(v2);
				System.out.println(menor);
				break;
			case 5:
				System.out.println("===Media Aritmética do Primeiro Vetor===");
				double media = MeusProcedimentos.media(v1);
				System.out.println("A média dos Valores é de: "+media);
				break;
			case 9:
				System.out.println("===Fim...===");
				break;
			}
		}while (opcao != 9);
		entrada.close();
	}
}