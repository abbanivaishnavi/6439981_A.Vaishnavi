import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to server!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        String serverMessage, clientMessage;

        while (true) {
            System.out.print("You: ");
            clientMessage = userInput.readLine();
            out.println(clientMessage);

            if (clientMessage.equalsIgnoreCase("exit")) break;

            serverMessage = in.readLine();
            System.out.println("Server: " + serverMessage);
        }

        socket.close();
    }
}
