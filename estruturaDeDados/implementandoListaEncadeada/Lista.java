public class Lista{

    No firstItem;

    public Lista(){
        this.firstItem = null;
    }

    public void checkList(){
        No auxItem = firstItem;
        while(auxItem.getNextNo() != null){
            System.out.println(auxItem.getObj() + "\n");
            auxItem = auxItem.getNextNo();
        }

    }

    public void add(Object newItem, int pos){
        No novoNo = new No(newItem);
        No auxNo = firstItem;
        No copyNo = null;
        int counter=0;

        while(counter < pos){
            copyNo = auxNo;
            auxNo = auxNo.getNextNo();
            counter++;
        }

        if(auxNo.getNextNo() != null){
            copyNo.setNextNo(novoNo);
            novoNo.setNextNo(auxNo);
            return;
        }

        copyNo.setNextNo(novoNo);
        novoNo.setNextNo(null);
        return;
    }

    
}