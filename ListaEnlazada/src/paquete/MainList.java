package paquete;
import java.util.LinkedList;


public class MainList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lista = new LinkedList();
		
		lista.add("Palabra"); //A�adimos el dato donde estemos situado
		lista.add(5); //El dato puede ser de cualquier tipo y se pueden mezclar
		lista.add(2, 24); //Este metodo add nos permite guardar un dato en la lista en la pos que queramos
		lista.add("Palabra2");
		
		//lista.remove(0); //eliminamos el dato de la pos 0 en la lista
		//lista.removeFirst(); //eliminamos el primer dato de nuestra lista
		lista.removeLast(); //eliminamos el ultimo dato de nuestra lista
		
		System.out.println("El tama�o de la lista es: " + lista.size()); //con size obtenemos el tama�o total que vamos obteniendo de la lista
		System.out.println(lista.get(2)); //El metodo get nos permite obtener el dato pasandole la pos de la que queremos obtenerlo
		System.out.println(lista.getFirst()); //Con getFirst obtenemos siempre el primer dato que se a�adio en la lista(pos 0)
		System.out.println(lista.getLast()); //Con getLast obtenemos el ultimo dato almacenado en la lista
		System.out.println(lista.get(lista.size()-1));//Cumple la misma funcion que getLast
	}

}
