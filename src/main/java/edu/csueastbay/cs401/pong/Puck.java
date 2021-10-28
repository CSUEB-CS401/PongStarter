package edu.csueastbay.cs401.pong;

import edu.csueastbay.cs401.pong.Puckable;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.Random;

public class Puck extends Circle implements Puckable{

    public static final int STARTING_RADIUS = 5;
    public static final Color STARTING_COLOR = Color.WHITE;
    public static final int STARTING_SPEED = 5;
    private final double fieldWidth;
    private final double fieldHeight;
    private double speed;
    private String id;
    private double direction;


    public Puck( double fieldWidth, double fieldHeight) {
        super();
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
        reset();
    }

    @Override
    public void move() {
        double deltaX = speed * Math.cos(Math.toRadians(direction));
        double deltaY = speed * Math.sin(Math.toRadians(direction));

        setCenterX(getCenterX() + deltaX);
        setCenterY(getCenterY() + deltaY);
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public void setID(String id) {
        this.id = id;
    }

    @Override
    public double getSpeed() {
        return this.speed;
    }

    @Override
    public double getDirection() {
        return this.direction;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void setDirection(double angle) {
        this.direction = angle;
    }

    @Override
    public void reset() {
        this.setFill(STARTING_COLOR);
        this.setRadius(STARTING_RADIUS);
        this.setCenterX(fieldWidth / 2);
        this.setCenterY(fieldHeight / 2);
        this.speed = STARTING_SPEED;

        Random random = new Random();
        if (random.nextBoolean()) {
            direction = (random.nextDouble() * 90) - 45;
        } else {
            direction = (random.nextDouble() * 90) + 135;
        }
    }
}
