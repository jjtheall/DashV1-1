package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;

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

    @FXML
    private void sendData(ActionEvent event) throws IOException{
        int ICRatio = Integer.parseInt(ICRatioField.getText());
        int correctionFactor = Integer.parseInt(correctionFactorField.getText());
        int targetBG = Integer.parseInt(targetBGField.getText());

        Data d = new Data(ICRatio, correctionFactor, targetBG);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();

        root = FXMLLoader.load(getClass().getResource("StartupScene.fxml"));

        stage.setUserData(d);

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToBolusCalc(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("BolusCalc.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
