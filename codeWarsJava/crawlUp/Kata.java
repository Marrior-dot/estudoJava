import java.util.Scanner;

public class Kata {

    Scanner input = new Scanner(System.in);

    int col;
    int d;
    int n;
  
    public Kata(int col, int d, int n){
        
      while( (d<0) || (n<0)){
        if(d < 0){
            System.out.println("Por favor, escolha um valor de d que seja maior que 0");
            d = input.nextInt();
        }
        if(n < 0){
            System.out.println("Por favor, escolha um valor de n que seja maior que 0");
            n = input.nextInt();
        }
      }

      while(d < n){
        System.out.printf("Por favor escolha um valor de d que seja maior que %d", n);
        d = input.nextInt();
      }
/*
      while(col < (d+n)){
        System.out.printf("Por vafor escolha um valor de col que seja maior que %d", (d+n));
        col = input.nextInt();
      }
*/    
      this.col = col;
      this.d = d;
      this.n = n;
    }
    public int snail() {
        int dayCounter=0;
        while(this.col > 0){
            dayCounter++;
            this.col -= this.d;
            if(this.col <= 0){
                break;
            }
            this.col += this.n;
            //System.out.println(dayCounter);
        }
        return dayCounter;
      }
  }