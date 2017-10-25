package paquete;
import java.io.*; //libreria que se utiliza para la E/S de informacion

public class Main {
	/**Vamos a aprender
	 * @param args
	 * leer desde el teclado
	 * concat()-->concatenar
	 * toUpperCase()-->pasarlo todo a mayus
	 * toLowerCase()-->pasarlo todo a minus
	 * lenght()-->obtener num de letras 
	 * Convertir var numericas a string y viceversa
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "";
		double x = 50.3;
		
		texto = String.valueOf(x);
		texto = texto.concat("--Double");
		System.out.println(texto);
		
		InputStreamReader in = new InputStreamReader(System.in);//Estamos un canal de datos que recibe informacion desde el exterior
		BufferedReader buffer = new BufferedReader(in); //Espacio de memoria que almacena la informacion obtenida del exterior
		
		//El try catch es porque aveces se pueden suceder errores en la captura
		try{
			texto = buffer.readLine();
			x = Integer.parseInt(texto); //Para pasar de string a entero
		}catch(IOException e){
			System.out.println("Debes escribir un numero");
		};
		
		texto = texto.concat("--Esto es una concatenacion"); //Lo que tengamos en la var texto sera igual a lo que ya esta en la var texto + lo que este en los parentesis de concat()
		texto = texto.toLowerCase();
		texto = texto.toUpperCase();
		int a = texto.length();
		System.out.println(texto);
		System.out.println("El numero de letras del texto es: " + a);
		System.out.println(x + 5);
		
	}

}
