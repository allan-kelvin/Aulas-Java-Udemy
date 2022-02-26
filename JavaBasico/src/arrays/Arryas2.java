package arrays;

public class Arryas2 {
	public static void main(String[] args) {
		double notas[] = {10,10,10,9};
		
		// MANEIRA TRADICIONAL DE IMPRESSÃO DE ARRAY
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i]+ " ");
		}
		
		//USANDO O FOR DE MANEIRA RESUMIDA PARA IMPRIMIR UM ARRAY
		System.out.println();
		
		for(double nota: notas) {
			System.out.print(nota+ " ");
		}
	}

}
