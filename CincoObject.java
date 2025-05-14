package Objetos;

import java.awt.Point;
import java.awt.*;

import java.util.Scanner;

public class CincoObject {
/*5. Point puntoMedio(Point p1, Point p2)

  El método devuelve un nuevo punto, que se encuentra en el medio del segmento que une  a p1 con p2. Matemáticamente, 
  este punto tiene como coordenada x el promedio de las coordenadas x de los dos puntos y lo mismo para la coordenada y.
*/
	public static void main(String[] args) {

		//pedimos los 2 puntos
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite un Valor X para el punto 1:");
		
			int x=scan.nextInt();
		System.out.println("Digite un Valor Y para el punto 1:");
			int y=scan.nextInt();
		Point p1;
		p1=new Point(x,y);
		//Punto 2
		System.out.println("Digite un Valor X para el punto 2:");
			int x1=scan.nextInt();
		System.out.println("Digite un Valor Y para el punto 2:");
			int y1=scan.nextInt();
		Point p2;
		p2=new Point(x1,y1);
			scan.close();
		
			System.out.println("El nuevo punto se encuentra en: "+ puntoMedio(p1,p2));
			
	}
	public static Point puntoMedio(Point p1, Point p2) {
		int PromedioX=(p1.x+p2.x)/2;
		int PromedioY=(p1.y+p2.y)/2;
		
		Point PuntoMedio= new Point(PromedioX,PromedioY);
		
		return PuntoMedio;
	}
}
