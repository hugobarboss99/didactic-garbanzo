package teste;

import matrizAdj.XCiclo;
import matrizAdj.XGrafo;

public class Teste {
    public static void main(String[] args) {
        XGrafo grafo1 = new XGrafo(8); // Primeiro grafo
       
        // inserindo elementos grafo1:
        grafo1.insereAresta(0, 0, 0);
        grafo1.insereAresta(0, 1, 1);
        grafo1.insereAresta(0, 3, 1);
        grafo1.insereAresta(0, 4, 1);
        
        grafo1.insereAresta(1, 1, 0);
        grafo1.insereAresta(1, 0, 1);
        grafo1.insereAresta(1, 2, 1);
        grafo1.insereAresta(1, 5, 1);
        
        grafo1.insereAresta(2, 2, 0);
        grafo1.insereAresta(2, 1, 1);
        grafo1.insereAresta(2, 3, 1);
        grafo1.insereAresta(2, 6, 1);
        
        grafo1.insereAresta(3, 3, 0);
        grafo1.insereAresta(3, 1, 1);
        grafo1.insereAresta(3, 2, 1);
        grafo1.insereAresta(3, 7, 1);
        
        grafo1.insereAresta(4, 4, 0);
        grafo1.insereAresta(4, 0, 1);
        grafo1.insereAresta(4, 5, 1);
        grafo1.insereAresta(4, 7, 1);
        
        grafo1.insereAresta(5, 5, 0);
        grafo1.insereAresta(5, 1, 1);
        grafo1.insereAresta(5, 4, 1);
        grafo1.insereAresta(5, 6, 1);
        
        grafo1.insereAresta(6, 6, 0);
        grafo1.insereAresta(6, 2, 1);
        grafo1.insereAresta(6, 5, 1);
        grafo1.insereAresta(6, 7, 1);
        
        grafo1.insereAresta(7, 7, 0);
        grafo1.insereAresta(7, 3, 1);
        grafo1.insereAresta(7, 4, 1);
        grafo1.insereAresta(7, 6, 1);
        
        System.out.println("MATRIZ: GRAFO 1");
        grafo1.imprime();System.out.println("");
        // Ciclos grafo1
        XCiclo cicloGrafo1 = new XCiclo(grafo1);
        
        // inserindo elementos grafo2:
        XGrafo grafo2 = new XGrafo(10); // Segundo grafo
        
        grafo2.insereAresta(9, 9, 0);
        grafo2.insereAresta(9, 6, 1);
        
        grafo2.insereAresta(0, 0, 0);
        grafo2.insereAresta(0, 1, 1);
        grafo2.insereAresta(0, 2, 1);
        grafo2.insereAresta(0, 3, 1);
        grafo2.insereAresta(0, 5, 1);
        
        grafo2.insereAresta(5, 5, 0);
        grafo2.insereAresta(5, 4, 1);
        grafo2.insereAresta(5, 6, 1);
        
        grafo2.insereAresta(1, 1, 0);
        grafo2.insereAresta(1, 2, 1);
        
        grafo2.insereAresta(2, 2, 0);
        grafo2.insereAresta(2, 3, 1);
        grafo2.insereAresta(2, 4, 1);
        
        grafo2.insereAresta(4, 4, 0);
        grafo2.insereAresta(4, 6, 1);
        
        grafo2.insereAresta(6, 6, 0);
        grafo2.insereAresta(6, 7, 1);
        grafo2.insereAresta(6, 8, 1);
        
        grafo2.insereAresta(7, 7, 0);
        grafo2.insereAresta(7, 8, 1);
        
        grafo2.insereAresta(8, 8, 0);
        
        grafo2.insereAresta(3, 3, 0);
        
        System.out.println("MATRIZ: GRAFO 2");
        grafo2.imprime();System.out.println("");
        // Ciclos grafo2
        XCiclo cicloGrafo2 = new XCiclo(grafo2);
        
        //RESULTADOS: 
        Boolean respGrafo1, respGrafo2;
        
        respGrafo1 = cicloGrafo1.getCiclo();
        respGrafo2 = cicloGrafo2.getCiclo();
        
        if(respGrafo1) 
            System.out.println("O GRAFO 1 POSSUI CICLO");
        else
            System.out.println("O GRAFO 1 N�O POSSUI CICLO");
        
        if(respGrafo2) 
            System.out.println("O GRAFO 2 POSSUI CICLO");
        else
            System.out.println("O GRAFO 2 N�O POSSUI CICLO");
              
        XGrafo grafo3 = new XGrafo(5); // Segundo grafo
        
        grafo3.insereAresta(1-1, 1-1, 0);
        grafo3.insereAresta(1-1, 2-1, 1);
        grafo3.insereAresta(1-1, 4-1, 1);
        
        grafo3.insereAresta(2-1, 2-1, 0);
        grafo3.insereAresta(2-1, 3-1, 1);
        grafo3.insereAresta(2-1, 5-1, 1);
        
        grafo3.insereAresta(3-1, 3-1, 0);
        grafo3.insereAresta(3-1, 5-1, 1);
        
        grafo3.insereAresta(5-1, 5-1, 0);
        grafo3.insereAresta(5-1, 4-1, 1)
                ;
        grafo3.insereAresta(4-1, 4-1, 0);
        grafo3.insereAresta(4-1, 2-1, 1);
        System.out.println("MATRIZ: GRAFO 3");
        grafo3.imprime();System.out.println("");
    }
}