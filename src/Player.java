package src;

import java.awt.*;

public class Player implements GameObject{
    public int x;
    public int y;

    public Player(int startingPosX, int startingPosY)
    {
        x = startingPosX;
        y = startingPosY;
    }


    @Override
    public int getDepth() {
        return 0;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(new Color(255, 0, 0));
        graphics.fillRect(x,y, 50, 50);
    }
}
