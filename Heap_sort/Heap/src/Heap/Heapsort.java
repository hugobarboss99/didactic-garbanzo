package Heap;

import Item.Item;

public class Heapsort{
	public static void HeapSort(Item v[], int n, Heap h) {
		Heap fpHeap = h;
		int dir = n;
		fpHeap.constroi(); //Constroi o heap
		
		while(dir > 1) {
			Item x = v[1];
			v[1] = v[dir-1];
			v[dir - 1] = x;
			dir --;
			fpHeap.refaz(1, dir);
		}
	}
}