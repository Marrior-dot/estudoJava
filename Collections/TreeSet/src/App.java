import java.util.TreeSet;
import java.util.Iterator;


public class App{
    public static void main(String args[]) {
        TreeSet<String> treeCapitais = new TreeSet<>();
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Belém");

        System.out.println(treeCapitais);
        treeCapitais.remove("Belém");
        System.out.println(treeCapitais);
        System.out.println(treeCapitais.size());

        System.out.println(treeCapitais.first());

        System.out.println(treeCapitais.last());

        //elemento antes do parâmetro
        System.out.println(treeCapitais.lower("São Paulo"));

        //elemento depois do parâmetro
        System.out.println(treeCapitais.higher("São Paulo"));

        //Retorna o último parâmetro e retira do treeSet
        System.out.println(treeCapitais.pollLast());

        //Retorna o primeiro parâmetro e retira do treeSet
        System.out.println(treeCapitais.pollFirst());

        System.out.println(treeCapitais);
        

        Iterator<String> setIterator =  treeCapitais.iterator();

        while (setIterator.hasNext()){
            System.out.println(setIterator.next());
        }

        for(String capitais: treeCapitais){
            System.out.println(capitais);
        }

        treeCapitais.clear();

        System.out.println(treeCapitais.isEmpty());
    }
}
