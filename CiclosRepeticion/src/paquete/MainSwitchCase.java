package paquete;

public class MainSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x='c';
		switch(x){
			case 'a':{
				System.out.println("Estamos en la opc 0");
				break;
			}
			case 'b': {
				System.out.println("Estamos en la opc 1");
				break;
			}
			default:{ //Pieza de codigo que se ejecuta si nuestra var no coincide con ninguna de las opc
				System.out.println("Esta opcion es la opcion por defecto");
			}
		}
	}

}
