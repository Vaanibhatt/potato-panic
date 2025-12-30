package src;

import java.util.*;

public class World {
    
    public ArrayList<GameObject> createList()
    {
        Player player = new Player(800, 400);
        ArrayList<GameObject> objectsList = new ArrayList<>();

        objectsList.add(player);

        return objectsList;
    }
}
