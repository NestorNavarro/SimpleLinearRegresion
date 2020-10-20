
public class Main {
    
    public static void main(String[] args) {
        DataSet dataSet = new DataSet();   
        SLR slr = new SLR(dataSet, args);
  
        System.out.println("Beta0 = " + slr.getBeta_0());
        System.out.println("Beta1 = " + slr.getBeta_1());
        
        System.out.println("\n\tTable");
        for(int i = 0;i < slr.getN();i++){
           System.out.println("Y Hat["+i+"] | " + slr.buildLRS()[i]); 
        }           
    } 
}
