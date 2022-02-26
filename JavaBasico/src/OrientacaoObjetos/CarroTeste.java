package OrientacaoObjetos;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		System.out.println(c1.motor.ligado);
		
		c1.ligar();
		System.out.println(c1.motor.ligado);
		
		
		System.out.println("Valor inicial de RPM "+c1.motor.giros());
		
		/*Fazendo acelerar*/
		c1.aceletar();
		c1.aceletar();
		
		System.out.println("Após acelerar"+c1.motor.giros());
		
		/*Fazendo Frear*/
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println("Após Frear "+c1.motor.giros());
		
		
	}
}
