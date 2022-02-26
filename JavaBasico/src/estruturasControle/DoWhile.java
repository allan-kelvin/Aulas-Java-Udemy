package estruturasControle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String resposta="";
		do {
			System.out.println("Você Precisa falar as Palavras Maginas:");
			System.out.println("Quer Sair?");
			resposta=entrada.nextLine();
			
		}while(!resposta.equalsIgnoreCase("por favor"));
		
		entrada.close();
	}

}
