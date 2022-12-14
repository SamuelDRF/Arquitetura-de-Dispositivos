package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;
import pt.uma.arq.game.Game;
import com.badlogic.gdx.Gdx;

import java.awt.*;
import java.util.ArrayList;

public class Laser {
    private Rectangle boundingBox;
    private  int x;
    private int y;
    private Animator animator;
    private int firePower;

    ////////////////////////////////
    //constructor
    ////////////////////////////////

    public Laser(SpriteBatch batch, int x, int y, int firePower){
        //animator------------------------------------------------------------------------------------------------------
        animator=new Animator(batch,"laser-bolts.png",2,2);
        //position------------------------------------------------------------------------------------------------------
        this.x=x;
        this.y=y;
        //stats---------------------------------------------------------------------------------------------------------
        this.firePower = firePower;
        //box-----------------------------------------------------------------------------------------------------------
        boundingBox = new Rectangle(x,y,animator.getWidth(),animator.getHeight());
    }
    ////////////////////////////////
    //methods
    ////////////////////////////////

    //create
    public  void create(){
        animator.create();
    }
    //render
    public void render(){
        animator.render(x,y);
    }
    //update
    public static void update(ArrayList<Laser> laserArray) {
        for (Laser laser : laserArray) {
            if (laser.getY() > 800) {
                laserArray.remove(laser);
                break;
            }
            laser.setY(laser.getY() + 5);

        }
    }

    ////////////////////////////////
    //getters and setters
    ////////////////////////////////

    public Rectangle getBoundingBox(){
        return boundingBox;
    }

    public void setBoundingBox(Rectangle boundingBox) {
        this.boundingBox = boundingBox;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Animator getAnimator() {
        return animator;
    }

    public void setAnimator(Animator animator) {
        this.animator = animator;
    }

    public int getFirePower() {
        return firePower;
    }
}
