package src.Objects;


import java.awt.Graphics;
import java.awt.Color;

import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;

import java.awt.Graphics;

import org.dyn4j.dynamics.Body;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;

public class DrawingHelper {
    public static void drawPhysicsBody(Graphics graphics, Body body, Color color) {
        Vector2 position = body.getWorldCenter();
        Rectangle rect = (Rectangle) body.getFixture(0).getShape();
        graphics.setColor(color);

        int x = (int) (position.x * 100);
        int y = (int) (position.y * 100);
        int w = (int) (rect.getWidth() * 100);
        int h = (int) (rect.getHeight() * 100);

        graphics.fillRect(x - (w / 2), y - (h / 2), w, h);
    }
}
