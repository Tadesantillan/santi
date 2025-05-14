package Objetos;
import java.awt.*;
import java.awt.Point;
import java.util.Scanner;
public class TresObjects {

	/*
	3. Point centro(Rectangle r)	
  		El método debe devolver el punto central del rectangulo r.*/
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Valor de x:");
			int a=scan.nextInt();
		System.out.println("Valor de y:");
			int b=scan.nextInt();
		System.out.println("Valor del Ancho del cuadrado:");
			int ancho=scan.nextInt();
		System.out.println("Valor de Altura del cuadrado:");
			int alto=scan.nextInt();
		
		Rectangle caja=new Rectangle(a,b,ancho,alto);
		System.out.println("El centro del cuadrado se encuentra en las cordenadas "+centro(caja));
	}
    public static double distancia(Point p1, Point p2) {
        int distX = p1.x - p2.x;
        int distY = p1.y - p2.y;

        return Math.sqrt(distX * distX + distY * distY);
    }
    
	public static Point centro(Rectangle r) {
		//el putno central es la mitad de la distancia entre los puntos
		
		int centroX=r.x+r.width/2;//la mitad del ancho sumado al punto x inicial
		int centroY=r.y+r.height/2;//la mitad del alto del cuadrado sumado a la varaible y inicial
		
		return new Point(centroX, centroY);
	}
}
