/* 
cliene e dono de um cebo e quer ter seu controle de estoque 
Progama devara efetuar seguintes controles de estoque 
codigo do livro ok 
nome do lirvro   ok 
nome do autor   ok 
preco do livro   ok 
alocar todas as informacoes em um unico cara ... 
adiciorar remover encerrar | estoque |

*/
// carrinho cliente 
//criar uma lista de pedidos , exibindo livros que cliente ira levar 

#include <stdio.h> /* funções padrão de E/S */
#define FNOME "livros.txt" /* nome do arquivo de dados */
#define NUM 50 /* numero de registros na base de dados */
#define NOMELEN 30 /* tamanho de um nome */
/*** declara estrutura de dados ***/
struct livro
{
char nome [NOMELEN]; /* nome codigo(sem espaços em branco) */
int tag  ; /* numero codigo */
};
/*** prototipos ***/
int nomelivro(struct livro []);
int tag(struct livro [], int);
int preco(struct livro [],int);
int auth(struct livro []);
void listatudo(struct livro [], int);
void salvadb(struct livro [], i
main()
{
struct livro registos[50]; /* array de 50 estruturas */
int n,t,u,v; /* indice para o ultimo registro ativo */
char ch;
/*** carrega a base de dados em agentes[], n é o tamanho da base de dados */
n = loaddb(livros);
/* seleciona uma opção do menu e processa os dados em memória */
switch (ch)
 printf("Hello Word , bem vindo ao cebo Girpopos <3");

 printf("Me diga qual livro ira querer , mas antes irei te 
      fazer algumas perguntas para localizar ele, vamos la ?");
do{



printf("\nDigite ’a’ para adicionar novo livro,");
printf("\n ’t' para adicionar tag,");
printf("\n informe 'u' para adicionar nome do autor ")
printf("\n informe 'v' para valor do livro ");
printf("\n informe 'l' para listar todos os livros registrados ")
printf("\n ’q’ para terminar: ");
ch = getchar();
switch (ch)
{
case ’a’:
n = novonome(livro, n); /* adiciona um novo agente no indice n */
break;
case 't':
tag (l;ivro,n)
break;
case 'u':
auth (livro,n);
break;

case 'v':
preco(livro.n);
break;

case ’l’: /* lista todos os registros */
listatudo(livro, n);
break;

case ’q’: /* salva todos os registros */
salvadb(livro, n);
break;
default: /* Engano do usuario */

printf("\nEntre somente as opções listadas.\n");
}
while (fgetc(stdin) != ’\n’) ;
} while (ch != ’q’);
}       
/*passando informacoes para armazenamento de variaveis 
armazenameto sera feito em matriz assim passando por referencia todas as informacoes ao mesmo item em questao , o livro
lvr == tag == auth == prc == qtd , problema e fazer todos fazerem refencia em mudar 
a ideia e armazenar infomracoes coletadas a um item
tentando lembrar como faz isso , loading ...... 

 perguntar se deseja icluir mais um livro 
*/ se sim , retornar perguntas // se nao encerrar iclusao de livros 

return 0;
}


