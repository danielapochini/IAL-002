package parteI;
public class MeusProcedimentos { 
	
	public static void menuComum(){
		System.out.println("1 - Carrega Vetor");
		System.out.println("2 - Mostra Vetor");
		System.out.println("9 - Fim");
		System.out.println("Selecione: ");
	}
	public static void menuStrings(){
		System.out.println("1 - Mostra Tamanho da Frase");
		System.out.println("2 - Mostra Frase");
		System.out.println("3 - Mostra Frase Invertida");
		System.out.println("9 - Fim");
		System.out.println("Selecione: ");
	}
	
	public static void menuAleatorio(){
		System.out.println("1 - Carrega o Vetor");
		System.out.println("2 - Mostra o Vetor");
		System.out.println("3 - Maior Valor");
		System.out.println("4 - Menor Valor");
		System.out.println("9 - Fim");
		System.out.println("Selecione: ");
	}
	
	public static void menuTresVetores(){
		System.out.println("1 - Carrega o Vetor");
		System.out.println("2 - Mostra o Vetor");
		System.out.println("3 - Maior Valor no Terceiro Vetor");
		System.out.println("4 - Menor Valor no Segundo Vetor");
		System.out.println("5 - Média Aritmética do Primeiro Vetor");
		System.out.println("9 - Fim");
		System.out.println("Selecione: ");
	}


	public static int menor(int[] a){
		int min = a[0];
		for(int i = 1; i > a.length; i++){
			if(a[i] < min){
				min = a[i];
			}
		}
		return min;
	}

	public static int maior(int[] a){
		int max = a[0];
		for(int i = 1; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		return max;
	}

	public static double media(int[] a){
		double total = 0.0;
		for(int i = 0; i < a.length; i++){
			total += a[i];  
		}
		return (total / a.length);
	}
}
