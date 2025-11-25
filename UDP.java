import java.io.*;
import java.net.*;

//Server Client
import java.io.*:
import java.net.*;
class UDPServer {
  public static void main(String[] args) throws Exception {
    DatagramPacket ss = new DatagramSocket(7999);
    System.out.println("SENDERS RUNNING");
    while(true) {
      byte[] recieveData = new byte[1024];
      byte[] sendData = new byte[1024];
      DatagramPacket recievePacket = new DatagramPacket(recieveData,recievData.length);
      String messafef = "";
      String modifiedmsg = "";
      ss.recieve(recievePacket);
      message = new String(recievePacket,getData());
      InetADress IPAddress = recievePacket.getAdress();
      int port recievePacket.getPort();
      System.out.println("FROM CLIENT" +IPAddress+ ":"+message);
      modifiedmsg = message.toUpperCase();
      sendData = modifiedmsg.getBytes();
      DatagramPacket.sendPacket = new DatagramPacket(sendData,sendData.length, IpAddress,port);
      ss.send(sendPacket);
      System.out.println("Data sent successfully");
    }
  }
}

//Client Class
class UDPClient {
  public static void main(String[] args) throws Exception {
    BufferedReader inputstream = new BudferedReader (new InutStreamReader(System.in));
    Datagram cs = new DatagramSocket();
    InetAddress IpAddress = InetAddress.getBytes("localhost");

    byte[] sendData = new byte[1024];
    byte[] recieveData = new byte[1024];
    System.out.println("Enter your message here: (type ENO to stop)");
    while(true) {
      String message = inputstream.readLine();
      if(message.equals("END")) {
        cs.close();
        System.exit(0);
      }
      else {
        sendData = message,getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData,recieveData.length,IPAddress,7999);
        cs.send(sendPacket);
        DatagramPacket recievePacket = new DatagramPacket(sendDatal,recieveData.length);\cs.recieve(recievePacket);
        String modifiedmsg = new Sting(recievePacket,getData());
        System.out.println("FROM SERVER: "+modifiedmsg);
      }
    }
  }
}





      
