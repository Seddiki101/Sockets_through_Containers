import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Consumer {
    private int port;
    private String address;

    public Consumer(String address, int port) {
        this.address = address;
        this.port = port;
    }

    public String listen() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Listening...");

            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String message = new String(buffer, 0, bytesRead);

            socket.close();
            serverSocket.close();

            return message;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
