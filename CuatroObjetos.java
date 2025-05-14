package Objetos;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Scanner;
public class CuatroObjetos {
/*4. boolean estaDentro(Point p, Rectangle r)
  El método debe indicar si el punto p está dentro del rectángulo dado.*/
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);//importamos el scanner;
		
		//PEDIMOS LOS PARAMETROS DEL CUADRADO.
		System.out.println("Valor de x:");
			int a=scan.nextInt();
		System.out.println("Valor de y:");
			int b=scan.nextInt();
		System.out.println("Valor del Ancho del cuadrado:");
			int ancho=scan.nextInt();
		System.out.println("Valor de Altura del cuadrado:");
			int alto=scan.nextInt();
			
			Rectangle caja=new Rectangle(a,b,ancho,alto);
			
			//PEDIMOS LOS PUNTOS DE P
		System.out.println("Digite un Valor x para el punto:");
			int x=scan.nextInt();
		System.out.println("Digite un Valor y para el punto:");
			int y=scan.nextInt();
			Point p;
			p=new Point(x,y);
	scan.close();
			System.out.println(p+ "se encuentra dentro de "+caja+" ? "+ estaDentro(p,caja));
	}
	public static boolean estaDentro(Point p, Rectangle r) {
		if (p.x>r.x && p.x <(r.x+r.width)) {//si px mayor a la x inicial y es menor al ancho 
			if (p.y>r.y && p.y <(r.y+r.height)) {
				return true; //esta dentro del cuadrado
			}
				return false; //esta dentro del cuadrado
		}
			return false;
	}	
}