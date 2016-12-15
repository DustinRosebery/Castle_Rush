package mainGUI;

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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameUI implements Initializable{

    /********************************************************
                     MAIN MENU COMPONENTS
     ********************************************************/
    @FXML private GridPane parent;
    @FXML private Canvas cnvs_menubg;
    @FXML private GridPane btn_contianer;
    @FXML private Button btn_newgame;
    @FXML private Button btn_continue;
    @FXML private Button btn_loadgame;
    @FXML private Button btn_highscores;

    private GraphicsContext gc;
    private GraphicsContext gc2;
    private Image bgImage;

    /*********************************************************
                    GAME UI COMPONENTS
     *********************************************************/
    @FXML private AnchorPane ancr_pane;
    @FXML private Canvas cnvs_gamebg;
    @FXML private HBox hbox;
    @FXML private Button btn_exit;
    @FXML private Button btn_pause;


    /**
     * catches main menu button presses.
     * @param e
     * @throws IOException
     */
    @FXML
    private void handleButtonEvent(ActionEvent e) throws IOException
    {
        if(e.getSource() == btn_newgame)
        {
            System.out.println("New Game Button Clicked");
            Parent pane = FXMLLoader.load(getClass().getResource("gameUI.fxml"));
            Stage stage = (Stage) btn_newgame.getScene().getWindow();
            stage.setTitle("Playing Castle Rush");
            stage.setScene(new Scene(pane));
            stage.show();
        }
        else if(e.getSource() == btn_continue)
        {
            System.out.println("Continue Button Clicked");
        }
        else if(e.getSource() == btn_loadgame)
        {
            System.out.println("Load Game Button Clicked");
        }
        else if(e.getSource() == btn_highscores)
        {
            System.out.println("HighScore Button Clicked");
        }
        else if(e.getSource() == btn_exit)
        {
            System.out.println("Exit Button Clicked");
        }
        else if(e.getSource() == btn_pause)
        {
            System.out.println("Pause Button Clicked");
        }
    }

    /**
     * Initialization of GUI
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        assert cnvs_menubg != null;

        // Interface init
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

        // gameUI init
        if(cnvs_gamebg != null)
        {
            gc2 = cnvs_gamebg.getGraphicsContext2D();
            bgImage = new Image("castledefense_background.png");
            gc2.drawImage(bgImage, 0, 0);
            System.out.println("background displayed to start game");
        }
        else
        {
            System.out.println("Game Canvas not initiliazed");
        }
    }
}
