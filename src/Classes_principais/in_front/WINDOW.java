package Classes_principais.in_front;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.MalformedURLException;
import java.net.URL;

public class WINDOW extends JFrame {

    public WINDOW(String nome) {
        setTitle(nome);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        URL url = this.getClass().getResource("/Images/blade_icon.png");
        Image icone = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(icone);
    }
}