
package blockingdead2.pkg0;

import java.awt.Graphics;

public abstract class GameObject {
    protected float x;
    protected float y;
    protected float velx;
    protected float vely;
    protected ID id;

    public GameObject(float x, float y, ID id){
        this.setX(x);
        this.setY(y);
        this.id=id;
    }
    public abstract void tick();
    public abstract void render(Graphics g);


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getVelx() {
        return velx;
    }

    public void setVelx(float velx) {
        this.velx = velx;
    }

    public float getVely() {
        return vely;
    }

    public void setVely(float vely) {
        this.vely = vely;
    }
}
