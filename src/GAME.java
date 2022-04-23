
import Classes_principais.in_front.WINDOW;

import java.awt.event.KeyEvent;
import java.util.Date;

public class GAME implements Runnable{

    private int fps = 0;
    private long firstTime = new Date().getTime();

    public static void main(String[] args) {//Execução principal
        //Criando Thread do jogo
        GAME jogo = new GAME();
        Thread sessao_de_jogo = new Thread(jogo);
        //Onde o jogo é configurado
        sessao_de_jogo.start();
    }

    public boolean framesPerSecond(boolean mostrar){
        long lastTime = new Date().getTime();
        long newTime;
        while(true){
            newTime = new Date().getTime();
            if((lastTime + 16.666666667) <= newTime){
                if ((newTime - 1000) >= this.firstTime){
                    this.firstTime = newTime;
                    if(mostrar) {
                        System.out.println("FPS: " + this.fps);
                    }
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
        WINDOW janela_principal = new WINDOW("Nome do Jogo");
        while(framesPerSecond(false)) {
            this.update();
            this.show();
        }
    }
}
