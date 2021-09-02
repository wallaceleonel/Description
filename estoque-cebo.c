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


        
        
        
        # Andamento
<center>
<table>
    <tr>
        <td><img width="430px" align="left" src="https://github-readme-stats.vercel.app/api/top-langs/?username=Ibsiany&hide=html&layout=compact&theme=buefy" /></td>
        <td><img width="495px" align="left" src="https://github-readme-stats.vercel.app/api?username=Ibsiany&theme=buefy"/></td>
    </tr>   
</table>
</center>
# Tecnologias
<center>
<table align="space-between">
    <tr>
  
<th>Linguagens</th>
<th>Ferramentas</th>
<th>Softwares</th>
 </tr>
       <tr>
<td>
    <img src="https://img.shields.io/badge/typescript%20-%23007ACC.svg?&style=for-the-badge&logo=typescript&logoColor=white"/>
    <img src="https://img.shields.io/badge/javascript%20-%23323330.svg?&style=for-the-badge&logo=javascript&logoColor=%23F7DF1E"/>
    <img src="https://img.shields.io/badge/html5%20-%23E34F26.svg?&style=for-the-badge&logo=html5&logoColor=white"/>
    <img src="https://img.shields.io/badge/css3%20-%231572B6.svg?&style=for-the-badge&logo=css3&logoColor=white"/>
    <img src="https://img.shields.io/badge/C-00599C?style=for-the-badge&logo=c&logoColor=white"/>
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
</td>
<td>
    <img src="https://img.shields.io/badge/react%20-%2320232a.svg?&style=for-the-badge&logo=react&logoColor=%2361DAFB"/>
    <img src="https://img.shields.io/badge/node.js%20-%2343853D.svg?&style=for-the-badge&logo=node.js&logoColor=white"/>
    <img src="https://img.shields.io/badge/Express.js-000000?style=for-the-badge&logo=express&logoColor=white"/>
    <img src="https://img.shields.io/badge/git%20-%23F05033.svg?&style=for-the-badge&logo=git&logoColor=white"/>
</td>
<td>
    <img src="https://img.shields.io/badge/github%20-%23121011.svg?&style=for-the-badge&logo=github&logoColor=white"/>
    <img src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white"/>
    <img src="https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white"/>
    <img src="https://img.shields.io/badge/GitLab-330F63?style=for-the-badge&logo=gitlab&logoColor=white"/>
    <img src="https://img.shields.io/badge/firebase-ffca28?style=for-the-badge&logo=firebase&logoColor=black"/>
</td>
       </tr>  
</table>
</center>
<!--
**Ibsiany/Ibsiany** is a ✨ _special_ ✨ repository because its `README.md` (this file) appears on your GitHub profile.
