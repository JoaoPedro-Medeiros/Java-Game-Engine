import java.util.Scanner;

public class ENTITY {
    public int x = 0;
    public int y = 0;
    public int z = 0;
    public double rotateX = Math.toDegrees(Math.atan(0));
    public double rotateY = Math.toDegrees(Math.atan(0));
    public double rotateZ = Math.toDegrees(Math.atan(0));
    private Scanner leitura;

    public void insertXYZ(){
        leitura = new Scanner(System.in);
        this.x = leitura.nextInt();
        leitura = new Scanner(System.in);
        this.y = leitura.nextInt();
        leitura = new Scanner(System.in);
        this.z = leitura.nextInt();
    }

    public void insertRotateX(){
        leitura = new Scanner(System.in);
        this.rotateX = Math.toDegrees(Math.atan(leitura.nextInt()));
    }

    public void insertRotateY(){
        leitura = new Scanner(System.in);
        this.rotateY = Math.toDegrees(Math.atan(leitura.nextInt()));
    }

    public void insertRotateZ(){
        leitura = new Scanner(System.in);
        this.rotateZ = Math.toDegrees(Math.atan(leitura.nextInt()));
    }
}
