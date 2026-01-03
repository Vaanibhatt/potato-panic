package src;

import java.awt.Color;
import java.awt.Graphics;

import javax.xml.crypto.dsig.Transform;

import org.dyn4j.world.World;
import org.dyn4j.collision.AbstractCollisionBody;
import org.dyn4j.dynamics.*;
import org.dyn4j.geometry.Geometry;
import org.dyn4j.geometry.MassType;
import org.dyn4j.geometry.Vector2;

public class Player implements GameObject {
    private double x;
    private double y;

    private Color color;

    private int depth;

    private int speed = 15;

    public boolean isMovingUp;
    public boolean isMovingDown;
    public boolean isMovingRight;
    public boolean isMovingLeft;
    Body playerBody;

    public Player(int startingPosX, int startingPosY, int playerDepth, Color playerColor, World<Body> world) {

        color = playerColor;
        depth = playerDepth;

        // Create a floor/ground body
        playerBody = new Body();
        BodyFixture fixture = new BodyFixture(Geometry.createRectangle(50.0, 50.0));



        playerBody.addFixture(fixture);

        playerBody.setMass(MassType.FIXED_ANGULAR_VELOCITY);

        world.addBody(playerBody);



        playerBody.translate(new Vector2(startingPosX, startingPosY));

        

    }

    public void movement() {
        if (isMovingUp) {
            y -= speed; 
            System.out.println("Up");
        }
        if (isMovingDown) {
            y += speed; 
        }
        if (isMovingLeft) {
            x -= speed;
        }
        if (isMovingRight) {
            x += speed;
        }
    }

    @Override
    public int getDepth() {
        return depth;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect((int)( x * 100), (int) (y  * 100), 50, 50);
        System.out.println(( x * 100) + " , " + (y  * 100));
    }

    @Override
    public void update() {
        playerBody.applyImpulse(new Vector2(0,1000));
        Vector2 position = playerBody.getWorldCenter();
        x = position.x;
        y = position.y;
        System.out.println(x +" , " + y);
    }

}
