import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        //Exemplos menos específicos
        //Lista que aceita um conjunto de listas, portanto com o método add podemos adiconar várias listas com objetos de diversos tipos
        List<List> salasDeAula = new ArrayList<>();
        List<Aluno> alunosNaSala = new ArrayList<>();

        Aluno sara = new Aluno("Sara");
        Aluno logan = new Aluno("Logan");
        Aluno ronald = new Aluno("Ronald");

        alunosNaSala.add(sara);
        alunosNaSala.add(logan);
        alunosNaSala.add(ronald);

        salasDeAula.add(alunosNaSala);

        ;
        //Exemplos mais restrito
        //Lista q compreende as listas que somente podem possuir objetos do tipo Aluno
        //Usaremos um erro para demonstrar que somente um tipo pode ser aceito dentro da lista
        //novaSalaDeAula
        List<List<Aluno>> novaSalaDeAula = new ArrayList<>();
        List<Integer> listaInteiros = new ArrayList<>();
        List<List> listaAleatoria = new ArrayList<>();

        System.out.println(alunosNaSala.getClass().getName());
        System.out.println(alunosNaSala.getClass().getModifiers());
        System.out.println(sara.getClass().getTypeName());

        listaAleatoria.add(listaInteiros);
        listaAleatoria.add(alunosNaSala);

        System.out.println(listaAleatoria);


        for (int i = 0; i < listaAleatoria.size(); i++) {
            System.out.println(listaAleatoria.get(i));
            for(int j = 0; j < listaAleatoria.get(i).size(); j++){
                if(listaAleatoria.get(i).get(j).getClass().getTypeName() != "Aluno" ){
                    i++;
                    //novaSalaDeAula.add(listaAleatoria.get(i));
                    //System.out.println(listaAleatoria.get(i).get(j));
                }
                else{
                    novaSalaDeAula.add(listaAleatoria.get(i));
                }
            }
        }
        System.out.println(novaSalaDeAula);
    }
}