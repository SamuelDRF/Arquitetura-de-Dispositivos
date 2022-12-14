package pt.uma.arq.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.game.Animator;

import java.util.ArrayList;

public class Fleet{
    ////////////////////////////////
    //attributes
    ////////////////////////////////
    private SpriteBatch batch;
    private ArrayList<Ship> arrayListShip;
    protected int x, y;
    protected Animator animator;

    ////////////////////////////////
    //constructor
    ////////////////////////////////
    public Fleet(SpriteBatch batch){
        this.batch=batch;
        arrayListShip = new ArrayList<>();
        create(batch);
    }

    ////////////////////////////////
    //methods
    ////////////////////////////////
    public void create(SpriteBatch batch){
        //i*sep+mos-loc-mid
        //i=ship number                                                 variable
        //sep= separation between ships                                 x
        //mos=middle of screen                                          575/2
        //loc=(separation*(qty ships-1))/2 location of the first ship   x
        //mid=texture adjustment (approximate value)                                        x
        for (int i = 0; i < 10; i++) {
            SmallShip smallShip = new SmallShip(batch,i*50+(575/2)-225,500);
            arrayListShip.add(smallShip);
        }
        for (int i = 0; i < 6; i++) {
            MediumShip mediumShip = new MediumShip(batch,i*100+(575/2)-250-10,600);
            arrayListShip.add(mediumShip);
        }
        for (int i = 0; i < 8; i++) {
            BigShip bigShip = new BigShip(batch,i*75+(575/2)-262-10,700);
            arrayListShip.add(bigShip);
        }

    }

    public void render(){
        for (Ship ship: arrayListShip){
            ship.render();
        }
    }

    public boolean isEmpty() {
        return arrayListShip.isEmpty();
    }

    ////////////////////////////////
    //getters
    ////////////////////////////////

    public boolean isEmpy(){
        return arrayListShip.isEmpty();
    }

    public Ship checkCollided(ArrayList<Laser> laserArray) {
        for (Ship ship : arrayListShip) {
            for (Laser laser : laserArray) {
                if (ship.boundingBox.contains(laser.getX(), laser.getY())) {
                    laserArray.remove(laser);
                    ship.setHealth(ship.getHealth() - laser.getFirePower());
                    if (ship.getHealth() <= 0) {
                        arrayListShip.remove(ship);
                        //explosion-------------------------------------------------------------------------------------
                        this.animator= new Animator(batch, "explosion.png",5,1);
                        animator.create();
                        //this.batch= batch;
                        animator.render(laser.getX(),laser.getY());
                        //explosion-------------------------------------------------------------------------------------
                        return ship;
                    }
                    break;
                }
            }
        }
        return null;
    }
}
