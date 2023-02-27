public class Main{
    
    public static void main(String args[]){
        //tipos primitivos copia o valor da memória
        //objetos copiam o valor da referência da memória

        int intA = 1;
        int intB = intA;

        System.out.println("intA=" + intA + " intB=" + intB);
        intA++;
        System.out.println("intA=" + intA + " intB=" + intB);
        /*
         * No primeiro print ambos serão iguais
         * No segundo ambos serão diferentes pois o comportamento 
         * da variável intB n é definido posteriormente
         * portanto guarda o último valor da memória ao qual foi atribuído
         */

         novoObj objA = new novoObj(1);
         novoObj objB = objA;

         System.out.println("objA=" + objA + " objB=" + objB);
         objA.setNum(23);
         System.out.println("objA=" + objA.getNum() + " objB=" + objB.getNum());

         /*
          *No primeiro print ambos objetos terão o valor de um 
          *No segundo print ambos terão o valor de 2, isso acontece
          *pois quando igualamos 2 objetos de msm tipo de classe, temos um igualdade a nível de endereço 
          *de memória, portanto o valor da variável B é definido de acordo com o comportamento da linha 24
          */



    }

}