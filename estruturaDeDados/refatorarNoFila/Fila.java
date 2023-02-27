public class Fila{
    private No entradaFila;

    public Fila(){
        this.entradaFila = null;
    }

    public boolean isEmpty(){
        return entradaFila == null ? true : false;
    }

    //Declaração do primeiro objeto nó imbutida no enfileirar
    public void enqueue(Object obj2){
    //Declarando o novoNo dentro do método e passando um objeto genérico como parâmetro
        No novoNo = new No(obj2);
        novoNo.setNextNo(entradaFila);
        this.entradaFila = novoNo;
    }

    public No dequeue(){
        No firstNode = entradaFila;
        No auxNode = entradaFila;
        if(this.isEmpty() == false){
            while(true){
                if(firstNode.getNextNo() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getNextNo();
                }
                else{
                    auxNode.setNextNo(null);
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    public No first(){
        No firstNode = entradaFila;
        if(this.isEmpty() == false){
            while(true){
                if(firstNode.getNextNo() != null){
                    firstNode = firstNode.getNextNo();
                }
                else{
                    break;
                }
            }
            return firstNode;
        }
        return null;
    }

    @Override
    public String toString(){
        String strRetorno="";
        No nodes = entradaFila;

        if(this.entradaFila != null){
            while(true){
                strRetorno += nodes.getObj();
                strRetorno += ", ";
                nodes = nodes.getNextNo();
                if(nodes.getNextNo() == null){
                    strRetorno += nodes.getObj();
                    break;
                }
            }
        }

        return strRetorno;
    }


}