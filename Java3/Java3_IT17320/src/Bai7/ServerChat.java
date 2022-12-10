
package Bai7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerChat {

    public static void main(String[] args) {
//        1.Open socketserver 9999
//        2.while(true)
//            2.1 accept client connect to 9999
//            2.2 read data from data

        try {

            ServerSocket serverSoket = new ServerSocket(9999);
            while (true) {
                //2.1 accept client connect to 9999
                Socket clientSocket = serverSoket.accept();

                //2.2 read data from data
                InputStream inputStream = clientSocket.getInputStream();
                InputStreamReader readerInput = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(readerInput);

                String lineMessage = bufferedReader.readLine();
                System.out.println(lineMessage);
                
                //2.3reply client
                OutputStream clientOutput = clientSocket.getOutputStream();
                clientOutput.write("OK".getBytes());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //2.while
    }

}
