import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		// when using local app set address to 127.0.0.1 
		//but because we created a docker network
        String address = "receiver";
        int port = 5555;

        Producer producer = new Producer(address, port);

        System.out.print("Enter message to send: ");
        String message = scanner.next();

        producer.send(message);

        scanner.close();
    }
}
