public class App {
    public static void main(String[] args) {

        String address = "receiver";
        int port = 5555;

        Consumer consumer = new Consumer(address, port);

        System.out.println("Listening for messages...");
        String receivedMessage = consumer.listen();

        System.out.println("Received message: " + receivedMessage);
    }
}
