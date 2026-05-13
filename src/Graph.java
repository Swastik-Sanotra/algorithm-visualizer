import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Edge>adjList[];

        Graph(int vertices){
            this.vertices = vertices;
            adjList=new LinkedList [vertices];

            for (int i = 0 ; i<vertices ; i++){
                adjList[i]=new LinkedList<>();
            }
    }

        void addedge (int start, int destination,int weight){
            // System.out.println("adding edge : "+start+ " --> "+destination);
            adjList[start].add(new Edge(destination,weight));
            adjList[destination].add(new Edge (start,weight));
        }

        LinkedList<Edge>[] getadjlist(){
             return adjList;
        }
        
        
        int getVertices(){
            return vertices;
        }
}
