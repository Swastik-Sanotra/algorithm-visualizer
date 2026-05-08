
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void traverse (Graph graph,int start){
        boolean [] visited = new boolean[graph.getVertices()];
        Queue<Integer>queue = new LinkedList<>();

        visited[start]=true;
        queue.add(start);

        while (!queue.isEmpty()){
            int digit = queue.poll();
            System.out.println(digit+" ");

            for (edge Edge : graph.getadjlist()[digit]){
                int neighbour = Edge.destination;
                if (!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.add(neighbour);
                }
            }
        }  
    }
}
