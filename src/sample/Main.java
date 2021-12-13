package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import java.io.IOException;
import org.json.simple.parser.ParseException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        JSONParser jsonParser = new JSONParser();

        try(FileReader reader = new FileReader("data.json")){
            Object obj = jsonParser.parse(reader);

            JSONArray dataDetails = (JSONArray) obj;
            JSONObject basal = (JSONObject) dataDetails.get(0);

            double a = (double)basal.get("0");
            double b = (double)basal.get("1");
            double c = (double)basal.get("2");
            double d1 = (double)basal.get("3");
            double e = (double)basal.get("4");
            double f = (double)basal.get("5");
            double g = (double)basal.get("6");
            double h = (double)basal.get("7");
            double i = (double)basal.get("8");
            double j = (double)basal.get("9");
            double k = (double)basal.get("10");
            double l = (double)basal.get("11");
            double m = (double)basal.get("12");
            double n = (double)basal.get("13");
            double o = (double)basal.get("14");
            double p = (double)basal.get("15");
            double q = (double)basal.get("16");
            double r = (double)basal.get("17");
            double s = (double)basal.get("18");
            double t = (double)basal.get("19");
            double u = (double)basal.get("20");
            double v = (double)basal.get("21");
            double w = (double)basal.get("22");
            double x = (double)basal.get("23");

            BasalPlan bp = new BasalPlan(a,b,c,d1,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x);
            Data d = new Data(bp);

            JSONObject ratios = (JSONObject) dataDetails.get(1);

            d.setICRatio(((Long)ratios.get("ICRatio")).intValue());
            d.setCorrectionFactor(((Long)ratios.get("correctionFactor")).intValue());
            d.setTargetBG(((Long)ratios.get("targetBG")).intValue());

            primaryStage.setUserData(d);

            Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            primaryStage.setTitle("Omnipod Dash");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        }
        catch(FileNotFoundException e){
            Parent root = FXMLLoader.load(getClass().getResource("BasalInput.fxml"));
            primaryStage.setTitle("Omnipod Dash");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ParseException e){
            e.printStackTrace();
        }



    }


    public static void main(String[] args) {
        launch(args);
    }
}
