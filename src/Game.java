package src;
import javax.swing.JFrame;

public class Game {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Potato Panic");

        GameCanvas gameCanvas = new GameCanvas();
        gameCanvas.setIgnoreRepaint(true);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jframe.setIgnoreRepaint(true);
        jframe.add(gameCanvas);
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        run(gameCanvas);

    }
//Fix this later
    public static void run(GameCanvas gameCanvas) {

        final double fps = 60.0;
        final double  secondsPerFrame =  1_000_000_000.0 / fps;
        double now = System.nanoTime();
        double lastFrame =  System.nanoTime();
        double delta = 0;

        while (true) {
            
            now = System.nanoTime();
            delta = now - lastFrame;
            if (delta > secondsPerFrame)
            {
                gameCanvas.render();
                lastFrame = now;
            }
            
        }
    }
}
