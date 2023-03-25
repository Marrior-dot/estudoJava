import java.util.Optional;

public class App {
    public static void main(String[] args){
        Optional<String> optionalStr = Optional.of("Valor do presente");
        System.out.println("Valor Opcional");

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Não valor opcional");

        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Não valor opcional");

        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));

    }
}
