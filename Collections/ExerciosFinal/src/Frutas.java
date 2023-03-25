import java.util.Comparator;

public class Frutas implements Comparable<Frutas>, Comparator<Frutas> {
    private String fruit;
    private int quantidade;
    
    public Frutas ( String fruit, int quantidade ){
        this.fruit = fruit;
        this.quantidade = quantidade;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruits(String fruit) {
        this.fruit = fruit;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Frutas other){
        return this.fruit.compareTo(other.getFruit());
    }

    @Override 
    public int compare(Frutas other1, Frutas other2){
        return other2.getQuantidade() - other1.getQuantidade();
    }

    
}
