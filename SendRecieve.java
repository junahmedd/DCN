import java.io.*;
import java.util.*;
import java.net.*;
// Sender class
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

// Reciever class

import java.io.*;
import java.net.*;
import java.util.*;

public class Reciever {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter no of frames to be recieved" );
    int n = sc.nextInt();
    try 
      {
        ServerSocket ss = new ServerSocket(6879);
        Socket s = s.accept();
        DataInputStream datain = mew DataInputStream(s.getInputStream());
        String finaldata = new String();
        finaldata = " ";
        for(int i = 0; i < n; i++)
          {
            String data = datain.readUTF();
            System.out.println("Frames Recieved...Successfully!!");
            System.out.println("Recieved frame is: "+ data);
            finaldata = finaldata.concat(data);
          }
        System.out.println("Recieved data is: "+finaldata);
        ss.close();
    }
    catch (Exception e)
      {
        System.out.println(e);
      }
  }
}
  
  


