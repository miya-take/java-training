package network11;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerSckt {
     public static void main(String[] args) throws Exception{
         System.out.println("起動完了");
         // 待ち受けポート
         ServerSocket svSocket = new ServerSocket(39486);
         // 作成されると、誰から接続されるまで待ち続ける
         Socket sck = svSocket.accept();
         System.out.println(sck.getInetAddress() + "から接続されます");
         sck.getOutputStream().write("WELCOME".getBytes());
         sck.getOutputStream().flush();
         sck.close();

     }
}
