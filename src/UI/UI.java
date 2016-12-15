package UI;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class UI {

    @FXML AnchorPane world_anchor;
    @FXML Canvas primary_canvas;
    @FXML GridPane menu_grid;

    GraphicsContext gc;
    Image background_image;

    /*@Override
    public void initialize()
    {
        return;
    }*/
}
