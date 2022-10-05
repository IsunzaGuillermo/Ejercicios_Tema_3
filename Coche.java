package ejerciciosTema3;

public class Coche {
	
	public int puertas = 4;
	
	public void añadirPuertas() {
		this.puertas++;
	}

	public static void main(String[] args) {
		Coche miCoche = new Coche();
		
		miCoche.añadirPuertas();
		
		System.out.println(miCoche.puertas);
	}

}
