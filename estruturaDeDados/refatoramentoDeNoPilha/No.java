//Usaremos a convenção <T> para atribuirmos um tipo genérico para o conteúdo do nosso no
//O tipo genérico é sempre declarado da seguinte forma

public class No<T> {
/* 
*O no funciona como uma estrutura de dados que possui um referência ao dados em si
*e uma referência ao endereço de memória onde o próximo dado da estrutura está armazenado
*/
    private T conteudo;
    private No nextNo;


    public No(T conteudo){

        this.conteudo = conteudo;
        this.nextNo = null;

    }

    public T getConteudo(){
        return this.conteudo;
    }

    public void setConteudo(T conteudo){
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
