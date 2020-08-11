package hw7;

public class DepthFirstPath extends Path {


    public DepthFirstPath(Graph g, int source){
        super(g, source);

        search(g, source);
    }

    @Override
    protected void search(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                search(g, w);
            }
        }
    }
}
