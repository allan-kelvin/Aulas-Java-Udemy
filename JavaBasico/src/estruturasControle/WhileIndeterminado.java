package estruturasControle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		String valor="";
		
		//Aqui o programa ira executar enquanto for diferente de sair
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Voce Diz:");
			valor= entrada.nextLine();
		}
		System.out.println("Parabens voce Acertou");
		
		entrada.close();
	}

}
