package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.scene.Node;
import javafx.fxml.FXMLLoader;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class HomeController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private Data d;

    @FXML
    LineChart<Integer,Double> lineChart;
    @FXML
    private Label basalLabel;

    @FXML
    private void receiveData(MouseEvent event){
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        d = (Data) stage.getUserData();

        lineChart.getData().clear();
        XYChart.Series<Integer,Double> series = new XYChart.Series<Integer,Double>();
        for(int i=0; i<24; i++){
            series.getData().add(new XYChart.Data<Integer,Double>(i+1,d.getBasalPlan().getRate(i)));
        }
        lineChart.getData().add(series);
        //set BasalLabel text to current hourly rate
        String curTime = java.time.LocalTime.now().toString();
        int hour = Integer.parseInt(curTime.substring(0,2));
        basalLabel.setText("Current Basal Rate: " + d.getBasalPlan().getRate(hour) + "U/hr");
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
