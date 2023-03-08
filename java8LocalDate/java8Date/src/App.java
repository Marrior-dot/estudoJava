import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate hoje = LocalDate.now();
        //System.out.println(hoje);

        LocalDate ontem = hoje.minusDays(1);
        //System.out.println(ontem);

        LocalTime agora = LocalTime.now();
        //System.out.println(agora);

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime tmrw = today.minusYears(9).plusDays(247).plusHours(13);
        System.out.println(tmrw);

    }


}
