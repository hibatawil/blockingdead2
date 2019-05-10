package blockingdead2.pkg0;

import java.awt.*;
import java.security.Key;
import java.util.Scanner;
public class Player extends GameObject {
    public Player (float x,float y, ID id){
        super(x,y,id);
        Scanner Keyboard = new Scanner(System.in);

        System.out.print("Enter speed in the x direction: ");
        velx=Keyboard.nextByte();
        System.out.println(" ");
        System.out.print("Enter speed in the y direction: ");
        vely=Keyboard.nextByte();
    }
    @Override
    public void tick() {
        x+=velx;
        y+=vely;
        if(x>Game.Width) x=0;
        if(y>Game.Height)y=0;
    }
    @Override
    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect((int)x,(int)y,32,32);
    }
}
