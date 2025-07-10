package PracticeSet.atlaslearnings.day15;

 class Graph {

    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    int vertex;
    int edge;
    Edge[] edges;

    Graph(int vertex, int edge) {
        this.vertex = vertex;
        this.edge = edge;
        edges = new Edge[edge];
    }

    public static void main(String[] args) {
        int vertex = 5;
        int edge = 8;

        Graph graph = new Graph(vertex, edge);

        graph.edges[0] = new Edge(1, 2);
        graph.edges[1] = new Edge(1, 3);
        graph.edges[2] = new Edge(1, 4);
        graph.edges[3] = new Edge(2, 4);
        graph.edges[4] = new Edge(2, 5);
        graph.edges[5] = new Edge(3, 4);
        graph.edges[6] = new Edge(3, 5);
        graph.edges[7] = new Edge(4, 5);

        System.out.println("Graph Edges:");
        for (int i = 0; i < edge; i++) {
            System.out.println(graph.edges[i].src + " - " + graph.edges[i].dest);
        }
    }
}
