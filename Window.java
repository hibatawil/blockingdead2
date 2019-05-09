/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockingdead2.pkg0;


import java.awt.Dimension;
import javax.swing.JFrame;

public class Window 
{
  public Window(int width, int height, String title, Game game) 
  {  
//implements game class so data is drawn from correct source  

        JFrame frame = new JFrame(title);  
//Set game frame dimensions/borders          
        frame.setPreferredSize(new Dimension(width, height));   
        frame.setMaximumSize(new Dimension(width, height)); 
        frame.setMinimumSize(new Dimension(width, height));  
        
//Allow a way to easily exit game via one button          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setResizable(false);  //so frame cannot be changed in game 
        frame.setVisible(true); 
        frame.setLocationRelativeTo(null); //centers the game  
        frame.add(game);   //adds game to the actual game 
  }  

}

