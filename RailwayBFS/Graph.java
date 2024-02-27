import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    static int count;
    private final int V;
    private Bag <Integer>[] adj;
    public Graph(int V)
    {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++)
            adj[v] = new Bag<Integer>();
    }
    public void addEdge(int v, int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }

  public int addNewEdge(int v,Graph G,int tedu,int home, LinkedList<Integer> array){
        Graph tempG = new Graph(G.V());
        tempG=G;

        Bag<Integer> bag = adj[v];

            for(int i =0;i<G.V();i++){
                BFS k = new BFS(G,home-1);
              int distanceN,distanceO;
              distanceO= k.distTo[tedu-1];
                if(v!=i&&!bag.contains(i)){
                    tempG.addEdge(v,i);
                    BFS k1 = new BFS(tempG,home-1);
                    distanceN=k1.distTo[tedu-1];
                    if(distanceN>=distanceO){

                        G.addEdge(v,i);
                        array.add(v+1);
                        array.add(i+1);
                    //  System.out.println((v+1)+" "+(i+1));

                    }



                }

            }

            return 0;
      }

    public Iterable<Integer> adj(int v)
    { return adj[v]; }
    public static int degree(Graph G, int v)
    {
        int degree = 0;
        for (int w : G.adj(v))
            degree++;
        return degree;
    }

    public int V(){
        return this.V;
    }
}
