package hw7;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph(10);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(2, 6);
        graph.addEdge(6, 7);
        graph.addEdge(5, 7);
        graph.addEdge(5, 8);
        graph.addEdge(8, 9);


        BreadsFirstPath bfp = new BreadsFirstPath(graph, 0);

        System.out.println("Кратчайший путь из 0 в 9: " + bfp.pathTo(9));
        System.out.println("Расстояние: " + bfp.pathTo(9).size());

    }
}
