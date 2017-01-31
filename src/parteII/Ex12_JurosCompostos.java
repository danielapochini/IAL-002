package parteII;
import java.util.Scanner;

/* 	12. Juros compostos - 
   	Sendo C o capital, n o prazo e i a taxa de juros, o valor futuro FV 
   	de uma aplicação financeira é calculado por: FV = C(1+i)^n	 
	Elabore um programa com duas opções: uma que, dados capital, prazo e taxa, 
	calcule o valor futuro, e outra que, dados prazo, taxa e valor futuro, 
	calcule o capital necessário. */

public class Ex12_JurosCompostos {
	
	public static double valorfuturo(double capital, double taxa, int prazo){
		double fv = capital * Math.pow((1+taxa),prazo);
		return fv;		
	}
	
	public static double capitalnecessario(double valorfuturo, double taxa, int prazo){
		double c = valorfuturo/(Math.pow((1+taxa),prazo));
		return c;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double capital;
		System.out.print("Digite o valor do capital: ");
		capital = entrada.nextDouble();
		
		double taxa;
		System.out.print("Digite o valor da taxa: ");
		taxa = entrada.nextDouble();
				
		int prazo;
		System.out.print("Digite o prazo: ");
		prazo = entrada.nextInt();
		
		double total = valorfuturo(capital, taxa, prazo);
		System.out.println("Valor calculado = "+total);
		
		double cn = capitalnecessario(total, taxa, prazo);
		System.out.println("Capital Necesário: "+cn);
		
		entrada.close();
	}
}
