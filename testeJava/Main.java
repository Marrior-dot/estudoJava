//Orientação a objetos, estudos de Acoplamento, polimorfismo, herança e mais


public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Iasmyn");

        gerente.setSenha(5000);
    }
}

class Funcionario {
    
    protected String nome;
    protected String cpf;
    protected double salario;

    protected void setNome(String nome){
        this.nome = nome;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    } //Método que será reescrito(sofrerá Override) na classe Gerente
}

//existem outros tipos de funcionários, portanto os dados nome, cpf e salario
//serão herdados por outras classes

class Gerente extends Funcionario{
    protected int senha;
    protected int numeroDeFuncionariosGerenciados;

    protected void setSenha(int passW){
        this.senha = passW;
    }
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    @Override
    // classe reescrita(Override),
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }
}

//Obs: em atributos protected, esses estão restritos de serem acessados somente de maneira global
//porém podem ser acessados pelas subclasses, pacote como um todo e pela prórpia classe
//já atributos private, somente podem ser acessados pela classe que os criou

