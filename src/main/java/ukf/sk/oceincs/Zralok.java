package ukf.sk.oceincs;

public class Zralok extends MorskyObjekt {

    public Zralok(int x, int y, int r, Boolean s, String Imgpath) {
        super(x, y, r, s, Imgpath);
    }

    @Override
    protected void vykresli() {
        gc.clearRect(0,0, getWidth(),getHeight());
        gc.drawImage(image, 0, 0, getWidth(), getHeight());
    }

    @Override
    protected void ozvisa() {
        System.out.println("Žralok: Dun dun... Dun dun...");
    }

}
