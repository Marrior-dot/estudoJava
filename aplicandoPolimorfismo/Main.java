public class Main{
    public static void main(String args[]){
        //Dados do endereco
        Endereco endereco = new Endereco(); 
        //Dados do Cliente
        Cliente cliente = new Cliente();

        //endereco.cep = "000000000";

        //Tratamento de erros, para casos conhecidos de erros
        //Usar a estrutura try_catch para dar msgs mais claras e que melhorem a solução do dado erroc
        try {
            cliente.addEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso");
        } catch (Exception e) {
            System.err.println("Erro: Endereço não adicionado");    
        }

    }
}