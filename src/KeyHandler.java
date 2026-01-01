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

        //PLAYER 1
        if (e.getKeyCode() == KeyEvent.VK_W) 
            world.player1.isMovingUp = true;


        if (e.getKeyCode() == KeyEvent.VK_A) 
            world.player1.isMovingLeft = true;


        if (e.getKeyCode() == KeyEvent.VK_S) 
            world.player1.isMovingDown = true;


        if (e.getKeyCode() == KeyEvent.VK_D)
            world.player1.isMovingRight = true;

        //PLAYER 2

        if (e.getKeyCode() == KeyEvent.VK_UP) 
            world.player2.isMovingUp = true;


        if (e.getKeyCode() == KeyEvent.VK_LEFT) 
            world.player2.isMovingLeft = true;


        if (e.getKeyCode() == KeyEvent.VK_DOWN) 
            world.player2.isMovingDown = true;


        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            world.player2.isMovingRight = true;
        
        
        world.player1.movement();
        world.player2.movement();
    }

    @Override
    public void keyReleased(KeyEvent e) {

        //Player 1
        if (e.getKeyCode() == KeyEvent.VK_W) 
            world.player1.isMovingUp = false;
            
        
        if (e.getKeyCode() == KeyEvent.VK_A) 
            world.player1.isMovingLeft = false;
            
        
        if (e.getKeyCode() == KeyEvent.VK_S) 
            world.player1.isMovingDown = false;
            
    
        if (e.getKeyCode() == KeyEvent.VK_D)
            world.player1.isMovingRight = false;
            

        
        //PLAYER 2

        if (e.getKeyCode() == KeyEvent.VK_UP) 
            world.player2.isMovingUp = false;


        if (e.getKeyCode() == KeyEvent.VK_LEFT) 
            world.player2.isMovingLeft = false;


        if (e.getKeyCode() == KeyEvent.VK_DOWN) 
            world.player2.isMovingDown = false;


        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            world.player2.isMovingRight = false;


    }

}
