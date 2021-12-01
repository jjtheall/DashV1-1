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
import org.json.simple.JSONObject;
import java.io.FileWriter;
import org.json.simple.JSONArray;

public class BasalInputController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private BasalPlan bp;
    private Data d;

    @FXML
    private TextField midnightToOneField;
    @FXML
    private TextField oneToTwoField;
    @FXML
    private TextField twoToThreeField;
    @FXML
    private TextField threeToFourField;
    @FXML
    private TextField fourToFiveField;
    @FXML
    private TextField fiveToSixField;
    @FXML
    private TextField sixToSevenField;
    @FXML
    private TextField sevenToEightField;
    @FXML
    private TextField eightToNineField;
    @FXML
    private TextField nineToTenField;
    @FXML
    private TextField tenToElevenField;
    @FXML
    private TextField elevenToTwelveField;
    @FXML
    private TextField twelveToThirteenField;
    @FXML
    private TextField thirteenToFourteenField;
    @FXML
    private TextField fourteenToFifteenField;
    @FXML
    private TextField fifteenToSixteenField;
    @FXML
    private TextField sixteenToSeventeenField;
    @FXML
    private TextField seventeenToEighteenField;
    @FXML
    private TextField eighteenToNineteenField;
    @FXML
    private TextField nineteenToTwentyField;
    @FXML
    private TextField twentyToTwentyOneField;
    @FXML
    private TextField twentyOneToTwentyTwoField;
    @FXML
    private TextField twentyTwoToTwentyThreeField;
    @FXML
    private TextField twentyThreeToMidnightField;

    @FXML
    private void sendData(ActionEvent event) throws IOException{
        double a = Double.parseDouble(midnightToOneField.getText());
        double b = Double.parseDouble(oneToTwoField.getText());
        double c = Double.parseDouble(twoToThreeField.getText());
        double d1 = Double.parseDouble(threeToFourField.getText());
        double e = Double.parseDouble(fourToFiveField.getText());
        double f = Double.parseDouble(fiveToSixField.getText());
        double g = Double.parseDouble(sixToSevenField.getText());
        double h = Double.parseDouble(sevenToEightField.getText());
        double i = Double.parseDouble(eightToNineField.getText());
        double j = Double.parseDouble(nineToTenField.getText());
        double k = Double.parseDouble(tenToElevenField.getText());
        double l = Double.parseDouble(elevenToTwelveField.getText());
        double m = Double.parseDouble(twelveToThirteenField.getText());
        double n = Double.parseDouble(thirteenToFourteenField.getText());
        double o = Double.parseDouble(fourteenToFifteenField.getText());
        double p = Double.parseDouble(fifteenToSixteenField.getText());
        double q = Double.parseDouble(sixteenToSeventeenField.getText());
        double r = Double.parseDouble(seventeenToEighteenField.getText());
        double s = Double.parseDouble(eighteenToNineteenField.getText());
        double t = Double.parseDouble(nineteenToTwentyField.getText());
        double u = Double.parseDouble(twentyToTwentyOneField.getText());
        double v = Double.parseDouble(twentyOneToTwentyTwoField.getText());
        double w = Double.parseDouble(twentyTwoToTwentyThreeField.getText());
        double x = Double.parseDouble(twentyThreeToMidnightField.getText());

        bp = new BasalPlan(a,b,c,d1,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x);
        d = new Data(bp);

        JSONObject basal = new JSONObject();

        basal.put("0",a);
        basal.put("1",b);
        basal.put("2",c);
        basal.put("3",d1);
        basal.put("4",e);
        basal.put("5",f);
        basal.put("6",g);
        basal.put("7",h);
        basal.put("8",i);
        basal.put("9",j);
        basal.put("10",k);
        basal.put("11",l);
        basal.put("12",m);
        basal.put("13",n);
        basal.put("14",o);
        basal.put("15",p);
        basal.put("16",q);
        basal.put("17",r);
        basal.put("18",s);
        basal.put("19",t);
        basal.put("20",u);
        basal.put("21",v);
        basal.put("22",w);
        basal.put("23",x);

        JSONArray dataDetails = new JSONArray();
        dataDetails.add(basal);
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

        root = FXMLLoader.load(getClass().getResource("BasalInput.fxml"));

        stage.setUserData(d);

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void switchToStartupScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("StartupScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
