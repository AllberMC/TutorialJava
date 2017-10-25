package paquete;

public class Pelota {
	//variables nativas de la clase 
	int peso;
	float radio;
	String nombre;
	
	//Construcotres de la clase, es decir del objeto
	public Pelota(){ //constructor por defecto
		peso = 250;
		radio=144;
	}
	
	public Pelota(int peso, float radio){ //Constructor con el que podemos cambiar los valores
		this.peso = peso; //this hace referencia a la variable nativa de la clase
		this.radio = radio;
	}
	
	//Metodos de la clase
	public float get_Radio(){
		return radio; //con esto obtenemos el radio de la pelota lo que llamamos funcion get
	}
	
	public int get_Peso(){
		return peso; //con esto obtenemos el radio de la pelota lo que llamamos funcion get
	}
	
	public void set_Peso(int new_peso){
		peso= new_peso;
	}
	
	public void set_Radio(int new_radio){
		radio= new_radio;
	}
	
	public void patearPelota(){
		System.out.println("Haz pateado la pelota");
	}
	
	public void CogerPelota(){
		System.out.println("Atrapaste la pelota");
	}
}

//Nueva clase 
class PelotaFutbol extends Pelota{ //Clase hija de la clase padre Pelota
	public PelotaFutbol(){ //Constructor
		this.peso = 50;
		this.radio = 20;
	}
	
	public void marca(){
		System.out.println("La marca de la pelota es NIKE");
	}
}

class PelotaBaloncesto extends Pelota{
	
	public PelotaBaloncesto(){
		this.peso = 60;
	}
	
	public String nombre(){
		return this.nombre;
	}
}
