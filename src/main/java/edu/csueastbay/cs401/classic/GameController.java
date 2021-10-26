package edu.csueastbay.cs401.classic;

import edu.csueastbay.cs401.pong.Collidable;
import edu.csueastbay.cs401.pong.Puckable;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GameController implements Initializable {
    public static final int FIELD_WIDTH = 1300;
    public static final int FIELD_HEIGHT = 860;
    public static final int VICTORY_SCORE = 10;

    private ClassicPong game;
    private Timeline timeline;

    @FXML
    AnchorPane fieldPane;
    @FXML
    Label playerOneScore;
    @FXML
    Label playerTwoScore;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // game = new ClassicPong(VICTORY_SCORE, FIELD_WIDTH, FIELD_HEIGHT);

        addGameElementsToField();
        setUpTimeline();

    }


    private void addGameElementsToField() {

    }

    @FXML
    public void keyPressed(KeyEvent event) {

    }

    @FXML
    public void keyReleased(KeyEvent event) {
    }

    private void setUpTimeline() {

    }


}
