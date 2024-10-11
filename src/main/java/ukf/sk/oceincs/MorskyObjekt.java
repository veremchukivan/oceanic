package ukf.sk.oceincs;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.util.Duration;

public class MorskyObjekt extends Canvas {
    protected GraphicsContext gc;
    private int rychlost;
    private boolean smerX;
    protected Image image;
    private Timeline casovac;


    public MorskyObjekt(int x, int y, int rychlost, Boolean smerX, String ImgPath) {
        super(100, 70);
        this.rychlost = rychlost;
        this.smerX = smerX;
        image = new Image(getClass().getResourceAsStream(ImgPath));

        setLayoutX(x);
        setLayoutY(y);
        gc = getGraphicsContext2D();
        casovac = new Timeline(new KeyFrame(Duration.millis(100), e -> posun()));
        casovac.setCycleCount(Animation.INDEFINITE);
        casovac.play();
    }

    private void posun() {
        if (smerX) {
            if ((getLayoutX() > 400) || (getLayoutX() < 0)){
                rychlost = -rychlost;
                ozvisa();
            }
            setLayoutX(getLayoutX() + rychlost);

        } else {
            if ((getLayoutY() > 330) || (getLayoutY() < 0)){
                rychlost = -rychlost;
                ozvisa();
            }
            setLayoutY(getLayoutY() + rychlost);
        }

        vykresli();
    }

    protected void vykresli() {
    }

    protected void ozvisa() {
    }
}