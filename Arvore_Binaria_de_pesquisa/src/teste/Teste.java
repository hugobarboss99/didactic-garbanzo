package teste;

import arvore.ArvoreBinaria;
import item.Item;
import java.util.Random;

public class Teste {
	public static void main(String[] args)
	{
		int comparador, elemento, n, aleatorio;
		long tempoInicial, tempoFinal, tempoGasto;
		ArvoreBinaria arvoreOrdenada, arvoreAleatoria;
		Random random  = new Random();
	//Ordem ordenada em cada arvore
	//Colocar comentario aqui para rodar apenas a aleatoria
	for (n = 1; n <= 9; n++) 
		{
		arvoreOrdenada = new ArvoreBinaria();
		//Insere de forma ordenada
		for(elemento = 1; elemento <= n*1000; elemento++)
			{
			Item itemElemento = new Item(elemento);
			arvoreOrdenada.insere(itemElemento);
			}
		//Procura um elemento inexistente
		
		Item itemSearch = new Item(20000);
		tempoInicial = System.nanoTime();
		comparador = arvoreOrdenada.pesquisa(itemSearch);
		tempoFinal = System.nanoTime();
		tempoGasto = (tempoFinal - tempoInicial);
		//Print
		System.out.println("Arvore: "+n+"\nTempo gasto na procura: "+tempoGasto+"(nanosegundos)"+"\nNumero de comparacoes: "+comparador);
		}
	//Colocar comentario aqui para rodar apenas a aleatoria
	//Ordem aleatoria
	for(n = 1; n <= 7; n++)
	{
		arvoreAleatoria = new ArvoreBinaria();
		//Insere aleatoriamente
		for(elemento = 1; elemento <= n*1000; elemento++)
		{
		aleatorio = random.nextInt(n*1000);
		//System.out.println("teste: "+aleatorio);
		Item itemElemento = new Item(aleatorio);
		arvoreAleatoria.insere(itemElemento);
		}
		//Procurando numero inexistente
		Item itemSearch = new Item(20000);
		tempoInicial = System.nanoTime();
		comparador = arvoreAleatoria.pesquisa(itemSearch);
		tempoFinal = System.nanoTime();
		tempoGasto = (tempoFinal - tempoInicial);
		//Print
		System.out.println("Arvore: "+n+"\nTempo gasto na procura: "+tempoGasto+"(nanosegundos)"+"\nNumero de comparacoes: "+comparador);
		}
	}
}

