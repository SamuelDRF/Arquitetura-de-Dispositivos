package pt.uma.arq.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.awt.*;

public class PlayerShip extends Ship{
    ////////////////////////////////
    //attributes
    ////////////////////////////////

    public int score;
    //todo lifepoints
    //todo score

    ////////////////////////////////
    //constructor
    ////////////////////////////////
    public PlayerShip(SpriteBatch batch){
        //animator------------------------------------------------------------------------------------------------------
        this.animator= new Animator(batch, "ship.png",5,2);
        animator.create();
        this.batch= batch;
        //position------------------------------------------------------------------------------------------------------
        this.x = 575 / 2;
        this.y = 30;
        //box-----------------------------------------------------------------------------------------------------------
        boundingBox = new Rectangle(x,y,animator.getWidth(),animator.getHeight());
        //stats---------------------------------------------------------------------------------------------------------
        this.firePower=25;
        this.health=100;


        boundingBox = new Rectangle(x,y,animator.getWidth(),animator.getHeight());
    }

    ////////////////////////////////
    //methods
    ////////////////////////////////
    public void  hadleInput(){
        //normal speed
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            if (x > 0){
                x-=5;
            }
        }
        else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            if (x < 575) {
                x+=5;
            }
        }
        //slow speed
        else if (Gdx.input.isKeyPressed(Input.Keys.A)){
            if (x > 0) {
                x-=2;
            }
        }
        else if (Gdx.input.isKeyPressed(Input.Keys.D)){
            if (x < 575) {
                x+=2;
            }
        }
        //nosotros
        //creo que este setLocation envia las coordenadas x,y de la nave para actualizar su posicion y la de su hitbox
        setLocation(x,y);
    }
    @Override
    public Laser shoot() {
        Laser laser = new Laser(batch, x, y + 50, firePower);
        return laser;
    }
}
