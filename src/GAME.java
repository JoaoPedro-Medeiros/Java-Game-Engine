import Classes_principais.in_front.WINDOW;

import java.util.Date;

public class GAME implements Runnable{

    private int fps = 0;
    private long firstTime = new Date().getTime();

    public static void main(String[] args) {
        WINDOW tela = new WINDOW("Jogo");
        GAME jogo = new GAME();
        Thread entrada = new Thread(jogo);
        entrada.start();
    }

    private boolean framesPerSecond(){
        long lastTime = new Date().getTime();
        long newTime;
        while(true){
            newTime = new Date().getTime();
            if((lastTime+ 16.666666667) <= newTime){
                if ((newTime - 1000) >= this.firstTime){
                    this.firstTime = newTime;
                    System.out.println("FPS: " + this.fps);
                    this.fps = 0;
                }else {
                    this.fps++;
                }
                return true;
            }
        }
    }

    private void update(){

    }

    private void show(){

    }

    @Override
    public void run() {
        while(framesPerSecond()) {
            this.update();
            this.show();
        }
    }
}
