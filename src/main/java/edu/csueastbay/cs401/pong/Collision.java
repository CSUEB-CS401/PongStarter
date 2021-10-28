package edu.csueastbay.cs401.pong;

public class Collision {

    private final String type;
    private final String ObjectID;
    private final boolean collided;
    private final double centerX;
    private final double centerY;
    private final double top;
    private final double bottom;
    private final double left;
    private final double right;


    public Collision(String type, String objectID, boolean collided, double top, double bottom, double left, double right) {
        this.type = type;
        ObjectID = objectID;
        this.collided = collided;
        this.centerX = left + ((right - left) / 2);
        this.centerY = top + ((bottom - top) / 2);
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }

    public String getType() { return type;  }
    public String getObjectID() { return ObjectID; }
    public boolean isCollided() { return collided; }
    public double getCenterX() { return centerX; }
    public double getCenterY() { return centerY; }
    public double getTop() { return top; }
    public double getBottom() { return bottom; }
    public double getLeft() { return left; }
    public double getRight() { return right; }
}
