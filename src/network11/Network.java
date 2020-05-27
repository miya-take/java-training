package network11;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.InputMismatchException;

public class Network {
    public static void main(String[] args) {
        URL url = new URL("https://dokojava.jp/");
        InputStream is = url.openSteram();
        InputStreamReader irs = new InputStreamReader(is);
        int i = irs.read();
        while (i != -1) {
            System.out.print((char) i);
            i = irs.read();
        }
        irs.close();
        Socket

    }
}
