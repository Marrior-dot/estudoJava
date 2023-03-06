public class No{
    private Object object;
    private No nextNo;

    public No(Object newObj){
        this.object = newObj;
        this.nextNo = null;
    }

    public No getNextNo(){
        return this.nextNo;
    }

    public Object getObj(){
        return this.object;
    }

    public void setObj(Object newObj){
        this.object = newObj;
    }

    public void setNextNo(No nextNo){
        this.nextNo = nextNo;
    }
}