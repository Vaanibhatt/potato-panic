import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;
//inherits methods from Jpanel
public class GamePanel extends JPanel{

    public GamePanel(){
        addKeyListener(new KeyboardInputs());
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); //calls method paintComponent **IN JPANEL**
        g.fillRect(100, 100, 200, 50);
    }
}
