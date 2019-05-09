/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

  // This will be the main class for rendering and updating 
package blockingdead2.pkg0;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game extends Canvas implements Runnable
{  
    
    public static int Width = 800, Height = 608; 
    public String title = "Blocking Dead";   
    
    //Create a thread 
    private Thread thread;    
    private boolean isRunning = false;    //determines if game is running
    
    public Game () 
    {
        // the main constructor   
        new Window(Width, Height, title, this);   
        start(); 
    }  
    //Create methods for starting/stopping the game 
    private synchronized void start() 
    {  
      if(isRunning) return;        //safety precaution  
      
      thread = new Thread(this);  
      thread.start(); 
      isRunning = true;    //thread wil call the run method 
      }    
    
    private synchronized void stop() 
    { 
      if(!isRunning) 
         return;      
      
        try 
        { 
            thread.join();
        } catch (InterruptedException ex) {
            
        }  
        isRunning = false; 
    }   
    
    //add gameloop  
    public void run() 
    {
        this.requestFocus(); 
        long lastTime = System.nanoTime(); 
        double amountOfTicks = 60.0;   
        double ns = 1000000000 / amountOfTicks; 
        double delta = 0; 
        long timer = System.currentTimeMillis();  
        int frames = 0; 
        //add while loop 
        while(isRunning)
        {
            long now = System.nanoTime(); 
            delta += (now - lastTime) / ns; 
            lastTime = now; 
            while(delta >= 1) 
            {
                tick();  //updating method 
                delta--; 
                
                
            }  
            render(); 
            frames++;  
            
            if(System.currentTimeMillis() - timer > 1000) {
                timer += 1000; 
                frames = 0; 
            }
        }
        stop(); 
    }
    //avoid a while loop due to insufficient regulation 
    
    private void tick() 
    {
     //will update the game      
    }   
    private void render() 
    {
      //will render the game   
      BufferStrategy bs = this.getBufferStrategy();  
      if(bs == null) 
      {
          this.createBufferStrategy(3);  
          return; 
      }  
      
      Graphics g = bs.getDrawGraphics();  
      //will be used to draw everything onto the screen    
      g.setColor(Color.BLACK);    
      g.fillRect(0, 0, Width, Height);
      //g.fill3DRect(0, 0, WIDTH, HEIGHT, false);  
      //Included rendering information  
      
      bs.show(); 
      g.dispose();
    }
   
    /**
     *
     * @param args
     */
    public static void main(String args[]) 
    {
        new Game(); 
    }
 
}
