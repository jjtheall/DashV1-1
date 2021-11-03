package sample;

public class Data {

    private int ICRatio;
    private int correctionFactor;
    private int targetBG;
    private int curBG;
    private int carbs;

    public Data(int ICRatio, int correctionFactor, int targetBG, int curBG, int carbs){
        this.ICRatio = ICRatio;
        this.correctionFactor = correctionFactor;
        this.targetBG = targetBG;
        this.curBG = curBG;
        this.carbs = carbs;
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
}
