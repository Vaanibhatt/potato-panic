package src;

import java.util.List;
import java.util.ArrayList;

import java.awt.Color;

public class World {
    // The smaller depth is the further away it is to the screen
    // The larger the number, the closer it is to the screen

    int playersSpeed = 1;
    
    Player player1 = new Player(800, 400, 1,new Color(255,0,0),playersSpeed);
    Player player2 = new Player(800, 400, 1,new Color(0,255,0),playersSpeed);
    
    public List<GameObject> createList() {

        List<GameObject> objectsList = new ArrayList<>();

        objectsList.add(player1);
        objectsList.add(player2);
        return objectsList;
    }

    public void world()
    {

    }
}
