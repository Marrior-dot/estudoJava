public class No {
    private int dado;
    private No next;

    public No(){}

    public int getDado(){
        return this.dado;
    }

    public void setDado(int newDado){
        this.dado = newDado;
    }

    public No getNo(){
        return this.next;
    }

    public void setNo(No newNext){
        this.next = newNext;
    }

    @Override
    public String toString(){
        return "No{"+"dado=" + dado + "}";
    }


}
