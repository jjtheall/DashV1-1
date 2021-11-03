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
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class BolusCalcController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private Data d;

    @FXML
    private TextField curBGField;
    @FXML
    private TextField carbsField;
    @FXML
    private Label totalBolusLabel;
    @FXML
    private Label bolusDeliveryStartLabel;

    @FXML
    private void receiveData(MouseEvent event){
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        d = (Data) stage.getUserData();
    }

    @FXML
    private void calculateBolus(ActionEvent event){
        int curBG = Integer.parseInt(curBGField.getText());
        int carbs = Integer.parseInt(carbsField.getText());

        double carbsInsulin = ((double)carbs/d.getICRatio());
        int bgDiff = curBG - d.getTargetBG();
        //may have to update the way this is handled if bgDiff is +/- to implement reverse correction
        //for calculations
        double bgInsulin = ((double)bgDiff)/d.getCorrectionFactor();
        double totalInsulin = Math.round((carbsInsulin + bgInsulin)*100)/100.0;

        totalBolusLabel.setText("Total Bolus: " + totalInsulin + "U");

    }

    @FXML
    private void startBolusDelivery(ActionEvent event){
        bolusDeliveryStartLabel.setVisible(true);
    }


}
