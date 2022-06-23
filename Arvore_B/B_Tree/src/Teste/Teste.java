package Teste;

import Item.Item;
import Arvore.Arvore_B;
import java.util.Scanner;
import Arvore.ArvoreSBB;

public class Teste {
	public static void main(String[] args) {
		
		int contadorDeComparacoes, elemento, n;
        long tempoInicial, tempoFinal, tempoGasto;
        int total = 10000;
        
        Arvore_B arvore_B = null;
        ArvoreSBB arvoreSBB = new ArvoreSBB();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Definando a ordem da Árvore B (2,4 ou 6): ");
        int ordem = scan.nextInt();
        
        switch(ordem){
            case 2: 
                    break;
            case 4: 
                    break;
            case 6:
                    break;
            default:System.out.println("Ordem não identificada");
                    System.exit(1);
        }
        //Item que nunca vai ser achado
        
      //inserindo elementos em cada arvore
        for(n = 1; n <= 3; n++)
        {
            arvore_B = new Arvore_B(ordem);
            //insere os elementos ordenadamente
            for(elemento = 1; elemento <= n*10000; elemento++)
            {
                Item itemElemento = new Item(elemento);
                arvoreSBB.insere(itemElemento);
                arvore_B.insere(itemElemento);
            }        
        }
        Item itemSearch = new Item(200000);
      //pesquisar por um elemento não existente em cada árvore
      // Arvore SBB
      //
      /*
      tempoInicial = System.nanoTime();
      //contadorDeComparacoes = arvoreSBB.pesquisa(itemSearch);
      arvoreSBB.pesquisa(itemSearch);
      contadorDeComparacoes = arvoreSBB.getContadorDeComparacoes();
      tempoFinal = System.nanoTime();
      tempoGasto = (tempoFinal-tempoInicial);
      //Print
      System.out.println("Arvore SBB: "+n+" Tempo Gasto para fazer a procura: "+tempoGasto+"(nano segundos)"+" Numero de Comparacoes: "+contadorDeComparacoes);
      */
      //
      
      // Arvore B
      //
      
      tempoInicial = System.nanoTime();
      //contadorDeComparacoes = arvoreB.pesquisa(itemSearch);
      arvore_B.pesquisa(itemSearch);
      contadorDeComparacoes = arvore_B.getComparacoesRealizadas();
      tempoFinal = System.nanoTime();
      tempoGasto = (tempoFinal-tempoInicial);
      //Print
      System.out.println("Arvore B: "+n+" Ordem: "+ordem+" Tempo Gasto para fazer a procura: "+tempoGasto+"(nano segundos)"+" Numero de Comparacoes: "+contadorDeComparacoes);
      
      //
	}
}