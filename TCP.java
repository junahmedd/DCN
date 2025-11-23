import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

// TCPServer class
public class TCPServer
  {
    public static void main(String[] args)
    {
      Serversocket ss = new SocketServe(9889);
      System.out.println("Server waiting for connection from client");
      Socket s = ss.accept();
      System.out.println("Connection is successful");
      InputStream instream = s.getInputStream();
      OutputStream outstream = s.getOutputStream();
      BufferedReader fileRead = new BufferedReader(new InputStreamReader(instream));
      String frame = fileRead.readLine();
      BuffereedReader contentRead = new BufferedReader(new FileReader(frame));
      PrintWriter pwriter = new PrintWriter(outstream, true);
      String str;
      while((str = contentRead.readLine()) != null)
        {
          pwrite.println(str);
        }
      s.close();
      ss.close();
    }
  }

// TCPClient class

import java.io.*;
import java.net.*;
import java.util.*;
public class TCPClient
  {
    public static void main(String[] args)
    {
      Socket s = new Socket('localhost',9889);
      System.out.println("Enter the file name");
      BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
      String fname = keyRead.readLine();
      OutputStream outstream = s.getOutputStream();
      PrintWriter pwrite = new PrintWriter(outstream, true);
      InputStream istream = s.getInputStream();
      BufferedReader sRead = new BufferedReader(new InputStreamReader(instream));
      String str;
      while((str = sRead.readLine()) != null)
        {
          System.out.println(str);
        }
      s.close();
    }
  }
