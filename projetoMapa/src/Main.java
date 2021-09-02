import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner LerTexto = new Scanner(System.in);
        Scanner LerValor = new Scanner(System.in);
        Scanner LerInteiro = new Scanner(System.in);
        int op = 0;
        
        List<Produto> listaProdutos = new ArrayList<Produto>();
        Produto produto;
        ProdutoControle prodControle;
        Menu menu = new Menu();
        do{
            menu.Menu();
            op = ler.nextInt();
            switch(op){
                case 1:                    
                    do{
                        menu.menuCadastroProduto();
                        op = ler.nextInt();
                        menu.Cabecalho();
                        switch(op){                            
                            case 1:
                                int aux;
                                String resp = "";
                                prodControle = new ProdutoControle();
                                do{
                                    produto = new Produto();
                                    
                                    
                                    System.out.println("INCLUSÃO DE PRODUTO");
                                    do{
                                        System.out.print("NOME: ");
                                        produto.setNome(LerTexto.nextLine());
                                        aux = prodControle.verificarNomeProduto(listaProdutos, produto.getNome());
                                        if(aux == 1){
                                            System.out.println("Produto com esse nome já Cadastrado");
                                        }
                                    }while(aux != 0 );

                                    do{
                                        System.out.print("PREÇO: ");
                                        produto.setPrecoUnitario(LerValor.nextDouble());
                                        if(produto.getPrecoUnitario() <= 0){
                                            System.out.println("Valor Invalido, informe valor maior que zero");
                                        }
                                    }while(produto.getPrecoUnitario() <= 0);
                                    System.out.print("UNIDADE: ");
                                    produto.setUnidade(LerTexto.nextLine());
                                    do{
                                        System.out.print("QUANTIDADE: ");
                                        produto.setQtdEstoque(LerInteiro.nextInt());
                                        if(produto.getQtdEstoque() < 0){
                                            System.out.println("Valor Invalido, informe valor maior ou igual a zero");
                                        }
                                    }while(produto.getQtdEstoque() < 0);

                                    System.out.println("CONFIRMA INCLUSÃO (S/N)?");
                                    resp = LerTexto.nextLine();
                                    if(resp.equals("S") || resp.equals("s")){
                                        System.out.println("CADASTRO CONFIRMADO");
                                        listaProdutos.add(produto);
                                    }else{
                                        System.out.println("CADASTRO NÃO CONFIRMADO");
                                    }
                                    System.out.println("REPETIR OPERAÇÃO (S/N)?");
                                    resp = LerTexto.nextLine();
                                    if(resp.equals("S") || resp.equals("s")){
                                        aux = 1;
                                    }else{
                                        aux = 0;
                                    }
                                }while(aux != 0);
                                
                                
                            break;
                            case 2:
                                System.out.println("ALTERAÇÃO DE PRODUTO");
                                aux = 0;
                                prodControle = new ProdutoControle();
                                do{
                                    produto = new Produto();
                                    System.out.print("INFORME O NOME DO PRODUTO PARA ALTERAR: ");
                                    produto.setNome(LerTexto.nextLine());
                                    aux = prodControle.verificarNomeProduto(listaProdutos, produto.getNome());
                                    if(aux == 1){
                                        int codProduto = 0;
                                        System.out.println("Produto Existente");
                                        codProduto = prodControle.exibirPorPorduto(listaProdutos, produto.getNome());
                                        
                                        do{
                                            System.out.print("INFORME O NOVO PREÇO: ");
                                            produto.setPrecoUnitario(LerValor.nextDouble());
                                            if(produto.getPrecoUnitario() <= 0){
                                                System.out.println("Valor Invalido, informe valor maior que zero");
                                            }
                                        }while(produto.getPrecoUnitario() <= 0);
                                        System.out.print("INFORME A NOVA UNIDADE: ");
                                        produto.setUnidade(LerTexto.nextLine());
                                        do{
                                            System.out.print("INFORME A NOVA QUANTIDADE: ");
                                            produto.setQtdEstoque(LerInteiro.nextInt());
                                            if(produto.getQtdEstoque() < 0){
                                                System.out.println("Valor Invalido, informe valor maior ou igual a zero");
                                            }
                                        }while(produto.getQtdEstoque() < 0);
                                        System.out.println("CONFIRMA INCLUSÃO (S/N)?");
                                        resp = LerTexto.nextLine();
                                        if(resp.equals("S") || resp.equals("s")){
                                            System.out.println("ALTERAÇÃO CONFIRMADO");
                                            listaProdutos.set(codProduto ,produto);
                                        }else{
                                            System.out.println("ALTERAÇÃO NÃO CONFIRMADO");
                                        }
                                       
                                        
                                    }else{
                                        System.out.println("Produto não Existente");
                                    }
                                    System.out.println("REPETIR OPERAÇÃO (S/N)?");
                                    resp = LerTexto.nextLine();
                                    if(resp.equals("S") || resp.equals("s")){
                                        aux = 1;
                                    }else{
                                        aux = 0;
                                    }
                                    
                                }while(aux != 0);
                            break;
                            case 3:
                                prodControle = new ProdutoControle();
                                System.out.println("CONSULTA DE PRODUTO");
                                produto = new Produto();
                                System.out.print("INFORME O NOME DO PRODUTO PARA CONSULTA: ");
                                produto.setNome(LerTexto.nextLine());
                                aux = prodControle.verificarNomeProduto(listaProdutos, produto.getNome());
                                if(aux == 1){
                                    prodControle.consultaPorPorduto(listaProdutos, produto.getNome());
                                }else{
                                   System.out.println("Produto não Existente");
                                }
                            break;
                            case 4:
                                prodControle = new ProdutoControle();
                                System.out.println("EXCLUSÃO DE PRODUTO");
                                produto = new Produto();
                                System.out.print("INFORME O NOME DO PRODUTO PARA EXCLUSÃO: ");
                                produto.setNome(LerTexto.nextLine());
                                aux = prodControle.verificarNomeProduto(listaProdutos, produto.getNome());
                                if(aux == 1){
                                    int codProduto = 0;
                                    System.out.println("Produto Existente");
                                    codProduto = prodControle.exibirPorPorduto(listaProdutos, produto.getNome());
                                    System.out.println("CONFIRMA EXCLUSÃO (S/N)?");
                                    resp = LerTexto.nextLine();
                                    if(resp.equals("S") || resp.equals("s")){
                                       System.out.println("EXCLUSÃO CONFIRMADO");
                                       listaProdutos.remove(codProduto);
                                    }else{
                                       System.out.println("EXCLUSÃO NÃO CONFIRMADO");
                                    }
                                }else{
                                   System.out.println("PRODUTO NÃO CADASTRADO");
                                }
                            break;
                            case 0:
                                System.out.println("Retorno para Menu Principal");
                            break;
                            
                            default:
                                System.out.println("\nOpção Inválida");
                            break;
                            
                        }
                        
                    }while(op != 0);
                    
                    op = 1;
                break;
                case 2:
                    int aux;
                    String resp = "";
                    do{
                        produto = new Produto();
                        menu.menuMovimentacaoProduto();
                        op = ler.nextInt();
                        menu.Cabecalho();
                        switch(op){
                            case 1:
                                prodControle = new ProdutoControle();
                                System.out.println("ENTRADA DE PRODUTO");
                                produto = new Produto();
                                System.out.print("INFORME O NOME DO PRODUTO: ");
                                produto.setNome(LerTexto.nextLine());
                                aux = prodControle.verificarNomeProduto(listaProdutos, produto.getNome());
                                if(aux == 1){
                                    int codProduto = 0;
                                    System.out.println("Produto Existente");
                                    codProduto = prodControle.exibirPorPorduto(listaProdutos, produto.getNome());
                                    
                                    do{
                                        System.out.print("QUANTIDADE DE ENTRADA: ");
                                        produto.setQtdEstoque(LerInteiro.nextInt());
                                        if(produto.getQtdEstoque() < 0){
                                            System.out.println("Valor Invalido, informe valor maior ou igual a zero");
                                        }
                                    }while(produto.getQtdEstoque() < 0);
                                    produto.setQtdEstoque(produto.getQtdEstoque() + listaProdutos.get(codProduto).getQtdEstoque());
                                    produto.setPrecoUnitario(listaProdutos.get(codProduto).getPrecoUnitario());
                                    produto.setUnidade(listaProdutos.get(codProduto).getUnidade());
                                    
                                    System.out.println("CONFIRMA ENTRADA (S/N)?");
                                    resp = LerTexto.nextLine();
                                    if(resp.equals("S") || resp.equals("s")){
                                       System.out.println("ENTRADA CONFIRMADO");
                                       listaProdutos.set(codProduto, produto);
                                    }else{
                                       System.out.println("ENTRADA NÃO CONFIRMADO");
                                    }
                                }else{
                                   System.out.println("PRODUTO NÃO CADASTRADO");
                                }
                                
                            break;
                            case 2:
                                prodControle = new ProdutoControle();
                                System.out.println("SAÍDA DE PRODUTO");
                                produto = new Produto();
                                System.out.print("INFORME O NOME DO PRODUTO: ");
                                produto.setNome(LerTexto.nextLine());
                                aux = prodControle.verificarNomeProduto(listaProdutos, produto.getNome());
                                if(aux == 1){
                                   int codProduto = 0;
                                   System.out.println("Produto Existente");
                                   codProduto = prodControle.exibirPorPorduto(listaProdutos, produto.getNome());                                    
                                   do{
                                       System.out.print("QUANTIDADE DE SAÍDA: ");
                                       produto.setQtdEstoque(LerInteiro.nextInt());
                                       if(produto.getQtdEstoque() <= 0 || produto.getQtdEstoque() > listaProdutos.get(codProduto).getQtdEstoque()){
                                         System.out.println("Valor Invalido, informe um valor maior que zero ou menor igual a quantidade existente");
                                       }
                                   }while(produto.getQtdEstoque() <= 0 || produto.getQtdEstoque() > listaProdutos.get(codProduto).getQtdEstoque());
                                   System.out.println("CONFIRMA SAÍDA (S/N)?");
                                   resp = LerTexto.nextLine();
                                   if(resp.equals("S") || resp.equals("s")){
                                     System.out.println("SAÍDA CONFIRMADO");
                                     produto.setQtdEstoque(listaProdutos.get(codProduto).getQtdEstoque() - produto.getQtdEstoque());
                                     produto.setPrecoUnitario(listaProdutos.get(codProduto).getPrecoUnitario());
                                     produto.setUnidade(listaProdutos.get(codProduto).getUnidade());
                                     listaProdutos.set(codProduto, produto);
                                   }else{
                                     System.out.println("SAÍDA NÃO CONFIRMADO");
                                   }
                                   
                                   
                                }else{
                                   System.out.println("PRODUTO NÃO CADASTRADO");
                                }
                                
                            break;
                            case 0:
                                System.out.println("Retorno para Menu Principal");
                            break;
                            
                            default:
                                System.out.println("\nOpção Inválida");
                            break;
                            
                        }
                    }while(op != 0);
                    op = 2;
                break;
                case 3:
                    aux = 0;
                    resp = "";
                    double percentual = 0, novoPreco = 0;
                    do{
                        produto = new Produto();
                        menu.menuReajusteProduto();
                        op = ler.nextInt();
                        menu.Cabecalho();
                        switch(op){
                            case 1:
                                prodControle = new ProdutoControle();
                                aux = 0;
                                resp = "";
                                System.out.println("REAJUSTE DE PREÇOS");
                                System.out.println("REAJUSTE MAIOR POR PRODUTO");
                                produto = new Produto();
                                System.out.print("INFORME O NOME DO PRODUTO: ");
                                produto.setNome(LerTexto.nextLine());
                                aux = prodControle.verificarNomeProduto(listaProdutos, produto.getNome());
                                if(aux == 1){
                                    int codProduto = 0;
                                    System.out.println("Produto Existente");
                                    codProduto = prodControle.exibirPorPorduto(listaProdutos, produto.getNome());    
                                    do{
                                        System.out.print("INFORME O NOVO PERCENTUAL REAJUSTE DE PREÇO: ");
                                        percentual = LerValor.nextDouble();
                                        
                                        if(percentual <= 0){
                                            System.out.println("Valor Invalido, informe valor maior que zero");
                                        }
                                    }while(percentual <= 0);  
                                    novoPreco = ((listaProdutos.get(codProduto).getPrecoUnitario() /100 ) * percentual ) + listaProdutos.get(codProduto).getPrecoUnitario();
                                    produto.setPrecoUnitario(novoPreco);
                                    produto.setQtdEstoque(listaProdutos.get(codProduto).getQtdEstoque());
                                    produto.setUnidade(listaProdutos.get(codProduto).getUnidade());

                                    System.out.println("CONFIRMA REAJUSTE (S/N)?");
                                    resp = LerTexto.nextLine();
                                    if(resp.equals("S") || resp.equals("s")){
                                        System.out.println("REAJUSTE CONFIRMADO");
                                        listaProdutos.set(codProduto, produto);
                                    }else{
                                        System.out.println("REAJUSTE NÃO CONFIRMADO");
                                    }

                                }else{
                                    System.out.println("PRODUTO NÃO CADASTRADO");
                                }
                                
                            break;
                            case 2:
                                prodControle = new ProdutoControle();
                                aux = 0;
                                resp = "";
                                System.out.println("REAJUSTE DE PREÇOS");
                                System.out.println("REAJUSTE MENOR POR PRODUTO");
                                produto = new Produto();
                                System.out.print("INFORME O NOME DO PRODUTO: ");
                                produto.setNome(LerTexto.nextLine());
                                aux = prodControle.verificarNomeProduto(listaProdutos, produto.getNome());
                                if(aux == 1){
                                    int codProduto = 0;
                                    System.out.println("Produto Existente");
                                    codProduto = prodControle.exibirPorPorduto(listaProdutos, produto.getNome());    
                                    do{
                                        System.out.print("INFORME O NOVO PERCENTUAL REAJUSTE DE PREÇO: ");
                                        percentual = LerValor.nextDouble();
                                        
                                        if(percentual <= 0){
                                            System.out.println("Valor Invalido, informe valor maior que zero");
                                        }
                                    }while(percentual <= 0);  
                                    novoPreco = listaProdutos.get(codProduto).getPrecoUnitario() - ((listaProdutos.get(codProduto).getPrecoUnitario() /100 ) * percentual );
                                    produto.setPrecoUnitario(novoPreco);
                                    produto.setQtdEstoque(listaProdutos.get(codProduto).getQtdEstoque());
                                    produto.setUnidade(listaProdutos.get(codProduto).getUnidade());

                                    System.out.println("CONFIRMA REAJUSTE (S/N)?");
                                    resp = LerTexto.nextLine();
                                    if(resp.equals("S") || resp.equals("s")){
                                        System.out.println("REAJUSTE CONFIRMADO");
                                        listaProdutos.set(codProduto, produto);
                                    }else{
                                        System.out.println("REAJUSTE NÃO CONFIRMADO");
                                    }

                                }else{
                                    System.out.println("PRODUTO NÃO CADASTRADO");
                                }
                                
                            break;
                            case 3:
                                prodControle = new ProdutoControle();
                                System.out.println("REAJUSTE DE PREÇOS");
                                System.out.println("REAJUSTE MAIOR TODOS PRODUTOS");
                                do{
                                    System.out.print("INFORME O NOVO PERCENTUAL REAJUSTE DE PREÇO: ");
                                    percentual = LerValor.nextDouble();
                                        
                                    if(percentual <= 0){
                                       System.out.println("Valor Invalido, informe valor maior que zero");
                                    }
                                }while(percentual <= 0);
                                System.out.println("CONFIRMA REAJUSTE (S/N)?");
                                resp = LerTexto.nextLine();
                                if(resp.equals("S") || resp.equals("s")){
                                    System.out.println("REAJUSTE CONFIRMADO");
                                    listaProdutos = prodControle.reajusteMaiorLoteProduto(listaProdutos, percentual);
                                }else{
                                    System.out.println("REAJUSTE NÃO CONFIRMADO");
                                }
                                
                                
                            break;
                            case 4:
                                prodControle = new ProdutoControle();
                                System.out.println("REAJUSTE DE PREÇOS");
                                System.out.println("REAJUSTE MENOR TODOS PRODUTOS");
                                do{
                                    System.out.print("INFORME O NOVO PERCENTUAL REAJUSTE DE PREÇO: ");
                                    percentual = LerValor.nextDouble();
                                        
                                    if(percentual <= 0){
                                       System.out.println("Valor Invalido, informe valor maior que zero");
                                    }
                                }while(percentual <= 0);
                                System.out.println("CONFIRMA REAJUSTE (S/N)?");
                                resp = LerTexto.nextLine();
                                if(resp.equals("S") || resp.equals("s")){
                                    System.out.println("REAJUSTE CONFIRMADO");
                                    listaProdutos = prodControle.reajusteMenorLoteProduto(listaProdutos, percentual);
                                }else{
                                    System.out.println("REAJUSTE NÃO CONFIRMADO");
                                }
                                
                                
                            break;
                            case 0:
                                System.out.println("Retorno para Menu Principal");
                            break;
                            
                            default:
                                System.out.println("\nOpção Inválida");
                            break;
                            
                        }
                        
                    }while(op != 0);
                    op = 3;
                    
                break;                
                case 4:
                    prodControle = new ProdutoControle();
                    System.out.println("RELATÓRIOS");
                    if(listaProdutos.size()> 0){
                        prodControle.relatorio(listaProdutos);
                    }else{
                        System.out.println("NÃO EXISTE PRODUTOS CADASTRADO");
                    }
                break;
                case 0:
                    System.out.println("Fim");
                break;
                
                default:
                    System.out.println("\nOpção Inválida");
                break;
            }
            
        }while(op != 0);
    
    }
    
    
    
    
}
