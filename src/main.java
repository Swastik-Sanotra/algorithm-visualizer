import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number of vertices: ");
        int vertices = sc.nextInt();

        Graph graph = new Graph(vertices);
        System.out.println("enter number of edges: ");
        int edges = sc.nextInt();

        System.out.println("enter edges (source destination and weight ) ");

        for(int i =0;i<edges;i++){
            int source = sc.nextInt();
            int destination=sc.nextInt();
            int weight = sc.nextInt();
            graph.addedge(source, destination,weight);
        }

        System.out.println("BFS Traversal:");
        BFS.traverse(graph, 0);

        System.out.println("\n");

        System.out.println("DFS Traversal:");

        boolean[] visited = new boolean[graph.getVertices()];

        DFS.traverse(graph, 0, visited);
    }
}
