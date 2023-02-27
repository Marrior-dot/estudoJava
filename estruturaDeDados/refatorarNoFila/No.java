public class No{
    private Object obj;
    private No nextNo;

    public No(Object newObj){
        this.obj = newObj;
        this.nextNo = null;
    }

    public Object getObj(){
        return this.obj;
    }

    public void setObj(Object obj){
        this.obj = obj;
    }

    public No getNextNo(){
        return this.nextNo;
    }

    public void setNextNo( No newNextNo ){
        this.nextNo = newNextNo;
    }
}