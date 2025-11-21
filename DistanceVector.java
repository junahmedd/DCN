import java.util.Scanner;
public class DistanceVectorRouting {
  static class Node 
  {
    int[] dist = new int[20];
    int[] from = new int[20];
  }
  public static void main(String[] args)
  {
    int[][] dmat = new int[20][20];
    Node[] rt = new Node[10];
    int count = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of nodes: ");
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++)
      {
        rt[i] = new Node();
        for (int j = 1; j <= n; j++)
          {
            System.out.println("Enter the cost between node %d and node %d: ", i,j);
            dmat[i][j] = sc.nextInt();
            dmat[i][i] = 0;
            rt[i].dist[j] = dmat[i][j];
            rt[i].from[j] = j;
          }
      }
    do {
      for(int i = 1; i <= n; i++)
        {
          for(int j = 1; j <= n; j++)
            {
              for(int k = 1; k <= n; k++)
                {
                  if(rt[i].dist[j] > dmat[i][k] + rt[k].dist[j];)
                  {
                    rt[i].dist[j] = rt[i].dist[k] + rt[k].dist[j];
                    rt[i].from[j] = k;
                  }
                }
            }
        }
      count++;
    }while(count < n);
    for(int i =1; i <=n; i++)
      {
        System.out.println("\nDistance Table for router %c is \n",(char)(i+64));
        for(int j = 1; j <= n; j++)
          {
            System.out.println("\t Node %c Via %c, Distance: %d\n",(char)(i+64), (char)(rt[i].from[j]+64),rt[i].dist[j]);
          }
      }
    sc.close();
  }
}
