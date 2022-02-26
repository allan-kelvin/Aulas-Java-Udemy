package estruturasControle;

public class For2 {
	public static void main(String[] args) {
		
		
		
		for(int i = 10; i>=0; i-=2) {
			System.out.println("decrescente 1: "+i);
		}
		
		//descrecente segunda maneira;
		int contador =10;
		for(int j =0; j<=contador; j++) {
			System.out.println("Decrescente 2: "+contador);
			contador-=2;
		}
	}

}
