import java.io.*;
import java.util.*;
import java.net.*;

public class Sender
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of frames to be sent: \n");
      int n = sc.nextInt();
      try 
        {
          Socket s = new Socket("localhost",6879);
          DataOutputStream dataout = new DataOutputStream(s.getOutputStream());
          for (int i = 0; i < n; i++)
            {
              System.outprintln("Enter the frames to be sent: ");
              String data = sc.nextInt();
              int framelen = data.length();
              System.out.println("Sending frames"+ data +"with"+ framelen +"bytes");
              dataout.writeUTF(data);
              dataout.flush();
            }
          dataout.close();
          s.close();
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
    }
  }
