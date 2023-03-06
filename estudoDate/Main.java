import java.util.Date;
import java.time.Instant;

public class Main{
    public static void main(String args[]) {
        //a instância captura o millisegundo 
        //mais próximo do tempo q foi instanciado
        Date firstConstruct = new Date();
        //System.out.println(firstConstruct);

        // Espera que vc dê a data com limite de inicio
        // no epoch(00:00:00 de 1 de janeiro de 1970)

        //isAfter e isBefore
        /*
        Long currentMillis = System.currentTimeMillis();

        Date novaData = new Date(currentMillis);
        System.out.println(novaData);

        Date dataPassado = new Date(12414124);

        Date dataFuturo = new Date(13414124);

        boolean isAfter = dataPassado.after(dataFuturo);
        System.out.println(isAfter);

        boolean isBefore = dataPassado.before(dataFuturo);
        System.out.println(isBefore);
        */

        //CompareTo
        /*
        Date dataPassado = new Date(12414124);

        Date dataFuturo = new Date(13414124);

        Date msmDateFuturo = new Date(13414124);

        boolean isEquals = dataFuturo.equals(msmDateFuturo);
        
        System.out.println(isEquals);

        int compareCase1 = dataPassado.compareTo(dataFuturo);
        int compareCase2 = dataFuturo.compareTo(dataPassado);
        int compareCase3 = dataFuturo.compareTo(msmDateFuturo);

        System.out.println(compareCase1);
        System.out.println(compareCase2);
        System.out.println(compareCase3);
         */

         Date dataInicio = new Date(152311);
         System.out.println(dataInicio.toString().getClass());

         Instant instant = dataInicio.toInstant();
         //System.out.println(instant);
/* 
         Date myBirth = new Date(31536);

         Date dateOfDestiny = new Date(126144);

         System.out.println(myBirth.before(dateOfDestiny));
         */
    }
}