package src;

import java.util.List;
import java.util.ArrayList;

import java.awt.Color;

import org.dyn4j.world.World;
import org.dyn4j.dynamics.*;
import org.dyn4j.geometry.Vector2;

public class Enviroment {
    // The smaller depth is the further away it is to the screen
    // The larger the number, the closer it is to the screen

    Player player1;
    Player player2;

    public World<Body> world;

    public Enviroment() {
        world = new World<Body>();


    }

    public List<GameObject> createList() {

        List<GameObject> objectsList = new ArrayList<>();

        // Create all objects
        player1 = new Player(1, 1, 1, new Color(255, 0, 0), world);
        // player2 = new Player(700, 450, 1, new Color(0, 255, 0),world);

        // Add into list
        objectsList.add(player1);
        // objectsList.add(player2);

        return objectsList;
    }

}
