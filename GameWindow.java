import javax.swing.JFrame;
import java.awt.*;

public class GameWindow {
    private JFrame jframe;
    private final int WIDTH;
    private final int HEIGHT;
    public GameWindow(GamePanel gamePanel){

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        WIDTH = (int) screenSize.getWidth();
        HEIGHT = (int) screenSize.getHeight();

        jframe = new JFrame();//Creates new object


        jframe.setSize(this.WIDTH,this.HEIGHT);
        jframe.setResizable(false);
        jframe.setLocationRelativeTo(gamePanel);
        jframe.setName("Potato Panic");
        jframe.setTitle("Potato Panic");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.add(gamePanel);

        jframe.setVisible(true); //Updates
 
    }

}
