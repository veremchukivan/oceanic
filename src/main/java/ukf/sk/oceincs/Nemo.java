package ukf.sk.oceincs;

import javafx.scene.paint.Color;

public class Nemo extends MorskyObjekt {

    public Nemo(int x, int y, int r, Boolean s, String Imgpath) {
        super(x, y, r, s, Imgpath);
    }

    @Override
    protected void vykresli() {
        gc.clearRect(0,0, getWidth(),getHeight());
        gc.drawImage(image, 0, 0, getWidth(), getHeight());
    }

    @Override
    protected void ozvisa() {
        System.out.println("Nemo: Blub blub!");
    }
}
