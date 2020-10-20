public class DataSet {
    private int [] x;
    private int [] y;
    public DataSet(){
        
    }
    public int[] getDataSet_Y(){
        
        y = new int[]{31,29,34,35,29,30,30,38,34,33,29,26};
        //y = new int[]{651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};
        return y;
    }
    public int[] getDataSet_X(){
        x = new int[]{36,28,35,39,30,30,31,38,36,38,29,26};
        //x = new int[]{23, 26,30, 34, 43, 48, 52, 57, 58};
        return x;
    }
    //args DATASET1 36 28 35 39 30 30 31 38 36 38 29 26
    //args DATASET2 23 26 30 34 43 48 52 57 58 
}
