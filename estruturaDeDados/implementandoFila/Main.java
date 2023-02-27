public class Main{
    public static void main(String args[]) {
        No first = new No("Primeiro Elemento");
        No secd = new No("Segundo Elemento");
        No terc = new No("Terceiro Elemento");
           
        Fila line = new Fila();
        line.enqueue(first);
        line.enqueue(secd);
        line.enqueue(terc);
        System.out.println(line.toString());

        line.dequeue();
        line.dequeue();
        System.out.println(line.toString());
    }
}