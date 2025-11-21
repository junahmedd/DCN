import java.io.*;
import java.net.*:
import java.util.*;

public class BitStuffing
  {
    public static void main(String[] args)
    {
      try
        {
          ServerSocket ss = new ServerSocket(6879);
          Socket s = s.accept();
          DataInputStream datain = new DataInputStream(s.getInputStream());
          String str = datain.readUTF();
          System.out.println("Stuffed data from client: "+str);
          System.out.println("Unstuffed data: ");
          int count = 0;
          for(int i = 0; i < str.length() - 8; i++)
            {
              char ch = str.charAt(i);
              if(ch == '1')
              {
                count++;
                System.out.println(ch);
                if(count == 5)
                {
                  i++;
                  count++;
                }
                else 
                {
                  System.out.prinltn(ch);
                  count = 0;
                }
              }
              System.out.println();
              ss.close();
            }
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
    }
  }
