package src.inputs;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import src.main.GamePanel;


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
        //Like an else if statem
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