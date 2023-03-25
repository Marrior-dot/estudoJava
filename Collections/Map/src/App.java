import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


public class App{
    public static void main(String args[]) {
        Map<String, String> estados = new HashMap<>();
        estados.put("RJ","Rio de Janeiro");
        estados.put("SP","São Paulo");
        estados.put("PR","Paraná");
        estados.put("PA","Pará");
        estados.put("MG","Minas Gerais");
        estados.put("MS", "Mato Grosso do Sul");

        System.out.println(estados);
        estados.remove("MG");
        System.out.println(estados);
        estados.put("DF", "Brasilia");
        System.out.println(estados);
        System.out.println(estados.size());
        estados.remove("Mato Grosso do Sul");

        for (String sigla : estados.keySet()) {
            System.out.println(sigla + ":" + estados.get(sigla));
            
        }

/*
        System.out.println(Fifa.containsKey("Curitiba"));

        Fifa.remove("São Paulo");

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
        */
    }
     
}
