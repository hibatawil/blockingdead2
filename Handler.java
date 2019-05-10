package blockingdead2.pkg0;

import java.awt.Graphics;
import java.util.LinkedList;

//This class is just in charge of updating and rendering everysingle thing in out game
public class Handler {
    public LinkedList<GameObject> object = new LinkedList<GameObject>();

    public void tick(){
        for (GameObject tempObject: object)
            tempObject.tick();

    }
    public void render(Graphics g){
        for (GameObject tempObject: object)
            tempObject.render(g);
    }
    public void addObject( GameObject tempObject){
        object.add(tempObject);
    }
    public void removeObject( GameObject tempObject){
        object.remove(tempObject);
    }
}
