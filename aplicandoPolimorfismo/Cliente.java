//import Endereco;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    //Com extends as classes agr podem ter multiplas de outras classes
    protected Pessoa pessoa = new Pessoa();
    public int codigo;
    public String nome;
    public String cpf;
    
    private List<Endereco> enderecos;
    /*Obs: o tipo genérico List possui tipos mais específicos como ArrayList, o qual pe mais vantajoso de usar ao invés do tipo primitivo array
     * Possui métodos que facilitam o uso
     * deixa o código mais limpo
     * sem necessídade de criar métodos para operações básicas, como adicionar elementos
    */

    /*Uso do private faz jus à boa prática de encapsulamento
    impedindo que o dado seja acessado de maneira muito direta por meio de outras classes
    somente tendo o acesso por meio da própria classe em que se encontra*/

    public void addEndereco(Endereco endereco){
        if (endereco == null) {
            //tratamento de erro sob condição
            throw new NullPointerException("Endereço não pode ser nulo");    
        }
        if(endereco.cep == null){
            throw new NullPointerException("CEP não pode ser nulo");    
        }
        //enderecos.add(endereco);
        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos(){

        if(enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        } 

        return enderecos;
    }
}
