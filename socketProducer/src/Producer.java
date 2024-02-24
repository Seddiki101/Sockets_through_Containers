import java.io.OutputStream;
import java.net.Socket;

public class Producer {
    private String address;
    private int port;

    public Producer(String address, int port) {
        this.address = address;
        this.port = port;
    }

    public void send(String message) {
        try {
            Socket socket = new Socket(address, port);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(message.getBytes());
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
