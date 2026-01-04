package src.Objects;

import java.awt.*;

import org.dyn4j.dynamics.Body;


public interface PhysicsObject {

    public String getName();
    public void collide(PhysicsObject obj);
    public Body getBody();

}
