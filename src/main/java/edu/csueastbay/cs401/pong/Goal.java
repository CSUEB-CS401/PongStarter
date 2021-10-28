package edu.csueastbay.cs401.pong;

import javafx.geometry.Bounds;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Shape;


public class Goal extends Rectangle implements Collidable {

    private String id;

    public Goal(String id, double x, double y, double width, double height) {
        super(x, y, width, height);
        this.id = id;
    }

    @Override
    public Collision getCollision(Shape shape) {
        Bounds bounds = this.getLayoutBounds();

        return new Collision(
                this.getType(),
                this.getID(),
                bounds.intersects(shape.getLayoutBounds()),
                bounds.getMinY(),
                bounds.getMaxY(),
                bounds.getMinX(),
                bounds.getMaxX()
        );
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getType() {
        return "Goal";
    }
}
