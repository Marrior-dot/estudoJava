public class App {
    public static void main(String[] args)  {
        try{
            new java.io.FileInputStream("arquivo.txt");
        } catch( java.io.FileNotFoundException e ){
            System.out.println("Erro");
        }
    }
}
