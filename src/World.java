package src;

import java.util.List;
import java.util.ArrayList;

import java.awt.Color;

public class World {
    // The smaller depth is the further away it is to the screen
    // The larger the number, the closer it is to the screen
    Player player;
    int playerSpeed = 1;
    public List<GameObject> createList() {
        player = new Player(800, 400, 1,new Color(255,0,0),15);
        List<GameObject> objectsList = new ArrayList<>();

        objectsList.add(player);
        return objectsList;
    }

    public void world()
    {

    }
}
