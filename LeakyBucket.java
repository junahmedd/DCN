import java.util.*;

public class LeakyBucket
  {
    public static flow(int pktsize, int output)
    {
      int bucketsize = 512;
      if(pktsize > bucketsize)
      {
        System.out.println("Bucket overflow");
      }
      else {
        try {
          Thread.sleep(10000);
          while(pktsize > output)
            {
              System.out.println(output+"bytes overflow");
              pktsize = pktsize - output;
            }
          if(pktsize > 0)
          {
            System.out.println(pktsize+" bytes outflow");
          }
        }
        catch(InterruptedException e)
          {
            System.out.println("Interrupted!");
          }
      }
    }

    public static void main(String[] args)
    {
      int output, pktsize, n;
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Enter output rate");
      output = sc.nextInt();
      System.out.println("Enter no of packets");
      n = sc.nextInt();
      for (int i =0; i <= n; i++)
        {
          pktsize = eand.nextInt(1000);
          System.out.println("Packet no. "+ i+" packetsize = "+pktsize);
          flow(pktsize,output);
        }
    }
  }

    
