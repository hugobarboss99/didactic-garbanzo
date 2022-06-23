package agm;

public class XGrafo {
    public static class Aresta {
        private int v1, v2, peso;
        
        public Aresta(int v1, int v2, int peso) {
            this.v1 = v1; 
            this.v2 = v2; 
            this.peso = peso; 
        }
        
        public int peso() { 
            return this.peso; 
        }
        
        public int v1() { 
            return this.v1; 
        }
        
        public int v2() { 
            return this.v2; 
        }
    }
    
    private int mat[][]; // pesos do tipo inteiro
    private int numVertices; // numero de vertices
    private int pos[]; // posi��o atual ao se percorrer os adjs de um v�rtice v
    
    // inicializar o grafo
    public XGrafo (int numVertices) {
        this.mat = new int[numVertices][numVertices];
        this.pos = new int[numVertices]; 
        this.numVertices = numVertices;
        for(int i = 0; i < this.numVertices; i++) {
            for(int j = 0; j < this .numVertices; j++) 
                this.mat[i][j] = 0;
            this.pos[i] = -1;
        }
    }
    
    public void insereAresta (int v1, int v2, int peso) {
        this.mat[v1][v2] = peso; 
    }
    
    public boolean existeAresta(int v1, int v2) {
        return (this.mat[v1][v2] > 0);
    }
    
    public boolean listaAdjVazia (int v) {
        for(int i =0; i < this .numVertices; i++)
            if(this.mat[v][i] > 0) 
                return false;
        return true;
    }
    
    public Aresta primeiroListaAdj(int v) {
        // Retorna a primeira aresta que o v�rtice v participa ou
        // null se a lista de adjac�ncia de v for vazia
        this.pos[v] = -1; 
        return this.proxAdj(v);
    }
    
    public Aresta proxAdj(int v) {
        // Retorna a pr�xima aresta que o v�rtice v participa ou
        // null se a lista de adjac�ncia de v estiver no fim
        this.pos[v]++;
        while((this.pos[v] < this.numVertices) && (this.mat[v][this.pos[v]] == 0))
            this.pos[v]++;
        if(this.pos[v] == this.numVertices) 
            return null;
        else 
            return new Aresta(v, this.pos[v], this.mat[v][this.pos[v]]); // Aresta que est� sendo procurada
    }
    
    public Aresta retiraAresta(int v1, int v2) {
        if(this.mat[v1][v2] == 0) 
            return null ; // Aresta n�o existe
        else {
            Aresta aresta = new Aresta(v1, v2, this.mat[v1][v2]);   
            this.mat[v1][v2] = 0; 
            return aresta;
        }   
    }
    
    public void imprime() {
        System.out.print(" ");
        for(int i = 0; i < this.numVertices; i++)
            System.out.print (i + " ");
        System.out. println();
        for(int i = 0; i < this .numVertices; i++) {
            System.out.print(i + " ");
            for(int j = 0; j < this .numVertices; j++)
                System.out.print(this.mat[i][j] + " ");
            System.out.println();
        }
    }
    
    public int numVertices() {
        return this.numVertices;
    }
}
