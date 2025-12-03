public class Game implements Runnable{
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    //A thread is the small set of instruction that can be executed by the CPU
    private Thread gameThread;
    public Game(){
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
    }

    @Override 
    public void run()
    {

    }
}
