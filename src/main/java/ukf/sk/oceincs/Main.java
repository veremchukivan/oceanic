package ukf.sk.oceincs;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        HBox tlacidla = new HBox(10);
        Button b1 = new Button("Pridaj");
        tlacidla.getChildren().addAll(b1);
        b1.setOnAction(evt -> pridajObjekt(root));
        root.getChildren().add(tlacidla);

        Scene scene = new Scene(root, 500, 400);
        scene.setFill(Color.LIGHTBLUE);
        stage.setScene(scene);
        stage.show();
    }

    private void pridajObjekt(Group root) {
        int x = (int) (Math.random() * 401);
        int y = (int) (Math.random() * 331);
        int rychlost;
        do {
            rychlost = -20 + (int) (Math.random() * 41);
        } while (rychlost >= -3 && rychlost <= 3);

        if (y > 200) {
            Zralok zralok = new Zralok(x, y, rychlost, true, "/ukf/sk/oceincs/zralok.png");
            root.getChildren().add(zralok);
        } else if (y > 100) {
            Ponorka ponorka = new Ponorka(x, y, rychlost, false, "/ukf/sk/oceincs/ponorka.png");
            root.getChildren().add(ponorka);
        } else {
            Nemo a = new Nemo(x, y, rychlost, true, "/ukf/sk/oceincs/nemo.png");
            root.getChildren().add(a);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
