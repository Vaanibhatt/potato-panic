
public class Game implements Runnable{
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private final int FPS_SET = 120;
    
    //A thread is the small set of instruction that can be executed by the CPU
    private Thread gameLoopThread;

    public Game()
    {
        this.gamePanel = new GamePanel();
        this.gameWindow = new GameWindow(this.gamePanel);
        gamePanel.requestFocus();
        startGameLoop();
    }


    private void startGameLoop()
    {
        //this refers to current object
        this.gameLoopThread = new Thread(this);
        gameLoopThread.start();

    }
    //Only repaints when the time between the last frame and current frame is a certain value
    //Ensures smooth gameplay
    @Override 
    public void run()
    {
        //duration of each frame
        double timePerFrame = 1000000000.0/this.FPS_SET;
        long lastFrame = System.nanoTime();
        long now;
        while (true)
        {
            now = System.nanoTime();
            if (now - lastFrame >= timePerFrame) 
            {
                gamePanel.repaint();
                lastFrame = now;
            }

        }
    }
}
