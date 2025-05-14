package Objetos;
//import java.awt.Point;

//El método debe devolver la distancia entre los puntos dados.
	class Punto {
		int x, y;

    	public Punto(int x, int y) {
    		this.x = x;
        	this.y = y;
    	}
	}
public class unoObjetos {
	
	public class objetospractica1 {
		public static void main(String[] args) {
	        Punto p1 = new Punto(3, 4);
	        Punto p2 = new Punto(9, 10);

	        System.out.println("La distancia entre los puntos (" + p1.x + ", " + p1.y + ") y (" +
	                p2.x + ", " + p2.y + ") es " + distancia(p1, p2));
	    }

	    public static double distancia(Punto p1, Punto p2) {
	        int distenX = p1.x - p2.x;
	        int distenY = p1.y - p2.y;
	        return Math.sqrt(distenX * distenX + distenY * distenY);
	    }
	
	}

}
