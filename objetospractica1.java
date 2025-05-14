package Objetos;
import java.awt.Point;
//import java.util.Scanner;
public class objetospractica1 {

	//1. double distancia(Point p1, Point p2)
// El método debe devolver la distancia entre los puntos dados.
	public static void main(String[] args) {
		
		Point p1 = new Point(3, 4);
	
		Point p2= new Point(9,10);

		System.out.println("La distancia entre los puntos"+p1+" y "+p2+" es de "+distancia(p1,p2));
	}
	public static double distancia(Point p1, Point p2) {
		//this.p1 = p1;
    	//this.p2 = p2;
		
		int distX=p1.x-p2.x;
		int distY=p1.y-p2.y;
		
		//retorna la distancia entre los puntos
		
		return Math.sqrt(distX * distX + distY * distY);
	}
	
}
	