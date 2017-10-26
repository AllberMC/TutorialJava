package paquete;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;

public class Texto {
	
	public void leer(String nombreArchivo){
		
		try{
			FileReader r = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(r);
			
			//System.out.println(buffer.readLine());
			
			//Para poder leer el archivo de texto completo
			String temp = "";
			
			while(temp != null){
				temp = buffer.readLine();
				if(temp == null){
					break;
				}
				System.out.println(temp);
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		};
	}
	
	public void escribir(String nombreArchivo){
		
		File f; //crea un objeto de tipo archivo
		f = new File(nombreArchivo); //se asigna un nombre al archivo
		
		//Escritura
		try{
			FileWriter w = new FileWriter(f); //Le pasamos el archivo creado para indicarle que archivo sera de escritura
			BufferedWriter bw = new BufferedWriter(w); //Le pasamos el filewriter porque sera el que escriba en nuestra archivo y el buffer contiene la info
			PrintWriter wr = new PrintWriter(bw); //traduce la info del buffer directamente al archivo de texto
			
			wr.write("Esto es una linea de texto");
			wr.append("\n --esto es una concatenacion al texto");
			wr.close();
			bw.close();
			
		}catch(IOException e){};
	}

}
