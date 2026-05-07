import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer>adjList[];

        Graph(int vertices){
            this.vertices = vertices;
            adjList=new LinkedList [vertices];

            for (int i = 0 ; i<vertices ; i++){
                adjList[i]=new LinkedList<>();
            }
    }

        void addedge (int start, int destination){
            adjList[start].add(destination);
            adjList[destination].add(start);
        }
        LinkedList<Integer>[] getadjlist(){
             return adjList;
        }
        
        int getVertices(){
            return vertices;
        }
}
