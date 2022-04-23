package Classes_principais;

import java.util.Scanner;

public class ENTITY {
    public double x = 0;
    public double y = 0;
    public double rotate = Math.toDegrees(Math.atan(0));
    public Scanner leitura;

    public void insertXY(){
        leitura = new Scanner(System.in);
        this.x = leitura.nextInt();
        leitura = new Scanner(System.in);
        this.y = leitura.nextInt();
    }

    public void insertRotateX(){
        leitura = new Scanner(System.in);
        this.rotate = Math.toDegrees(Math.atan(leitura.nextInt()));
    }
}
