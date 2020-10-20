
public class SLR {
    private final int n;
    private final int [] x;
    private final int [] y;
    private final String [] data;
   
    public SLR(DataSet ds, String[] data){
        this.x = ds.getDataSet_X();
        this.y = ds.getDataSet_Y();
        this.data = data;
        this.n = x.length;
    }
    public int getN(){
        return n;
    }
    public double getBeta_1(){
       double xy, xSum, ySum, xSqr;
        xy = getXY();
        xSum = getXsum();
        ySum = getYSum();
        xSqr = getXSqr();
        return (n*xy - xSum * ySum)/(n*xSqr - Math.pow(xSum, 2));
    }
    public double getBeta_0(){
        double xSum, ySum, beta1;
        xSum = getXsum();
        ySum = getYSum();
        beta1 = getBeta_1();
        return (ySum - beta1*xSum)/n;
    }
    public double getYSum(){
        double y = 0;
        for(int i=0;i < n;i++){
            y = y + this.y[i];
        }
        return y;
    }
    public double getXsum(){
        double x = 0;
        for(int i=0;i < n;i++){
            x = x + this.x[i];
        }
        return x;
    }
    public double getXSqr(){
        double xSqr = 0;
        for(int i=0;i < n;i++){
            xSqr = xSqr + Math.pow(this.x[i], 2);
        }
        return xSqr;
    }
    public double getXY(){
        double xy = 0;
        double [] array = new double[n];
        for(int i=0;i < n;i++){
            array[i] = this.x[i]*this.y[i];
        }
        for(int i=0;i < n;i++){
            xy = xy + array[i];
        }
        return xy;
    }
    public double[] buildLRS(){
        double [] y_hat = new double[n];
        for(int i = 0;i < n;i++){
            y_hat[i] = getBeta_0() + getBeta_1() * Double.parseDouble(data[i]);
        }     
       return  y_hat;
    }
}
