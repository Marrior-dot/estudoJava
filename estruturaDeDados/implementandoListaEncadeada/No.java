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

    @Override
    public String toString(){
        return "No{"+
                "conteudo" + object + "}" ;   
            }
    
    public String toStringEncadeado(){
        String str = "No{"+
        "conteudo" + object + "}" ;

        if(object != null){
            str += "->" + nextNo.toString();
        }else{
            str += "-> null";
        }

        return str;
    }
}