package paquete;

public class MainCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 10; i++){
			System.out.println("El contador vale: "+ i);
		}
		/*************************************************/
		for(int i = 10; i >= 0; i--){
			System.out.println("El contador vale: "+ i);
		}
		/*************************************************/
		for(int i = 0; i <= 20; i ++){
			i=i*2;
			System.out.println("El contador vale: "+ i);
		}
	}

}
