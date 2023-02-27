public class No {
/* 
*O no funciona como uma estrutura de dados que possui um referência ao dados em si
*e uma referência ao endereço de memória onde o próximo dado da estrutura está armazenado
*/
    private String conteudo;
    private No nextNo;


    public No(String conteudo){

        this.conteudo = conteudo;
        this.nextNo = null;

    }

    public String getConteudo(){
        return this.conteudo;
    }

    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

    public No getNextNo(){
        return this.nextNo;
    }

    public void setNextNo(No nextNo){
        this.nextNo = nextNo;
    }

    @Override
    public String toString(){
        return "Nó { " + "Conteudo= " + this.conteudo + "/" + "}"; 
    }
}
