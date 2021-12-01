package sample;

import org.json.simple.JSONArray;

public class Data {

    private int ICRatio;
    private int correctionFactor;
    private int targetBG;
    private int curBG;
    private int carbs;
    private BasalPlan bp;
    private JSONArray dataDetails;

    public Data(int ICRatio, int correctionFactor, int targetBG, int curBG, int carbs, BasalPlan bp){
        this.ICRatio = ICRatio;
        this.correctionFactor = correctionFactor;
        this.targetBG = targetBG;
        this.curBG = curBG;
        this.carbs = carbs;
        this.bp = bp;
    }

    public Data(int ICRatio, int correctionFactor, int targetBG){
        this.ICRatio = ICRatio;
        this.correctionFactor = correctionFactor;
        this.targetBG = targetBG;
    }

    public Data(int curBG, int carbs){
        this.curBG = curBG;
        this.carbs = carbs;
    }

    public Data(BasalPlan bp){
        this.bp = bp;
    }

    public int getICRatio() {
        return ICRatio;
    }

    public void setICRatio(int ICRatio) {
        this.ICRatio = ICRatio;
    }

    public int getCorrectionFactor() {
        return correctionFactor;
    }

    public void setCorrectionFactor(int correctionFactor) {
        this.correctionFactor = correctionFactor;
    }

    public int getTargetBG() {
        return targetBG;
    }

    public void setTargetBG(int targetBG) {
        this.targetBG = targetBG;
    }

    public int getCurBG() {
        return curBG;
    }

    public void setCurBG(int curBG) {
        this.curBG = curBG;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public BasalPlan getBasalPlan() {
        return bp;
    }

    public void setBasalPlan(BasalPlan bp) {
        this.bp = bp;
    }

    public JSONArray getDataDetails() {
        return dataDetails;
    }

    public void setDataDetails(JSONArray dataDetails) {
        this.dataDetails = dataDetails;
    }
}
