public enum OpcoesMenus {
    SALVAR(1), IMPRIMIR(2), ABRIR(3), VISUALIZAR(4), FECHAR(5);

    private final int valor;

    OpcoesMenus(int valOpt){
        this.valor = valOpt;
    }

    public int getValor(){
        return valor;
    }
}
