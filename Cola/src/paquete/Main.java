package paquete;
import java.util.LinkedList;
public class Main {
	
	/**Vamos a ver
	 * offer() --> introducir datos (solo sirve para colas)
	 * poll() --> sacar datos, mostrarlos y eliminarlos de la cola
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList cola = new LinkedList();
		
		for(int i = 0; i <= 10; i++){ //ciclop for para introducir numeros en nuestra cola
			cola.offer(i);
		}
		
		while(cola.peek() != null){ //Cuando tengamos valores en la cola
			System.out.println(cola.poll());
		}
	}

}
