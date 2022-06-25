package battleship.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelInicial extends JFrame {
    static JFrame frame = new JFrame("teste");

    static JButton botaoSingle;

    static PainelInicial.ButtonHandler handler = new PainelInicial.ButtonHandler();
    PainelInicial() {
        ImageIcon iconeSingle = new ImageIcon("singleplayer.png");
        botaoSingle = new JButton("SinglePlayer");
//        botaoSingle.setBorder((BorderFactory.createEmptyBorder()));
//        botaoSingle.setContentAreaFilled(false);
        botaoSingle.setFocusable(false);
        botaoSingle.addActionListener(handler);
        botaoSingle.setBounds(350, 300, 200, 50);
        botaoSingle.setIcon(iconeSingle);

        ImageIcon iconeMulti = new ImageIcon("multiplayer.png");
        JButton botaoMulti = new JButton("MultiPlayer");
        botaoMulti.addActionListener(handler);
        botaoMulti.setBounds(650, 300, 200, 50);
        botaoMulti.setFocusable(false);
        botaoMulti.setIcon(iconeMulti);
        botaoMulti.setEnabled(false);

        this.setContentPane(new JLabel(new ImageIcon("imagem_bg.jpeg")));
        this.add(botaoSingle);
        this.add(botaoMulti);
        this.pack();
        this.setResizable(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

      public static class ButtonHandler implements ActionListener {
          @Override
          public void actionPerformed(ActionEvent event) {
              if (event.getSource() == botaoSingle) {
                  BatalhaNaval.painel.setVisible(false);
                  BatalhaNaval.JogoSolo();
                  System.out.println("single");
              } else {
                  System.out.println("multi");
              }
          }
      }
}
