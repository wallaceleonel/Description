#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main (){
    char livro[30][40],autor[40][50];
    char tag[100];
    int preco=0,op,qtd,cont=0,sacola,total=0;
    int cont=1,car,mode,apagar;
    aux =0;
    sair =2;
    while (sair==2) {
      system("cls");
      
      printf("\t\t%c--------------------------------------------------------%c",155,187);
      printf("\n\t\t|      Adicicionando livros  Giropops Bliclioteca on           |\n");
      printf("\t\t%c--------------------------------------------------------%c",155,187);
      
      printf("op 1 começar a comprar informe seus livros :) >>>>CLIQUE AQUI<<<<<<<\n");
      printf("op 2 vizualizar sacola \n");
      printf("op 3 deseja remover algo ? \n");
      printf("op 4 finalizar venda \n");
      
      printf("digite a opacao :) ");
      scanf("%d",&op);
      
      switch (op){
      case 1:
         system("cls");
         printf("Quantos livros deseja adionar ?");
         scanf("%d",&qtd);
 
      for (cont=0;cont<qtd;cont++){
         system("cls");
         printf("\ninforme o nome do livro :");
         fflush(stdin);
         scanf("%[^\n]s",&livro[aux]);
         printf("\ninfome o nome do autor :");
         fflush(stdin);
         scanf("%[^\n]s",&autor[aux]);
         printf("\n informe a tag deste livro :");
         fflush(stdin);
         scanf("%[^\n]s",&tag[aux]);
         printf("\ninforme o preco do livro :");
         fflush(stdin);
         scanf("%d",&preco[aux]);
         
       aux++; //snedo usado como contador na resposta nula    
      }
      system("pause");
      break;
      case 2:
      system("cls");
      
      printf("\t\t%c--------------------------------------------------------%c",155,187);
      printf("\n\t\t|             Carrinho Giropops Bliclioteca on            |\n");
      printf("\t\t%c--------------------------------------------------------%c",155,187);
      total = qtd*preco;

      printf("Carrinho de compras ");
      for(cont=0;cont<aux;cont++){
        printf("\n%d%d     -     %s\n\n",cont,total,livro[cont]);
      }
     
     printf("Estes são os itens em seu carrinho :")
     scanf("%d",&car);
     
       printf("\n nome do livro :%s \n ",livro[car]);
       printf("\n nome do autor : %s \n ",autor[car]);
       printf("\n codigo do livro : %s \n ",tag[car]);
       printf("\n preco do livro  %d \n ",preco[car]);
       
       system("pause");
       break;

       
      }
      default:
         break;
      }

    }
    
     



}
