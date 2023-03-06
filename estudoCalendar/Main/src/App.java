import java.util.Calendar;

public class App {
    public static void main(String[] args){
        Calendar now = Calendar.getInstance();
       // System.out.println(now);

       /*
        System.out.println("A data corrente é: " + now.getTime());
        
        now.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + now.getTime());
    
        now.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " +  now.getTime());

        System.out.println(now.getTime());
         */
        Calendar otherNow = Calendar.getInstance();
        System.out.print("Compra feita na data: " + otherNow.getTime() +
         "%nApós 10 dias, juros serão adicionados, caso o final do prazo caia em um fim de semana será possível pagar na segunda-feira\n");

        otherNow.add(Calendar.DATE, 10);
        String otherNowString = "";

        for (int i = 0; i <= 2; i++) {
            otherNowString += otherNow.getTime().toString().charAt(i);
        }

        if(otherNowString == "Sun" || otherNowString == "Sat"){
            System.out.println("Pague na próxima segunda-feira ou você receberá juros");
        }
        else{
            System.out.println("Pague hoje ou você receberá juros");
        }

        /*System.out.println(otherNow.getTime().toString());

        for (int i = 0; i <= 2; i++) {
            System.out.print(otherNowWeek.charAt(i));
        }
*/

        
    }
}
