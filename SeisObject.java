package Objetos;
import java.util.Scanner;
import java.awt.Point;
import java.awt.Rectangle;

public class SeisObject {
/*Rectangle encuadrar(Rectangle r1, Rectangle r2)

  El método debe devolver el rectángulo más pequeño que contenga a los dos rectángulos dados.*/
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		//primer rectangulo
		System.out.println("Valor de x:");
		int a=scan.nextInt();
	System.out.println("Valor de y:");
		int b=scan.nextInt();
	System.out.println("Valor del Ancho del cuadrado:");
		int ancho=scan.nextInt();
	System.out.println("Valor de Altura del cuadrado:");
		int alto=scan.nextInt();
			Rectangle caja=new Rectangle(a,b,ancho,alto);
		
		//segundo rectangulo
		System.out.println("Valor de x:");
		int c=scan.nextInt();
	System.out.println("Valor de y:");
		int d=scan.nextInt();
	System.out.println("Valor del Ancho del cuadrado:");
		int Ancho=scan.nextInt();
	System.out.println("Valor de Altura del cuadrado:");
		int Alto=scan.nextInt();
			Rectangle caja2=new Rectangle(c,d,Ancho,Alto);
		
	System.out.println("El tamño del rectangulo es de: "+ encuadrar(caja,caja2));
	}
//	public static Rectangle encuadrar(Rectangle a, Rectangle b) {
//		if(a.x<b.x) {//buscamos el x menor
//			int nuevoX=a.x;
//		}	
//			int nuevoX=b.x;
//		if(a.y<b.y) {//buscamos el y menor
//			int nuevoY=a.y;
//		}
//		int nuevoY=b.y;
//	}
	
	
	public static Rectangle encuadrar(Rectangle a, Rectangle b) {
//		this.caja=a;
//		this.caja2=b;
		//buscamos los valores mas chicos de los rectangulos
		int x= Math.min(a.x, b.x);//buscamos el punto "x" donde iniciaria el nuevo rectangulo en posicion horizontal
		int y= Math.min(a.y,b.y);//bucamos el punto vertical donde inicia
		int Xmax= Math.max(a.x + a.width, b.x+b.width);//punto horizontal donde termina el caudrado;ANCHO
		int Ymax= Math.max(a.y+a.height, b.y+b.height);//putno vertical ALto donde termina el rectangulo
		
		//lo adjuntamos al return 
		return new Rectangle(x,y, Xmax-x,Ymax-y);
	}
	
}
