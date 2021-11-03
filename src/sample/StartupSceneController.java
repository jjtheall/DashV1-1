package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class StartupSceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField ICRatioField;
    @FXML
    private TextField correctionFactorField;
    @FXML
    private TextField targetBGField;
}
