import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<edge>adjList[];

        Graph(int vertices){
            this.vertices = vertices;
            adjList=new LinkedList [vertices];

            for (int i = 0 ; i<vertices ; i++){
                adjList[i]=new LinkedList<>();
            }
    }

        void addedge (int start, int destination,int weight){
            adjList[start].add(new edge(destination,weight));
            adjList[destination].add(new edge (start,weight));
        }

        LinkedList<edge>[] getadjlist(){
             return adjList;
        }
        
        
        int getVertices(){
            return vertices;
        }
}
