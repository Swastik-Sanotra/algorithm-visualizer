public class main {

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addedge(0, 1);
        graph.addedge(0, 2);
        graph.addedge(1, 3);
        graph.addedge(2, 4);

        System.out.println("BFS Traversal:");
        BFS.traverse(graph, 0);

        System.out.println("\n");

        System.out.println("DFS Traversal:");

        boolean[] visited = new boolean[graph.getVertices()];

        DFS.traverse(graph, 0, visited);
    }
}
