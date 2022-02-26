package estruturasControle;

import java.util.Scanner;

public class ifElse {
	
	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
        int numero =valor.nextInt();
        if (numero % 2==0){
            System.out.printf("O numero %s é Par!",numero);
        } else {
            System.out.printf("O numero %s é Impar!",numero);
        }
        valor.close();
	}

}
