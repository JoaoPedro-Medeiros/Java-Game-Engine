package Classes_principais.in_front;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Date;

public class WINDOW extends JFrame {

    JPanel painelInicial = new JPanel();

    public WINDOW(String nome) {
        //configurando JFrame

        setTitle(nome);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.black);


        //Alterando Icone

        URL url = this.getClass().getResource("/Images/blade_icon.png");
        Image icone = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(icone);

        //Adicionando o JPanel inicial

        this.painelInicial.setBackground(Color.darkGray);
        this.add(painelInicial);
    }

}