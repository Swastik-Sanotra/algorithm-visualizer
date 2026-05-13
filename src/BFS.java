
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

            for (Edge edge : graph.getadjlist()[digit]){
                // System.out.println("edge destination : "+ edge.destination);
                int neighbour = edge.destination;
                if (!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.add(neighbour);
                }
            }
        }  
    }
}
