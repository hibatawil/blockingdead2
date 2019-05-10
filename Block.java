package blockingdead2.pkg0;

import java.awt.*;

public class Block extends GameObject {
    public Block(float x,float y,ID id){
        super(x,y,id);
}
    public void tick() {

    }

    public void render(Graphics g) {
        //Use this to add borders in your game
        g.setColor(Color.gray);
        g.fillRect((int)x,(int)y,500,10);
        g.fillRect((int)x,(int)y,10,100);

    }
}
