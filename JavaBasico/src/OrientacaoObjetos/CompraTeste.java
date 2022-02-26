package OrientacaoObjetos;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente ="allan"; 
		compra1.itens.add(new Itens("Caneta", 20, 7.45));
		compra1.itens.add(new Itens("caderno", 10, 5.50));
		compra1.itens.add(new Itens("lapis", 5, 1.45));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal() );
	}

}
