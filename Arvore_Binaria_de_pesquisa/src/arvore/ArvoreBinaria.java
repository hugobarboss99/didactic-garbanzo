package arvore;

import item.Item;

public class ArvoreBinaria {
	public static class No {
		Item reg;
		No esq, dir;
	}
	
	private No noRaiz;
	private int ContadorDeComparacoes;
	
	//Inicia a arvore
	public ArvoreBinaria() {
		this.noRaiz = null;
	}
	
	//Inserir elemento "reg"
	private No InsereItem(Item reg, No p) 
	{
		//Se no e null
		if(p == null ) {
			p = new No();
			p.reg = reg;
			p.esq = null;
			p.dir = null;
		}
		//Elemento menor
		else if (reg.compara(p.reg)<0)
			p.esq = InsereItem(reg, p.esq);
		//Elemento maior
		else if (reg.compara(p.reg)>0)
			p.dir = InsereItem(reg, p.dir);
		//Elemento igual
		else
			System.out.println("Erro: Registro ja existente");
		return p;
	}
	
	public void insere(Item reg)
	{
		this.noRaiz = this.InsereItem(reg, this.noRaiz);
	}
	//Busca do elemento "reg"
	private Item PesquisaItem(Item reg, No p)
	{
		//Se o no e nulo
		if(p==null)
			return null;
		//elemento menor
		else if (reg.compara(p.reg)<0)
		{
			ContadorDeComparacoes++;
			return PesquisaItem(reg, p.esq);
		}
		//elemento maior
		else if(reg.compara(p.reg)>0)
		{
			ContadorDeComparacoes++;
			return PesquisaItem(reg, p.dir);
		}
		//elemento igual
		else 
			return p.reg;
	}
	
	public int pesquisa(Item reg)
	{
		this.PesquisaItem(reg, this.noRaiz);
		return this.ContadorDeComparacoes;
	}
	
	public No getNoRaiz() 
	{
		return noRaiz;
	}
	
	public void setNoRaiz(No noRaiz)
	{
		this.noRaiz = noRaiz;
	}
	
}