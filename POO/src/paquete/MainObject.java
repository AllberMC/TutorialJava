package paquete;
import paquete.Pelota; //Se necesita para poder usar nuestra clase pelota como un objeto en el MAIN


public class MainObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CODIGO
		PelotaFutbol p = new PelotaFutbol(); //Objeto diferente al de la clase pelota
		PelotaBaloncesto pb = new PelotaBaloncesto();
		p.CogerPelota();
		p.patearPelota();
		p.marca();
		pb.nombre();
	}

}
