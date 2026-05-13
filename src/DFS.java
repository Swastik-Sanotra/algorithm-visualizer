
public class DFS {
    public static void traverse(Graph graph, int start, boolean []visited){
        visited[start]=true;
        System.out.print(start+" ");
         for(Edge edge : graph.getadjlist()[start]) {
            int neighbor = edge.destination;
            if(!visited[neighbor]) {
                traverse(graph, neighbor, visited);
            }
        }
    }
}

