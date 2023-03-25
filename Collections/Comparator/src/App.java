import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class App {
    public static void main(String[] args)  {
        List<Estudante> students = new ArrayList<>();

        students.add(new Estudante("Juan",21));
        students.add(new Estudante("Iasmin",22));
        students.add(new Estudante("Belle",21));

        System.out.println(students);

        students.sort((first,second) -> second.getIdade() - first.getIdade());

        System.out.println(students);

        students.sort(Comparator.comparingInt(Estudante :: getIdade));
        System.out.println(students);

        //Collection.sort(students);
        System.out.println(students);

    }
}
