import java.io.*;
import java.net.*:
import java.util.*;

// Server class
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

//Client class

public class BitStuffing
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      try
        {
          Socket s = new Socket("localhost",6879);
          DataInputStream datain = new DataInputStream(s.getInputStream());
          String str = datain.readUTF();
          System.out.println("Enter data: ");
          String data = sc.nextLine();
          
          String str = "";
          int count = 0;
          for(int i = 0; i < data.length() - 8; i++)
            {
              char ch = data.charAt(i);
              if(ch == '1')
              {
                count++;
                if(count < 5)
                {
                 str += ch;
                }
                else 
                {
                  str = str + ch + '0';
                  count = 0;
                }
              }
              else
              {
                str = str += ch;
                count = 0;
              }
            }
          System.out.println("Flag is: 011111110");
          str = "01111110" + str + "01111110";
          System.oout.println("Data stuffed in client: "+str);
          System.out.println("Sending to server for understuffing");
          dataout.writeUTF(str);
          dataout.flush();
          dataout.close();
          s.close();
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
    }
  }
