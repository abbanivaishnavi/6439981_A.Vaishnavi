import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Server is listening on port 12345...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        String clientMessage, serverMessage;

        while (true) {
            clientMessage = in.readLine();
            if (clientMessage.equalsIgnoreCase("exit")) break;
            System.out.println("Client: " + clientMessage);

            System.out.print("You: ");
            serverMessage = userInput.readLine();
            out.println(serverMessage);
        }

        socket.close();
        serverSocket.close();
    }
}
