package teste;

import agm.AgmPrim;
import agm.FPHeapMinIndireto;
import agm.XGrafo;

public class Teste {
    public static void main(String[] args) throws Exception {
        XGrafo grafo1 = new XGrafo(9); // Primeiro grafo
       
        // inserindo elementos grafo1:
        grafo1.insereAresta(0, 0, 0);
        grafo1.insereAresta(0, 1, 15);
        grafo1.insereAresta(0, 3, 5);
                
        grafo1.insereAresta(1, 1, 0);
        grafo1.insereAresta(1, 0, 15);
        grafo1.insereAresta(1, 2, 10);
        grafo1.insereAresta(1, 4, 10);
        grafo1.insereAresta(1, 6, 5);
        
        grafo1.insereAresta(2, 2, 0);
        grafo1.insereAresta(2, 1, 10);
        grafo1.insereAresta(2, 3, 5);
        grafo1.insereAresta(2, 4, 10);
        grafo1.insereAresta(2, 5, 10);
        grafo1.insereAresta(2, 7, 5);
        
        grafo1.insereAresta(3, 3, 0);
        grafo1.insereAresta(3, 0, 5);
        grafo1.insereAresta(3, 2, 5);
        grafo1.insereAresta(3, 5, 5);
        grafo1.insereAresta(3, 8, 10);
        
        grafo1.insereAresta(4, 4, 0);
        grafo1.insereAresta(4, 1, 10);
        grafo1.insereAresta(4, 2, 10);
        grafo1.insereAresta(4, 6, 5);
        grafo1.insereAresta(4, 7, 5);
        
        grafo1.insereAresta(5, 5, 0);
        grafo1.insereAresta(5, 2, 10);
        grafo1.insereAresta(5, 3, 5);
        grafo1.insereAresta(5, 8, 20);
        
        grafo1.insereAresta(6, 6, 0);
        grafo1.insereAresta(6, 1, 5);
        grafo1.insereAresta(6, 4, 5);
        grafo1.insereAresta(6, 7, 10);
        
        grafo1.insereAresta(7, 7, 0);
        grafo1.insereAresta(7, 2, 5);
        grafo1.insereAresta(7, 4, 5);
        grafo1.insereAresta(7, 6, 10);
        grafo1.insereAresta(7, 8, 10);
        
        grafo1.insereAresta(8, 8, 0);
        grafo1.insereAresta(8, 3, 10);
        grafo1.insereAresta(8, 5, 20);
        grafo1.insereAresta(8, 7, 10);
        
        // inserindo elementos grafo2:
        XGrafo grafo2 = new XGrafo(10); // Segundo grafo
        
        grafo2.insereAresta(2, 2, 0);
        grafo2.insereAresta(2, 1, 8);
        grafo2.insereAresta(2, 3, 3);
        grafo2.insereAresta(2, 4, 2);
        grafo2.insereAresta(2, 5, 7);
        grafo2.insereAresta(2, 6, 5);
        grafo2.insereAresta(2, 8, 6);
        
        grafo2.insereAresta(1, 1, 0);
        grafo2.insereAresta(1, 2, 8);
        grafo2.insereAresta(1, 3, 2);
        grafo2.insereAresta(1, 7, 9);
        
        grafo2.insereAresta(3, 3, 0);
        grafo2.insereAresta(3, 1, 2);
        grafo2.insereAresta(3, 2, 3);
        grafo2.insereAresta(3, 4, 9);
        grafo2.insereAresta(3, 7, 6);
       
        grafo2.insereAresta(4, 4, 0);
        grafo2.insereAresta(4, 2, 2);
        grafo2.insereAresta(4, 3, 9);
        grafo2.insereAresta(4, 5, 6);
        grafo2.insereAresta(4, 7, 2);
        
        grafo2.insereAresta(5, 5, 0);
        grafo2.insereAresta(5, 2, 7);
        grafo2.insereAresta(5, 4, 6);
        grafo2.insereAresta(5, 6, 5);
        grafo2.insereAresta(5, 7, 4);
        
        grafo2.insereAresta(6, 6, 0);
        grafo2.insereAresta(6, 2, 5);
        grafo2.insereAresta(6, 5, 5);
        grafo2.insereAresta(6, 8, 4);
        grafo2.insereAresta(6, 7, 6);
       
        grafo2.insereAresta(8, 8, 0);
        grafo2.insereAresta(8, 2, 6);
        grafo2.insereAresta(8, 6, 4);
        grafo2.insereAresta(8, 7, 3);
        
        grafo2.insereAresta(7, 7, 0);
        grafo2.insereAresta(7, 1, 9);
        grafo2.insereAresta(7, 3, 6);
        grafo2.insereAresta(7, 4, 2);
        grafo2.insereAresta(7, 5, 4);
        grafo2.insereAresta(7, 6, 6);
        grafo2.insereAresta(7, 8, 3);
        
        // inserindo elementos grafo2:
        XGrafo grafo3 = new XGrafo(9); // Segundo grafo
        
        grafo3.insereAresta(0, 0, 0);
        grafo3.insereAresta(0, 1, 4);
        grafo3.insereAresta(0, 7, 8);
        
        grafo3.insereAresta(1, 1, 0);
        grafo3.insereAresta(1, 0, 4);
        grafo3.insereAresta(1, 2, 8);
        grafo3.insereAresta(1, 7, 11);
        
        grafo3.insereAresta(2, 2, 0);
        grafo3.insereAresta(2, 1, 8);
        grafo3.insereAresta(2, 3, 7);
        grafo3.insereAresta(2, 8, 2);
        grafo3.insereAresta(2, 5, 4);
       
        grafo3.insereAresta(3, 3, 0);
        grafo3.insereAresta(3, 2, 7);
        grafo3.insereAresta(3, 4, 9);
        grafo3.insereAresta(3, 5, 14);
        
        grafo3.insereAresta(4, 4, 0);
        grafo3.insereAresta(4, 3, 9);
        grafo3.insereAresta(4, 5, 10);
        
        grafo3.insereAresta(5, 5, 0);
        grafo3.insereAresta(5, 4, 10);
        grafo3.insereAresta(5, 3, 14);
        grafo3.insereAresta(5, 2, 4);
        grafo3.insereAresta(5, 6, 2);
        
        grafo3.insereAresta(6, 6, 0);
        grafo3.insereAresta(6, 5, 2);
        grafo3.insereAresta(6, 8, 6);
        grafo3.insereAresta(6, 7, 1);
       
        grafo3.insereAresta(7, 7, 0);
        grafo3.insereAresta(7, 6, 1);
        grafo3.insereAresta(7, 8, 7);
        grafo3.insereAresta(7, 0, 8);
        grafo3.insereAresta(7, 1, 11);
        
        grafo3.insereAresta(8, 8, 0);
        grafo3.insereAresta(8, 6, 6);
        grafo3.insereAresta(8, 7, 7);
        grafo3.insereAresta(8, 2, 2);
        
        //RESULTADOS: 
        System.out.println("\nARESTAS GRAFO 1: ");
        AgmPrim g1 = new AgmPrim(grafo1);
        g1.obterAgm(8);
        g1.imprime();
        System.out.println("PESO : " + g1.getPeso());
        
        System.out.println("\nARESTAS GRAFO 2: ");
        AgmPrim g2 = new AgmPrim(grafo2);
        g2.obterAgm(2);
        g2.imprime();
        System.out.println("PESO : " +g2.getPeso());
        
        System.out.println("\nARESTAS GRAFO 3: ");
        AgmPrim g3 = new AgmPrim(grafo3);
        g3.obterAgm(0);
        g3.imprime();
        System.out.println("PESO : " +g3.getPeso());
    }
}
