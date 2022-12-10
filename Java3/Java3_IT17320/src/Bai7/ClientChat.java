
package Bai7;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ClientChat {

    public static void main(String[] args) {

        try {
            //1.Create connect server
            Socket clientSocket = new Socket("127.0.0.1", 9999);

            while (true) {
                //2.write data
                OutputStream outputStream = clientSocket.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

                BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
                dataOutputStream.write(scanner.readLine().getBytes());

                //3.Reciver message from server
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                System.out.println(input);
                
                clientSocket.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
