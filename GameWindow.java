import javax.swing.JFrame;

public class GameWindow {
    private JFrame jframe;

    public GameWindow(GamePanel gamePanel){

        jframe = new JFrame();//Creates new object

        jframe.setSize(400,400);
        jframe.setLocationRelativeTo(gamePanel);
        jframe.setName("Potato Panic");
        jframe.setTitle("Potato Panic");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.add(gamePanel);

        jframe.setVisible(true); //Updates
 
    }
}
