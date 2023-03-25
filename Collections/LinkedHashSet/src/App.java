import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class App{
    public static void main(String args[]) {
        Set<Integer> notasAlunos = new LinkedHashSet<>();
        notasAlunos.add(5);
        notasAlunos.add(6);
        notasAlunos.add(7);
        notasAlunos.add(8);

        System.out.println(notasAlunos);
        notasAlunos.remove(5);
        System.out.println(notasAlunos);
        System.out.println(notasAlunos.size());

        Iterator<Integer> setIterator =  notasAlunos.iterator();

        while (setIterator.hasNext()){
            System.out.println(setIterator.next());
        }

        for(Integer notas: notasAlunos){
            System.out.println(notas);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());
    }
}