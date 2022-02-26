package ClassesMetodos;

public class produtoTeste {
	public static void main(String[] args) {
		
		produto p1 = new produto();
		
		p1.nome="notebook";
		p1.preco=4000.00;
		p1.desconto=0.25;
		
		
		var p2 = new produto();
		
		p2.nome="table";
		p2.preco=800.00;
		p2.desconto=0.5;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
	}

}
