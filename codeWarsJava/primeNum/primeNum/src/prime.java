import java.lang.Math;

public class prime {
    private int num;

    public prime(int num){
        this.num = num;
    }

    public boolean isPrime(){
        if(num <= 1){
            return false;
        }
        else{
        if(num%2 == 0){
            return false;
        }
        else if(num%3 == 0){
            return false;
        }
        else{
            for (int i = 5; i < (int) Math.sqrt(num); i++) {
                System.out.println("aqui dentro");
                if(num%i == 0 || num%(i+2) == 0){
                    return false;
                }
            }
           }
        }
        /*
        if( num == 0 || num == 1 || num == -1 ){
            return false;
        }

            for (int i = 2; i <= num/2; i++){
                if(num%i == 0){
                    System.out.println("hi");
                    return false;
                }
            }
         */
        return true;
    }
}
