package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public abstract class Ship {
    ////////////////////////////////
    //attributes
    ////////////////////////////////

    protected Animator animator;
    protected int x, y;
    protected Rectangle boundingBox;
    protected SpriteBatch batch;

    protected int firePower;
    protected int health;
    protected Boolean collided;

    ////////////////////////////////
    //methods
    ////////////////////////////////

    public abstract Laser shoot();

    public void render(){
        animator.render(x,y);
    }




    ////////////////////////////////
    //getter and setter
    ////////////////////////////////
    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setLocation(int x, int y){
        this.x=x;
        this.y=y;
        this.boundingBox.setLocation(x,y);
    }

    public int getWidth(){
        return animator.getWidth();
    }

    public Animator getAnimator() {
        return animator;
    }

    public void setAnimator(Animator animator) {
        this.animator = animator;
    }

    public int getX() {
        return x;
    }

    public void setY() {
        this.x = x;
    }
}
