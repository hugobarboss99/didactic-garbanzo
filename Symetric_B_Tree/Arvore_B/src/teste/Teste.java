package teste;

import arvore.ArvoreSBB;
import item.Item;
import java.util.Random;

public class Teste {
	public static void main(String[] args) {
		int comparador, elemento, n, aleatorio;
		long tempoInicial, tempoFinal, tempoGasto;
		ArvoreSBB arvoreOrdenada, arvoreAleatoria = null;
		Random random  = new Random();
	//Ordem ordenada
	/*
	for(n = 1; n <= 10; n++) {
		arvoreOrdenada = new ArvoreSBB();
		//inserção ordenada
		for(elemento = 1; elemento <= n*10000; elemento++) {
			Item itemElemento = new Item(elemento);
			arvoreOrdenada.insere(itemElemento);
			}
		//Pesquisa elemento que não existe
		Item itemSearch = new Item(200000);
		tempoInicial = System.nanoTime();
		comparador = arvoreOrdenada.pesquisa(itemSearch);
		tempoFinal = System.nanoTime();
		tempoGasto = (tempoFinal - tempoInicial);
		//Print
		System.out.println("Arvore: "+n+"\nTempo gasto na procura: "+tempoGasto+"(nanosegundos)"+"\nNumero de comparacoes: "+comparador);
		}
	*/
	//Ordem aleatoria
	for(n = 1; n <= 10; n++) {
		arvoreAleatoria = new ArvoreSBB();
		}
	//Inserção aleatoria
	for(elemento = 1; elemento <= n*10000; elemento++) {
		aleatorio = random.nextInt(n*10000)+1;
		Item itemElemeto = new Item(aleatorio);
		arvoreAleatoria.insere(itemElemeto);
	}
	//Pesquisa elemento inexistente
	Item itemSearch = new Item(200000);
	tempoInicial = System.nanoTime();
	comparador = arvoreAleatoria.pesquisa(itemSearch);
	tempoFinal = System.nanoTime();
	tempoGasto = (tempoFinal - tempoInicial);
	//Print
	System.out.println("Arvore: "+n+"\nTempo gasto na procura: "+tempoGasto+"(nanosegundos)"+"\nNumero de comparacoes: "+comparador);
	}
}