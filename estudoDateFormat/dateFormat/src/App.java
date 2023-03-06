import java.util.Date;
import java.time.LocalDate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        //Formatando usando Date
        Date now = new Date();

        String dateToStr = DateFormat.getInstance().format(now);

        //System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(now);
       // System.out.println(dateToStr);

        //Formatando usando SimpleDateFormat

        Date now2 = new Date();

        SimpleDateFormat formatedDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS:MMMMM");
        String strDate = formatedDate.format(now2);

        //System.out.println(strDate);

        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
}
