package ukf.sk.oceincs;

public class Ponorka extends MorskyObjekt {

    public Ponorka(int x, int y, int r, Boolean s, String Imgpath) {
        super(x, y, r, s, Imgpath);
    }

    @Override
    protected void vykresli() {
        gc.clearRect(0,0, getWidth(),getHeight());
        gc.drawImage(image, 0, 0, getWidth(), getHeight());
    }

    @Override
    protected void ozvisa() {
        System.out.println("Ponorka: Hummm hummm!");
    }

}