import java.util.LinkedList;
import java.util.Queue;;

public class App {
    public static void main(String[] args){
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Juliana");

        System.out.println(filaBanco);

        String clienteAtendido = filaBanco.poll();
        
        System.out.println(clienteAtendido);

        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        //filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroClienteOuErro);


    }
}
