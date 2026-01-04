package src.Objects;

import java.awt.Color;
import java.awt.Graphics;

import org.dyn4j.world.World;
import org.dyn4j.dynamics.*;
import org.dyn4j.geometry.Geometry;
import org.dyn4j.geometry.MassType;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;

public class Player implements GameObject, PhysicsObject {
    private double width = 0.5;
    private double height = 0.5;

    private double speed = 1;
    private double jumpImpulse = 1;
    private boolean canJump = true;

    private Color color;

    private int depth;

    public boolean isMovingUp;
    public boolean isMovingDown;
    public boolean isMovingRight;
    public boolean isMovingLeft;

    Body playerBody;

    Vector2 position;

    World world;

    public Player(int startingPosX, int startingPosY, int depth, Color color, World<Body> world) {

        this.color = color;
        this.depth = depth;

        this.world = world;

        playerBody = PhysicsHelper.createRectBody(width, height, startingPosX, startingPosY, MassType.FIXED_ANGULAR_VELOCITY);

        world.addBody(playerBody);

    }
    int counter = 0;
    public void movement() {
        if (isMovingUp && canJump) {
            playerBody.applyImpulse(new Vector2(0, -jumpImpulse));
            counter ++;
            canJump = false;
            System.out.println(counter);
        }
        else
        {
            counter = 0;
        }
        if (isMovingLeft) {
            playerBody.applyForce(new Vector2(-speed, 0));
        }
        if (isMovingRight) {
            playerBody.applyForce(new Vector2(speed, 0));
        }
        
    }

    // From GameObject
    @Override
    public int getDepth() {
        return depth;
    }

    @Override
    public void draw(Graphics graphics) {
        DrawingHelper.drawPhysicsBody(graphics, playerBody, color);
    }

    @Override
    public void update() {
        movement();
        canJump = false;

    }

    // From PhysicsObject
    @Override
    public String getName() {
        return "player";
    }

    @Override
    public void collide(PhysicsObject obj) {
        if (obj.getName().equals("floor") && obj.getBody().getWorldCenter().y > playerBody.getWorldCenter().y) {
            canJump = true;
        }
    }

    @Override
    public Body getBody() {
        return playerBody;
    }

}
