public class Relatorio {
    Produto p;

    public Relatorio(Produto p) {
        this.p = p;
    }
    
    public String imprimir(){
        String resp = "";
        
       resp = "Nome do Produto: "+p.getNome() + "\nPreço Unitário: "+p.getPrecoUnitario() + "\nUnidade: "+p.getUnidade()+"\nEstoque Atual: "+p.getQtdEstoque();
        return resp;
    }
    public String relatorio(){
        String resp = "";
        
       resp = "Nome do Produto: "+p.getNome() + "\nPreço Unitário: "+p.getPrecoUnitario() + "\nUnidade: "+p.getUnidade()+"\nEstoque Atual: "+p.getQtdEstoque()+"\nValor Total em Estoque: R$ "+(p.getQtdEstoque() * p.getPrecoUnitario() );
        return resp;
    }
}
