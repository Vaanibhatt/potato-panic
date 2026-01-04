package src.Objects;

import org.dyn4j.dynamics.Body;
import org.dyn4j.dynamics.BodyFixture;
import org.dyn4j.geometry.Geometry;
import org.dyn4j.geometry.MassType;
import org.dyn4j.geometry.Rectangle;
import org.dyn4j.geometry.Vector2;

public class PhysicsHelper {
    public static Body createRectBody( double width,double height, double x, double y, MassType massType)
    {
        Body body = new Body();
        body.setBullet(true);
        Rectangle shape = Geometry.createRectangle(width, height);
        BodyFixture fixture = new BodyFixture(shape);
        fixture.setRestitution(0.0);
        fixture.setFriction(0.5);
        fixture.setDensity(0.5);


        body.addFixture(fixture);
        

        body.setMass(massType);

        body.translate(new Vector2(x, y));
        return body;
    }
}
