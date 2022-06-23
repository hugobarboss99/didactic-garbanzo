package Heap;

import Item.Item;
import File.CreateTextFile;

public class Heap{
	private Item v[];
	private int n;
	private int compara;
	
	public Heap(Item v[]) {
		this.v = v;
		this.n = this.v.length -1;
		this.compara = 0;
	}
	public Item max() {
		return this.v[1];
	}
	public void refaz(int esq, int dir) {
		int j = esq * 2;
		Item x = this.v[esq];
		
		while(j<=dir) {
			this.compara++;
			if((j<dir)&&(this.v[j].compara(this.v[j+1])<0)) {
				j++;
			}
			if(x.compara(this.v[j])>=0) {
				break;
			}
			this.v[esq] = this.v[j];
			esq = j;
			j = esq * 2;
		}
		this.v[esq] = x;
	}
	public void constroi() {
		int esq = n/2 + 1;
		while(esq >1) {
			esq--;
			this.refaz(esq, this.n);
		}
	}
	public void gravaDados(int n, int contadorDeComparacoes, String nomeArquivo)
    {
        String string = "Heap: "+n+" Numero de Comparacoes: "+contadorDeComparacoes+"\n";
        CreateTextFile.escrever(string, nomeArquivo);
    }
	public int getcompara() {
    return compara;
    }

    public void setcompara(int compara) {
    this.compara = compara;
    }
}