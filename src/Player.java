package src;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Player extends JFrame implements GameObject {
    private int x;
    private int y;

    private Color color;

    private int depth;

    private int speed;

    public boolean isMovingUp, isMovingDown, isMovingRight, isMovingLeft;


    public Player(int startingPosX, int startingPosY, int playerDepth, Color playerColor, int playerSpeed) {
        x = startingPosX;
        y = startingPosY;

        color = playerColor;
        depth = playerDepth;

        speed = playerSpeed;
    }
    
    public void movement()
    {
        if(isMovingUp)
        {
            y -= speed;
        }
        if(isMovingDown)
        {
            y += speed;
        }
        if(isMovingLeft)
        {
            x -= speed;
        }
        if(isMovingRight)
        {
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
        graphics.fillRect(x, y, 50, 50);
    }

}
