import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public static void main(String[] args){
        ArrayList<Frutas> listaDeFrutas = new ArrayList<>();

        listaDeFrutas.add(new Frutas("Maçã"));
        listaDeFrutas.add(new Frutas("Pera"));
        listaDeFrutas.add(new Frutas("Banana"));

        listaDeFrutas.sort((Frutas item1, Frutas item2) -> item1.getFruit().compareTo(item2.getFruit()) );
    }
}
