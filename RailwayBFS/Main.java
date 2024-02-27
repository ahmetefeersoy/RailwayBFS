
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int station_number = sc.nextInt();
        Graph railwayGraph = new Graph(station_number);
        int railway_number = sc.nextInt();
        int home = sc.nextInt();
        int tedu = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        int count;

        for(int i =0;i<railway_number;i++){
            System.out.println("Bir sonraki edge yaz");
            int v ,w;
            v = sc.nextInt();
            w = sc.nextInt();
            railwayGraph.addEdge(v-1,w-1);
        }

        for(int v=0;v<station_number;v++)
      railwayGraph.addNewEdge(v,railwayGraph,tedu,home,list);

        count=list.size();
        System.out.println(list.size()/2);


            while(!list.isEmpty())
            System.out.println(list.removeFirst()+" "+list.removeFirst());

    }

}