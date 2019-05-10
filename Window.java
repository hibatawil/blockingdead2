package blockingdead2.pkg0;

import blockingdead2.pkg0.Game;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Window
{
    public Window(int width, int height, String title, Game game) {
//implements game class so data is drawn from correct source

        JFrame frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.add(game);   //adds game to the actual game
    }

}



