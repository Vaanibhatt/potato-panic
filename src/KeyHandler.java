package src;

import java.awt.event.KeyListener;

import javax.swing.JPanel;

import java.awt.event.KeyEvent;

public class KeyHandler extends JPanel implements KeyListener {

    World world;

    int playerSpeed;


    public KeyHandler(World thisWorld, int playerSpeed) {
        world = thisWorld;
        this.playerSpeed = playerSpeed;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) 
            world.player.isMovingUp = true;


        if (e.getKeyCode() == KeyEvent.VK_A) 
            world.player.isMovingLeft = true;


        if (e.getKeyCode() == KeyEvent.VK_S) 
            world.player.isMovingDown = true;


        if (e.getKeyCode() == KeyEvent.VK_D)
            world.player.isMovingRight = true;

        
        world.player.movement();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            world.player.isMovingUp = false;
            System.out.println("W");
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            world.player.isMovingLeft = false;
            System.out.println("A");
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            world.player.isMovingDown = false;
            System.out.println("S");
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            world.player.isMovingRight = false;
            System.out.println("D");
        }
    }

}
