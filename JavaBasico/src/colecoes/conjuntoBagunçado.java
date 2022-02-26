package colecoes;

import java.util.HashSet;

public class conjuntoBagunçado {

 public static void main(String[] args) {
	HashSet conjunto = new HashSet();
	
	conjunto.add(1.2);
	conjunto.add(true);
	conjunto.add("teste");
	conjunto.add(1);
	conjunto.add("x");
	
	System.out.println("o tamanho é: " + conjunto.size());
	
	//O CONTAINS ME DIZ SE O QUE FOI PASSADO NO PARAMETRO, ESTA NO CONJUNTO
	System.out.println(conjunto.contains(1));
  }
}
