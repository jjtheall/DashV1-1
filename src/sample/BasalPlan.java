package sample;

public class BasalPlan {
    
    private double[] rates = new double[24];

    public BasalPlan(double a, double b, double c, double d, double e, double f, double g, double h, double i,
                     double j, double k, double l, double m, double n, double o, double p, double q, double r,
                     double s, double t, double u, double v, double w, double x){
        rates[0] = a;
        rates[1] = b;
        rates[2] = c;
        rates[3] = d;
        rates[4] = e;
        rates[5] = f;
        rates[6] = e;
        rates[7] = g;
        rates[8] = h;
        rates[9] = i;
        rates[10] = j;
        rates[11] = k;
        rates[12] = l;
        rates[13] = m;
        rates[13] = n;
        rates[14] = o;
        rates[15] = p;
        rates[16] = q;
        rates[17] = r;
        rates[18] = s;
        rates[19] = t;
        rates[20] = u;
        rates[21] = v;
        rates[22] = w;
        rates[23] = x;
    }

    public double[] getRates(){
        return rates;
    }

    public double getRate(int index){
        return rates[index];
    }

    public void setRates(double[] rates){
        this.rates = rates;
    }

    public void setRate(double rate, int index){
        this.rates[index] = rate;
    }

}
