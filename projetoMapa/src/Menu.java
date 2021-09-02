public class Menu {
    public static void Menu(){        
        Cabecalho();
        System.out.print("MENU PRINCIPAL\n1 - CADASTRO DE PRODUTOS\n2 - MOVIMENTAÇÃO\n3 - REAJUSTE DE PREÇOS\n4 - RELATÓRIOS\n0 - FINALIZAR\nOPÇÃO: ");
    }
    public static void menuCadastroProduto(){
        Cabecalho();
        System.out.print("CADASTRO DE PRODUTOS\n1 - INCLUSÃO\n2 - ALTERAÇÃO\n3 - CONSULTA\n4 - EXCLUSÃO\n0 - RETORNAR\nOPÇÃO: ");
    }
    public static void menuMovimentacaoProduto(){
        Cabecalho();
        System.out.print("MOVIMENTAÇÃO\n1 - ENTRADA\n2 - SAIDA\n0 - RETORNAR\nOPÇÃO: ");
    }
    public static void Cabecalho(){
        System.out.println("=====================================================");
        System.out.println("EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA.");
        System.out.println("SISTEMA DE CONTROLE DE ESTOQUE");
        System.out.println("=====================================================");
    }
    public static void menuReajusteProduto(){
        Cabecalho();
        System.out.print("MOVIMENTAÇÃO\n1 - REAJUSTE MAIOR POR PRODUTO\n2 - REAJUSTE MENOR POR PRODUTO\n3 - REAJUSTE MAIOR TODOS PRODUTO\n4 - REAJUSTE MENOR TODOS PRODUTO\n0 - RETORNAR\nOPÇÃO: ");
    }
}
