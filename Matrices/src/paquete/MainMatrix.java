package paquete;

public class MainMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y[][];
		y = new int [10][10];
		int num=50;
		
		for(int i=0; i<y.length; i++){
			for(int j=0; j<y.length; j++){
				y[i][j]= num;
				num--;
			}
		}
		
		for(int i=0; i< y.length; i++){
			for(int j=0; j<y.length; j++){
				System.out.println("y vale: "+ y[i][j]);
			}
		}
		System.out.println("Se acabo");
	}

}
