import javax.swing.JFrame;
public class GameWindow {
    private JFrame jframe;
    private final int WIDTH = 800;
    private final int HEIGHT = 500;
    public GameWindow(GamePanel gamePanel){

        jframe = new JFrame();//Creates new object

        jframe.setSize(this.WIDTH,this.HEIGHT);
        jframe.setLocationRelativeTo(gamePanel);
        jframe.setName("Potato Panic");
        jframe.setTitle("Potato Panic");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.add(gamePanel);

        jframe.setVisible(true); //Updates
 
    }

}
