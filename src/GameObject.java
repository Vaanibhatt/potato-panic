package src;

import java.awt.*;

//Abstract class can't be instatiated. Acts like blueprint for other classes
//Abstract class ensures I can never instantiate GameObject class
public interface GameObject {

    // ---Everything has a depth and a draw function---\\

    // Depth is the order in which it is draw onto the screen
    // The smaller depth is the further away it is to the screen
    // The larger the number, the closer it is to the screen
    public int getDepth();

    // Each object will have a unique draw code
    public void draw(Graphics graphics);

}
