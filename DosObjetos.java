package Objetos;

import java.awt.*;
//El método debe devolver la medida de la diagonal del rectángulo pasado como parámetro. 
//Usar el método "distancia" del punto anterior sobre determinados puntos del rectángulo.
public class DosObjetos {
    public static void main(String[] args) {
        // Creamos un rectángulo con (x=0, y=0), ancho=100 y alto=200
        Rectangle caja = new Rectangle(0, 0, 100, 200);

        // Calculamos los puntos en las esquinas opuestas
        Point p1 = new Point(caja.x, caja.y); // Esquina superior izquierda
        Point p2 = new Point(caja.x + caja.width, caja.y + caja.height); // Esquina inferior derecha
        
        // Mostramos la distancia entre los puntos
        System.out.println("La distancia entre los puntos " + p1 + " y " + p2 + " es " + distancia(p1, p2));

        // Calculamos la diagonal del rectángulo
        System.out.println("La medida de la diagonal del rectángulo " + caja + " es " + diagonal(caja));
    }

    // Método para calcular la distancia entre dos puntos
    public static double distancia(Point p1, Point p2) {
        int distX = p1.x - p2.x;
        int distY = p1.y - p2.y;

        return Math.sqrt(distX * distX + distY * distY);
    }

    // Método para calcular la diagonal del rectángulo
    public static double diagonal(Rectangle caja) {
        Point p1 = new Point(caja.x, caja.y); // Esquina superior izquierda
        Point p2 = new Point(caja.x + caja.width, caja.y + caja.height); // Esquina inferior derecha

        //el punto x mas el ancho y wl y mas el alto. todo eso nos da la diagonal
        return distancia(p1, p2);
    }
}

