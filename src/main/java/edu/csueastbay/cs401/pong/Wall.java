package edu.csueastbay.cs401.pong;

import javafx.geometry.Bounds;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Wall extends Rectangle implements Collidable{

    private String id;

    public Wall(String id, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.id = id;
    }

    @Override
    public Collision getCollision(Shape shape) {
        Bounds bounds = this.getLayoutBounds();
        return new Collision(
                "Wall",
                this.id,
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
        return "Wall";
    }
}
