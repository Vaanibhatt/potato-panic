import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class KeyboardInputs implements KeyListener
{
    private GamePanel gamePanel;
    
    public KeyboardInputs(GamePanel gamePanel)
    {
        this.gamePanel = gamePanel;
    }
    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int speed = 5;
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_W:
                gamePanel.changeYDelta(-speed);
                break;
            case KeyEvent.VK_A:
                gamePanel.changeXDelta(-speed);
                break;
            case KeyEvent.VK_S: 
                gamePanel.changeYDelta(speed);
                break;
            case KeyEvent.VK_D:
                gamePanel.changeXDelta(speed);
        }
    }


}