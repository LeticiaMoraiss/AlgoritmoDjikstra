package algoritmodjikstra;

import java.util.*;
import java.lang.*;
import java.io.*;

public class AlgoritmoDjikstra {

    /*  A funcao abaixo encontra o vertice com o menor valor de distancia dos vertices nao inclu�dos na arvore de busca */
    static final int V = 12;
    
    /* altere de acordo com o numero de vertices do grafo */
    int distanciaMin(int dist[], Boolean visitados[]) {
        /* Inicialize o menor valor */
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++) {
            if (visitados[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }

    /* A funcao imprimeSolucao imprime a rota minima e o custo minimo exemplo de saida: Caminho minimo = 0-2-3-5 Custo minimo = 20*/
    void imprimeSolucao(int custo, int n, int precedente[]) {
        System.out.print("Precedente: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + precedente[i] + " ");
        }

        System.out.print("\nCusto minimo: " + custo + "\n\n");

    }

    /* A funcao abaixo implementa o algoritmo de dijkstra para um grafo representado por uma matriz de adjacencia */
    void dijkstra(int grafo[][], int src) {
        int dist[] = new int[V];
        /* Vetor de distancia minima*/
        int precedente[] = new int[V];
        /*Vetor de vertices visitados*/
        Boolean visitados[] = new Boolean[V];

        /* Inicializando todas as distancia para infinito e marcando todos os vertices como nao visitados */
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visitados[i] = false;
        }

        /* Distancia da origem e sempre 0 */
        dist[src] = 0;
        int custo = 0;
        /* Encontra o menor caminho para todos os v�rtices */
        for (int count = 0; count < V - 1; count++) {
            /* Pega a distancia minima do vertice para o conjunto de vertives nao visitados. u é sempre igual a src(origem) na primeira iteracao.*/
            int u = distanciaMin(dist, visitados);

            /* Marca o vertice como visitado */
            visitados[u] = true;

            /* Atualiza a distancia dos vertices adjacentes do vertice visitado*/
            for (int v = 0; v < V; v++) /*Atualiza a dist[v] somente se o vertice nao foi visitado e se existir uma aresta de u para v e se o peso total do caminho desrc(origem) para v onde u e o menor valor dos valores de dist[v] */ {
                if ((!visitados[v]) && (grafo[u][v] != -999) && (dist[u] != Integer.MAX_VALUE) && (dist[u] + grafo[u][v] < dist[v])) {
                    dist[v] = dist[u] + grafo[u][v];
                    custo = dist[v];
                    precedente[v] = dist[v];
                }
            }
        }

        // Imprime o caminho minimo e o custo total minimo
        imprimeSolucao(custo, V, precedente);
    }

}
