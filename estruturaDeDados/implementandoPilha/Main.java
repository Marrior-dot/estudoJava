public class Main{
    public static void main(String args[]) {
        No fim = new No();
        No meio = new No();
        No topo = new No();
        Pilha pile = null;

        fim.setDado(2);
        fim.setNo(null);

        meio.setDado(3);
        meio.setNo(fim);


        pile = new Pilha(meio);
        pile.push(topo);

        pile.printPilha();
        
    }
}