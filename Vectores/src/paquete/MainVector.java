package paquete;

public class MainVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[];//declarar variable del vector
		x = new int [10]; //reserva de memoria para el vector
		/*int x[] = new int[10]*/
		for(int i=0; i < x.length; i++){
			x[i]=i;
		}
		
		for(int i=0; i < x.length; i++){
			System.out.println("Vector en indice: "+ i + "="+ x[i]);
		}
	}

}
