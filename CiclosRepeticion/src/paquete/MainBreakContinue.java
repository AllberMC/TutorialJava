package paquete;

public class MainBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 10; i++){
			System.out.println("Estamos en el ciclo");
			if(i==4){
				//break;
				continue;
			}
			System.out.println("El valor de i es: "+ i);
		}
		System.out.println("Hemos salido del ciclo FOR");
	}

}
