import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main{
    public static void main(String args[]) {
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(5.2);
        notasAlunos.add(6.2);
        notasAlunos.add(7.2);
        notasAlunos.add(8.2);

        System.out.println(notasAlunos);
        notasAlunos.remove(5.2);
        System.out.println(notasAlunos);
        System.out.println(notasAlunos.size());

        Iterator<Double> setIterator =  notasAlunos.iterator();

        while (setIterator.hasNext()){
            System.out.println(setIterator.next());
        }

        for(Double notas: notasAlunos){
            System.out.println(notas);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());
    }
}