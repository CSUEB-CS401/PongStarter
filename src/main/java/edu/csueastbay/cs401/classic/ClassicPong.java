package edu.csueastbay.cs401.classic;

import edu.csueastbay.cs401.pong.*;
import javafx.scene.paint.Color;

public class ClassicPong extends Game {


    public static double mapRange(double a1, double a2, double b1, double b2, double s) {
        return b1 + ((s - a1)*(b2 - b1))/(a2 - a1);
    }

}
