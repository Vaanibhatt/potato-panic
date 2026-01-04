package src.Objects;

import java.awt.Color;
import java.awt.Graphics;

import org.dyn4j.world.World;
import org.dyn4j.dynamics.*;
import org.dyn4j.geometry.Geometry;
import org.dyn4j.geometry.MassType;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;

public class Floor implements GameObject, PhysicsObject{

    private Color color;

    private int depth;

    public boolean isMovingUp;
    public boolean isMovingDown;
    public boolean isMovingRight;
    public boolean isMovingLeft;

    Body floorBody;

    Vector2 position;

    double width = 4;
    double height = 0.5;

    World world;
    public Floor(int startingPosX, int startingPosY, int depth, Color color, World<Body> world) {

        this.color = color;
        this.depth = depth;

        this.world = world;

        


        
        floorBody = PhysicsHelper.createRectBody(width, height, startingPosX, startingPosY,MassType.INFINITE);
        world.addBody(floorBody);        

        position = floorBody.getWorldCenter();
    }



    @Override
    public int getDepth() {
        return depth;
    }

    @Override
    public void draw(Graphics graphics) {
        DrawingHelper.drawPhysicsBody(graphics, floorBody, color);
    }


    @Override
    public void update() {
        
    }


    //From PhysicsObject
    @Override
    public String getName() {
        return "floor";
    }

    @Override
    public void collide(PhysicsObject obj) {
        //whatever shoudl happen upon collision
    }

    @Override
    public Body getBody() {
        return floorBody;
    }



}
