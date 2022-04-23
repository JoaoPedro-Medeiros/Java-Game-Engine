package Classes_principais.in_front;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

abstract class KEY implements KeyListener {

    public String keyUsed;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.isActionKey()){
            if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                this.keyUsed = "RIGHT";
            }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
                this.keyUsed = "LEFT";
            }else if(e.getKeyCode() == KeyEvent.VK_UP){
                this.keyUsed = "UP";
            }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                this.keyUsed = "DOWN";
            }

            if(e.isControlDown()){
                this.keyUsed += "_DOUBLE";
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
