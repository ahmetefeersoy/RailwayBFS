import java.util.LinkedList;
import java.util.Queue;

public class BFS
{
    private boolean[] marked;
    private int[] edgeTo;
    public int[] distTo;


    public BFS(Graph g , int home) {
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
        distTo = new int[g.V()];
        bfs(g,home);
    }

    private void bfs(Graph G,int home) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(home);
        marked[home] = true;
        distTo[home] = 0;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    q.offer(w);
                    marked[w] = true;
                    edgeTo[w] = v;
                    distTo[w] = distTo[v] + 1;
                }
            }
        }
    }
}