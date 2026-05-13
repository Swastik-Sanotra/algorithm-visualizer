import java.util.*;
public class Dijkstra{
    public static void shortestpath(Graph graph,int source){
        int vertices = graph.getVertices();
        int[] distance = new int[vertices];
        Arrays.fill(distance,Integer.MAX_VALUE);

        distance[source]=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(a -> distance[a]));

        pq.add(source);
        while(!pq.isEmpty()){
            int current = pq.poll();

            for(Edge edge : graph.getadjlist()[current]) {
                int neighbour = edge.destination;
                int weight= edge.weight;

                 if(distance[current] + weight < distance[neighbour]) {

                    distance[neighbour] = distance[current] + weight;
                    pq.add(neighbour);
                }
            }
        }
        System.out.println("\nShortest distances from source "+source + ":");
        for(int i = 0; i < vertices; i++) {
            System.out.println("To "+ i +" -> " + distance[i]);
        }
        
    }
}
