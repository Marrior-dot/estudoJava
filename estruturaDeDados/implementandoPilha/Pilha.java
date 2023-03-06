public class Pilha {
    private No refEntrada;

    public Pilha(No ref){
        if(ref != null){
            this.refEntrada = ref;
            return;
        }
        this.refEntrada = null;
        return;
    }

    public void push(No novoNo){
        //Guarda a referência do topo da pilha
        No refAuxiliar = refEntrada;

        //referência o topo da pilha para o novo elemento a ser inserido
        refEntrada = novoNo;

        //configura a o next da nova referência para o antigo topo
        refEntrada.setNo(refAuxiliar);

    }

    public No pop(){
        No refAux = refEntrada;
        refEntrada = refEntrada.getNo();
        
        return refAux;
    }

    public No top(){
        return this.refEntrada;
    }

    public boolean isEmpty(){
        return (this.refEntrada == null) ? true : false ; 
    }

    public void printPilha(){
        No refNew = refEntrada;
        do{
            if(refNew == null){
                System.out.println("Fim da pilha");
                return;
            }
            //%s funciona para tipos genéricos pois todos os tipos possuem um toString()
            System.out.printf("Dado: %d \n No: %s\n", refNew.getDado(), refNew);
            refNew = refNew.getNo();
        }while(refEntrada.getNo()!= null);

    }


}
