import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class Eureka {
    private long digitA;
    private long digitB;

    public Eureka(long digitA, long digitB){
        this.digitA = digitA;
        this.digitB = digitB;
    }

    public List<Long> sumDigitPow(){

        List<Long> arrayOfDigits = new ArrayList<Long>();

        for (long i = digitA; i < digitB; i++) {
            long numToSum=0;
            String iStr = Long.toString(i);
            char[] iStrCh = iStr.toCharArray();
            
            for(int j = 0; j < iStrCh.length; j++){
                numToSum += Math.pow((Long.valueOf(iStrCh[j])-48),j+1);
                System.out.println(numToSum);
            } 
            
            if(i == numToSum){
                //System.out.println(numToSum);
                arrayOfDigits.add(i);  
            }
        }

        return arrayOfDigits;
    }
}
