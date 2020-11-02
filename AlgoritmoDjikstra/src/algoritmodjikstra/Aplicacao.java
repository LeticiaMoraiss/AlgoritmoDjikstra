package algoritmodjikstra;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Aplicacao {

    public static void main(String[] args) {
        /*Preencha a matriz com as distancias do vertice atual para cada vertice
	   vizinho. Cada linha da matriz representa o vertice atual e cada coluna 
	   representa os vertices e a distancia dele para o vertice que a linha da matriz
	   representa. Os vertices das colunas com -999 representam que nao sao vizinhos do vertice que a linha da matriz representa */
        int grafo[][] = new int[][]{
           //  0     1       2    3    4      5       6       7       8       9      10       11 
            {-999,   61,    50,	 42, -999,   -999,   -999,   -999,   -999,   -999,   -999,   -999},
            {61,    -999,  -999, 32, -999,    29,    -999,   -999,   -999,    17,    -999,   -999},
            {50,    -999,  -999, 56,  67,    -999,   -999,   -999,   -999,   -999,   -999,   -999},
            {42,     32,    56, -999, 45,     62,     85,    -999,   -999,   -999,   -999,   -999},
            {-999,  -999,   67,  45, -999,   -999,    72,    -999,    73,    -999,   -999,   -999},
            {-999,   29,   -999, 62, -999,   -999,    20,     35,    -999,    30,     45,    -999},
            {-999,  -999,  -999, 85,  72,     20,    -999,    40,     60,    -999,   -999,    32}, 
            {-999,  -999,  -999,-999,-999,    35,     40,    -999,   -999,   -999,    50,     21}, 
            {-999,  -999,  -999,-999, 73,    -999,    60,    -999,   -999,   -999,   -999,    50},
            {-999,   17,   -999,-999,-999,    30,    -999,   -999,   -999,   -999,    30,    -999},
            {-999,  -999,  -999,-999,-999,    45,    -999,    50,    -999,    30,    -999,   -999},
            {-999,  -999,  -999,-999,-999,   -999,    32,     21,     50,    -999,   -999,   -999},
        };


        AlgoritmoDjikstra t = new AlgoritmoDjikstra();
        t.dijkstra(grafo, 0);
    }
}
