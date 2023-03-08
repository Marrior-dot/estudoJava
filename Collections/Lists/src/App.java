import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Mário");
        nomes.add("Pedro");
        nomes.add("Juliana");

        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(2,"Jerson");
        System.out.println(nomes);

        for(String name: nomes){
            System.out.println(name);
        }

        Iterator<String> nomesIter = nomes.iterator();
        while(nomesIter.hasNext()){
            System.out.println("Nome: " + nomesIter.next());
        }

        nomes.clear();
        System.out.println(nomes);
    }
}
