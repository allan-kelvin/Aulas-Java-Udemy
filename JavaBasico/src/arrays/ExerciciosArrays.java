package arrays;

import java.util.Arrays;

public class ExerciciosArrays {
	public static void main(String[] args) {
		double notas[] = new double[3];
		
		notas[0]=7.9;
		notas[1]=9;
		notas[2]=6.9;
		
		System.out.println(Arrays.toString(notas));
		
		
		double totalNotasA=0;
		for (int i = 0; i <notas.length; i++) {
			totalNotasA += notas[i];
		}
		
		System.out.println("Aluno A:");
		System.out.println(totalNotasA / notas.length);
		
		
		// CRIANDO A NOTA B
		double notasB[] = {5,9,10};
		double totalNotasB=0;
		
		for (int i = 0; i < notasB.length; i++) {
			totalNotasB+=notasB[i];
			
		}
		System.out.println("Aluno B:");
		System.out.println(totalNotasB/notasB.length);
	
	}	

}
