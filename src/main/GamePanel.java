package src.main;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

import src.inputs.MouseInputs;
import src.inputs.KeyboardInputs;


//inherits methods from Jpanel
public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;

    private double xDelta = 0;
    private double yDelta = 0;

    private double xDir = 1.5;
    private double yDir = 1.5;

    private int frames = 0;
    private long lastCheck = 0;

    private Color color = new Color(179, 118, 173);


    public GamePanel(){
        mouseInputs = new MouseInputs();

        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value)
    {
        this.xDelta += value;
    }

    public void changeYDelta(int value)
    {
        this.yDelta += value;
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); //calls method paintComponent **IN JPANEL** (refers to parent class paintComponent)

        updatePositionRect();
        g.setColor(this.color);
        g.fillRect((int)this.xDelta , (int)this.yDelta, 200, 50);

        this.frames ++;
        if (System.currentTimeMillis() - this.lastCheck >= 1000)
        {
            this.lastCheck = System.currentTimeMillis();
            System.out.println(this.frames);
            this.frames = 0;
        }
    }

    private void updatePositionRect() {
        this.xDelta += this.xDir;
        if (this.xDelta > 400 || this.xDelta < 0)
            this.xDir *= -1;
        
        this.yDelta += this.yDir;
        if (this.yDelta > 400 || this.yDelta < 0)
            this.yDir *= -1;
        
    }
}
