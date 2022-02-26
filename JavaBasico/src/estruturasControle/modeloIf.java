package estruturasControle;

import java.util.Scanner;

public class modeloIf {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma nota");
		double nota= entrada.nextDouble();
		
		if(nota<=10 && nota>=7.0) {
			System.out.println("Aprovado!");
		}
		
		entrada.close();
	}

}
