package src;

import java.awt.event.KeyListener;

import javax.swing.JPanel;

import java.awt.event.KeyEvent;

public class KeyHandler extends JPanel implements KeyListener {

     Enviroment enviroment;

     int playerSpeed;

     public KeyHandler(Enviroment enviroment, int playerSpeed) {
          this.enviroment = enviroment;
          this.playerSpeed = playerSpeed;
     }

     @Override
     public void keyTyped(KeyEvent e) {

     }

     @Override
     public void keyPressed(KeyEvent e) {

          // PLAYER 1
          if (e.getKeyCode() == KeyEvent.VK_W) {
               enviroment.player1.isMovingUp = true;

          }

          if (e.getKeyCode() == KeyEvent.VK_A) {
               enviroment.player1.isMovingLeft = true;
          }

          if (e.getKeyCode() == KeyEvent.VK_D) {
               enviroment.player1.isMovingRight = true;
          }

          // PLAYER 2
          if (e.getKeyCode() == KeyEvent.VK_UP) {
               enviroment.player2.isMovingUp = true;

          }

          if (e.getKeyCode() == KeyEvent.VK_LEFT) {
               enviroment.player2.isMovingLeft = true;
          }

          if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
               enviroment.player2.isMovingRight = true;
          }

          System.out.println("Pressed");
     }

     @Override
     public void keyReleased(KeyEvent e) {

          // PLAYER 1

          if (e.getKeyCode() == KeyEvent.VK_W) {
               enviroment.player1.isMovingUp = false;
          }

          if (e.getKeyCode() == KeyEvent.VK_A) {
               enviroment.player1.isMovingLeft = false;
          }

          if (e.getKeyCode() == KeyEvent.VK_D) {
               enviroment.player1.isMovingRight = false;
          }

          // PLAYER 2

          if (e.getKeyCode() == KeyEvent.VK_UP) {
               enviroment.player2.isMovingUp = false;
          }

          if (e.getKeyCode() == KeyEvent.VK_LEFT) {
               enviroment.player2.isMovingLeft = false;
          }

          if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
               enviroment.player2.isMovingRight = false;
          }

          System.out.println("Released");
     }

}
