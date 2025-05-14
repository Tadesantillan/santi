package Objetos;
import java.util.Scanner;
import java.awt.Point;
import java.awt.Rectangle;

public class SieteObjetos{
//	7. boolean estaContenido(Rectangle r1, Rectangle r2)
//
//	  El método debe indicar si el rectangulo r1 está contenido completamente dentro del rectángulo r2.
//
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		//pedimos los valores de los rectangulos
		System.out.println("Valor para X: ");
		int E= scan.nextInt();
		System.out.println("Valor de Y: ");
		int I= scan.nextInt();
		System.out.println("Ancho:");
		int Ancho=scan.nextInt();
		System.out.println("Alto: ");
		int Alto=scan.nextInt();
		Rectangle caja = new Rectangle(E,I,Ancho,Alto);
		
		System.out.println("Valor para X2: ");
		int x= scan.nextInt();
		System.out.println("Valor de Y2: ");
		int y= scan.nextInt();
		System.out.println("Ancho 2:");
		int An=scan.nextInt();
		System.out.println("Alto 2: ");
		int Alt=scan.nextInt();
		Rectangle caja2 = new Rectangle(x,y,An,Alt);
		
				System.out.println("Es "+ estaContenido(caja, caja2)+" que "+caja+" se encuentra dentro de "+caja2);
	}

	public static boolean estaContenido(Rectangle r1, Rectangle r2) {
//		this.caja=r1;
//		this.caja2=r2;
		//si r2 esta dentro de r2
		if (r1.x>= r2.x && r1.x+r1.width<=r2.x+r2.width) {//si el punto inicial de r1 es mayor al de r2 y menor al punto x final (menor a la distancia entre el punto inicial y el final)
			if(r1.y>=r2.y && r1.y+r1.height<= r2.y+r2.height) {
				return true;
			}	
				return false;
		}	
			return false;
		
	}

	





}
