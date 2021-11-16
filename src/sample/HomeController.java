package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

public class HomeController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private Data d;

    @FXML
    private Label BasalLabel;

    @FXML
    private void receiveData(MouseEvent event){
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        d = (Data) stage.getUserData();

        //set BasalLabel text to current hourly rate
        String curTime = java.time.LocalTime.now().toString();
        int hour = Integer.parseInt(curTime.substring(0,2));
        BasalLabel.setText("Current Basal Rate: " + d.getBasalPlan().getRate(hour) + "U/hr");
    }

    @FXML
    private void switchToBasalInput(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("BasalInput.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToStartupScene(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("StartupScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToBolusCalc(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("BolusCalc.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
