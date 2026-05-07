
public class DFS {
    public static void traverse(Graph graph, int start, boolean []visited){
        visited[start]=true;
        System.out.println(start+" ");
         for(int neighbor : graph.getadjlist()[start]) {
            if(!visited[neighbor]) {
                traverse(graph, neighbor, visited);
            }
        }
    }
}
