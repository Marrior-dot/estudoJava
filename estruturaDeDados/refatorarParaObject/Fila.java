//Introdução de tipo genérico <T>
public class Fila<T>{
    private No entradaFila;

    public Fila(){
        this.entradaFila = null;
    }

    public boolean isEmpty(){
        return entradaFila == null ? true : false;
    }

    public void enqueue(T obj2){
        No novoNo = new No(obj2);
        novoNo.setNextNo(entradaFila);
        this.entradaFila = novoNo;
    }

    public T dequeue(){
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
            return (T)firstNode.getObj();
        }
        return null;
    }

    public T first(){
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
            return (T)firstNode.getObj();
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