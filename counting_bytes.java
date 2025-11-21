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
  
  
