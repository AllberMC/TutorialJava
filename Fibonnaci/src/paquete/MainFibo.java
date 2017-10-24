package paquete;

public class MainFibo {

	public static void main(String[] args) {
		//Algoritmos ciclicos
		//Serie de Fibonacci 0,1,1,2,3,5,8,11...
		//Serie de n� impares
		
		/******Serie n� impares******/
		for(int i = 0; i <= 100; i++){
			if((i % 2) != 0){
				System.out.println("El n� impar es: "+ i);
			}
		}
		
		/******Serie Fibonacci******/
		int num_actual = 1;
		int num_anterior = 0;
		int temp;
		
		while(true){
			System.out.println("El n� actual es: " + num_actual);
			temp = num_actual;
			num_actual = num_actual + num_anterior;
			num_anterior = temp;
			
			if(num_actual > 30){
				break; //Para salir del ciclo while y acabar el programa
			}
		}
		
	}

}
