package src;


public class Game {
    public static void main(String[] args) {
        GameCanvas gameCanvas = new GameCanvas();
        run(gameCanvas);

    }

    public static void run(GameCanvas gameCanvas) {

        final double fps = 60.0;
        final double secondsPerFrame = 1_000_000_000.0 / fps;
        double now = System.nanoTime();
        double lastFrame = System.nanoTime();
        double delta = 0;

        while (true) {

            now = System.nanoTime();
            delta = now - lastFrame;
            if (delta > secondsPerFrame) {
                gameCanvas.render();
                lastFrame = now;
            }

        }
    }

}
