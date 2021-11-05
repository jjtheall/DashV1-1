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

        //look at StartupSceenController sendData to continue


    }
}
