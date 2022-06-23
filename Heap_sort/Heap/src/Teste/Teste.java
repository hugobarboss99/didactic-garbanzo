package Teste;

import Heap.Heap;
import Heap.Heapsort;
import Item.Item;
import java.util.Random;

public class Teste{
	public static void main(String[]args) {
		int comparador, crescente, decrescente, aleatorio, n, posicao;
		String nameFile;
		Random gerador = new Random();
		
		for(n=1;n<=10;n++) {
			Item OrdenadosCrescente[] = new Item[n*10000];
			Item OrdenadosDecrescente[] = new Item[n*10000];
			Item Aleatorios[] = new Item[n*10000];
			
			 for(crescente = 1, posicao = 0, decrescente = n*10000; crescente <= n * 10000;crescente++, posicao++, decrescente--){
				 Item itemcrescente = new Item(crescente);
				 Item itemdecrescente = new Item(decrescente);
				 OrdenadosCrescente[posicao] = itemcrescente;
				 OrdenadosDecrescente[posicao] = itemdecrescente;
				 
				 int rand = gerador.nextInt(n*9999+1);
				 Item itemaleatorio = new Item(rand);
				 Aleatorios[posicao] = itemaleatorio;
			 }
			 
			//elementos crescentes ordenadamente
             Heap heapOrdenadoCrescente = new Heap(OrdenadosCrescente);
             Heapsort.HeapSort(OrdenadosCrescente, OrdenadosCrescente.length, heapOrdenadoCrescente);
             nameFile = "ordemOrdenadaCrescente Heap";
             comparador = heapOrdenadoCrescente.getcompara();
             heapOrdenadoCrescente.gravaDados(n, comparador,nameFile);
		
           //elementos decrescentes ordenadamente
             Heap heapOrdenadoDecrescente = new Heap(OrdenadosDecrescente);
             Heapsort.HeapSort(OrdenadosDecrescente, OrdenadosDecrescente.length, heapOrdenadoDecrescente);
             nameFile = "ordemOrdenadaDecrescente Heap";
             comparador = heapOrdenadoDecrescente.getcompara();
             heapOrdenadoDecrescente.gravaDados(n, comparador,nameFile);
		
           //elementos aleatorios
             Heap heapAleatorio = new Heap(Aleatorios);
             Heapsort.HeapSort(Aleatorios, Aleatorios.length, heapAleatorio);
             nameFile = "ordemAleatoria Heap";
             comparador = heapAleatorio.getcompara();
             heapAleatorio.gravaDados(n, comparador,nameFile);
		}
	}
}