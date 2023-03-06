//import OpcoesMenus;

public class TesterEnum {
    public static void escolheOpcao(OpcoesMenus opcao){
        if(opcao == OpcoesMenus.SALVAR){
            System.out.println("Opção salvar escolhida");
        }
        else if(opcao == OpcoesMenus.IMPRIMIR){
            System.out.println("Imprimir arquivo");
        }
    }
}
