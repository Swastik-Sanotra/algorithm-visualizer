
public class DFS {
    public static void traverse(Graph graph, int start, boolean []visited){
        visited[start]=true;
        System.out.println(start+" ");
         for(edge Edge : graph.getadjlist()[start]) {
            int neighbor = Edge.destination;
            if(!visited[neighbor]) {
                traverse(graph, neighbor, visited);
            }
        }
    }
}
