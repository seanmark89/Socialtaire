import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI extends Application {

    @Overide
    public void start(Stage stage) {
        initUI(stage);

        stage.setFullScreen(true);  // full screen
        stage.initStyle(StageStyle.DECORATED);  // title bar & minimize / maximize / close buttons
        stage.setTitle("Socialtaire");
    }

    stage.show();

}