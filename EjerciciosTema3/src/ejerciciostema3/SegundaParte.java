package ejerciciostema3;

class Coche {
	public int puertas = 0;

	public void IncrementarPuertas() {
		this.puertas++;
	}

}

public class SegundaParte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche miCoche = new Coche();
		miCoche.IncrementarPuertas();
		miCoche.IncrementarPuertas();
		System.out.println("El numero de puertas es: " + miCoche.puertas);
	}

}
