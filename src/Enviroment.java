package src;

import java.util.List;

import javax.management.RuntimeErrorException;

import java.util.ArrayList;

import java.awt.Color;

import org.dyn4j.world.BroadphaseCollisionData;
import org.dyn4j.world.ManifoldCollisionData;
import org.dyn4j.world.NarrowphaseCollisionData;
import org.dyn4j.world.World;
import org.dyn4j.world.listener.CollisionListener;

import src.Objects.Floor;
import src.Objects.GameObject;
import src.Objects.PhysicsObject;
import src.Objects.Player;

import org.dyn4j.dynamics.*;
import org.dyn4j.geometry.Vector2;

public class Enviroment {
    // The smaller depth is the further away it is to the screen
    // The larger the number, the closer it is to the screen

    Player player1;
    Player player2;

    Floor floor;
    Floor floor2;

    public World<Body> world;

    List<GameObject> objects;
    List<PhysicsObject> physicsObjects;

    public Enviroment() {
        world = new World<Body>();
        world.setGravity(new Vector2(0, 10));

        objects = new ArrayList<>();
        physicsObjects = new ArrayList<>();
        // Create all objects
        player1 = new Player(7, 4, 1, new Color(255, 0, 0), world);
        floor = new Floor(7, 7, 2, new Color(0, 0, 255), world);
        floor2 = new Floor(8, 5, 2, new Color(0, 0, 255), world);

        // Add into the list of objects
        objects.add(player1);
        objects.add(floor);
        objects.add(floor2);

        physicsObjects.add(player1);
        physicsObjects.add(floor);
        physicsObjects.add(floor2);
        world.addCollisionListener(new CollisionListener<>() {
            @Override
            public boolean collision(BroadphaseCollisionData<Body, BodyFixture> collision) {
                return true;
            }

            @Override
            public boolean collision(NarrowphaseCollisionData<Body, BodyFixture> collision) {
                Body body1 = collision.getBody1();
                Body body2 = collision.getBody2();

                PhysicsObject obj1 = null;
                PhysicsObject obj2 = null;
                for (PhysicsObject physicsObject : physicsObjects) {
                    if (physicsObject.getBody() == body1) {
                        obj1 = physicsObject;
                    }

                    if (physicsObject.getBody() == body2) {
                        obj2 = physicsObject;
                    }
                }
                if (obj1 == null || obj2 == null) {
                    throw new RuntimeException("Could not find physics object");
                }
                obj1.collide(obj2);
                obj2.collide(obj1);

                return true;
            }

            @Override
            public boolean collision(ManifoldCollisionData<Body, BodyFixture> collision) {
                return true;
            }
        });
    }

    public List<GameObject> getObjects() {
        return objects;
    }

}
