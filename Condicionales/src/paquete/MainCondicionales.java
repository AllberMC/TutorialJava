package paquete;

public class MainCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  var = 6;
		int var2= 10;
		boolean condicion = true;
		
		if(var >= 10){
			condicion = true;
		}
		else{
			condicion = false;
		}
		
		if(condicion){
			System.out.println("La condicion es verdadera");
		}
		else{
			System.out.println("La condicion NO es verdadera");
		}
		
		/******************************************************/
		if(var == 6 && var2 > 5){
			System.out.println("Operacion correcta");
		}
		else{
			System.out.println("Operacion incorrecta");
		}
		/******************************************************/
		if(var == 5 || var2 > 5){
			System.out.println("Operacion correcta");
		}
		else{
			System.out.println("Operacion incorrecta");
		}
		/*******************************************************/
		if(!(var == 5 || var2 > 5)){
			System.out.println("Operacion correcta");
		}
		else{
			System.out.println("Operacion incorrecta");
		}
	}

}
