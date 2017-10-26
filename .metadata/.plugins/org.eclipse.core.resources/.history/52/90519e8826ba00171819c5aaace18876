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

}
