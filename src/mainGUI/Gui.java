import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Gui implements Initializable{
    @FXML private GridPane parent;
    @FXML private Canvas cnvs_menubg;
    @FXML private GridPane btn_contianer;
    @FXML private Button btn_newgame;
    @FXML private Button btn_continue;
    @FXML private Button btn_loadgame;
    @FXML private Button btn_highscores;

    private GraphicsContext gc;
    private Image bgImage;

    @FXML
    private void handleButtonEvent(ActionEvent e) throws IOException
    {
        Parent root;
        Stage stage;

        if(e.getSource() == btn_newgame)
        {
            //root = FXMLLoader.load(getClass().getResource("gameGUI.game.fxml"));
            //stage = (Stage) btn_newgame.getScene().getWindow();
            //Scene scene = new Scene(root);
            //stage.setScene(scene);
            //stage.show();
        }
        else if(e.getSource() == btn_continue)
        {

        }
        else if(e.getSource() == btn_loadgame)
        {

        }
        else if(e.getSource() == btn_highscores)
        {

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        assert cnvs_menubg != null;
        if(cnvs_menubg != null)
        {
            gc = cnvs_menubg.getGraphicsContext2D();
            bgImage = new Image("castledefense_background.png");
            gc.drawImage(bgImage, 0,0);
            System.out.println("background displayed");
        }
        else
        {
            System.out.println("canvas not initilized");
        }
    }
}
