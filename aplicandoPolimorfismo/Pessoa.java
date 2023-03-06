import javax.management.RuntimeErrorException;

public class Pessoa{

    //Uma boa prática para determinar o tamanho de Strings
    // é deixar o seu tamanho como constante assim como declarar
    // um nome de variável de maneira coesa

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TipoPessoa {Fisica, Juridica}

    public int codigo;
    public String nome;
    private String documento;
    public TipoPessoa tipo;

    public String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento){
        if (documento == null || documento.isEmpty()){
            throw new RuntimeException("Documento não pode ser Nulo ou vazio");
        }
        if (documento.length() == TAMANHO_CPF){
            tipo = TipoPessoa.Fisica;
        }
        else if(documento.length() == TAMANHO_CNPJ){
            tipo = TipoPessoa.Juridica;
        }
        else{
            throw new RuntimeException("Documento invalido para pessoas sem CNPJ");
        }
        this.documento = documento;

    }
}