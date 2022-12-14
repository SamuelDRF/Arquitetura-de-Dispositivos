package pt.uma.arq.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import pt.uma.arq.entities.Fleet;
import pt.uma.arq.entities.Laser;
import pt.uma.arq.entities.PlayerShip;
import pt.uma.arq.entities.Ship;
import java.util.ArrayList;
import com.badlogic.gdx.Input;

public class Game extends ApplicationAdapter {
    private SpriteBatch batch;
    private BackgroundManagement backgroundManagement;
    private BitmapFont font;
    private PlayerShip playerShip;
    private ArrayList<Laser> laserArray;

    //Nosotros-----------------------------------------
    private Fleet fleet;


    @Override
    public void create() {
        Gdx.graphics.setWindowedMode(600, 800);
        batch = new SpriteBatch();
        font = new BitmapFont(Gdx.files.internal("gamefont.fnt"),
                Gdx.files.internal("gamefont.png"), false);
        backgroundManagement = new BackgroundManagement(batch);
        playerShip= new PlayerShip(batch);

        //Nosotros-----------------------------------------
        laserArray = new ArrayList<>();
        fleet = new Fleet(batch);
    }

    @Override
    public void render() {

        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        if (fleet.isEmpy()){
            font.draw(batch,"You Won",Gdx.graphics.getWidth()/2,Gdx.graphics.getHeight()/2);
        }
        else {
            backgroundManagement.render();
            playerShip.hadleInput();
            playerShip.render();

            //Nosotros-----------------------------------------
            fleet.checkCollided(laserArray);
            Laser.update(laserArray);
            for (Laser laser : laserArray) {
                laser.render();
            }
            gameHandleInputs();
            fleet.render();
        }
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    public void gameHandleInputs() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
            Laser laser = playerShip.shoot();
            laser.create();
            laserArray.add(laser);
        }
    }
}