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
import org.json.simple.JSONObject;
import java.io.FileWriter;
import org.json.simple.JSONArray;

public class StartupSceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private Data d;

    @FXML
    private TextField ICRatioField;
    @FXML
    private TextField correctionFactorField;
    @FXML
    private TextField targetBGField;

    @FXML
    private void receiveData(MouseEvent event){
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        d = (Data) stage.getUserData();
    }

    @FXML
    private void sendData(ActionEvent event) throws IOException{
        int ICRatio = Integer.parseInt(ICRatioField.getText());
        int correctionFactor = Integer.parseInt(correctionFactorField.getText());
        int targetBG = Integer.parseInt(targetBGField.getText());

        d.setICRatio(ICRatio);
        d.setCorrectionFactor(correctionFactor);
        d.setTargetBG(targetBG);

        JSONObject ratios = new JSONObject();
        ratios.put("ICRatio", ICRatio);
        ratios.put("correctionFactor",correctionFactor);
        ratios.put("targetBG",targetBG);

        JSONArray dataDetails = d.getDataDetails();
        dataDetails.add(ratios);
        d.setDataDetails(dataDetails);

        try(FileWriter file = new FileWriter("data.json")){
            file.write(dataDetails.toJSONString());
            file.flush();
        }
        catch(IOException IOe){
            IOe.printStackTrace();
        }

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.close();

        root = FXMLLoader.load(getClass().getResource("StartupScene.fxml"));

        stage.setUserData(d);

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToHome(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
