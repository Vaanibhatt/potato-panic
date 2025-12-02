import javax.swing.JPanel;
import java.awt.Graphics;

//inherits methods from Jpanel
public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;
    private int xDelta = 100;
    private int yDelta = 100;

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
        super.paintComponent(g); //calls method paintComponent **IN JPANEL**
        g.fillRect(xDelta, yDelta, 200, 50);
        repaint();
    }
}
