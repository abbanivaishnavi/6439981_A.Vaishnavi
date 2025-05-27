// Thread by extending Thread class
class MessageThread extends Thread {
    private String message;

    public MessageThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - count " + i);
            try {
                Thread.sleep(500); // Pause for 500ms for clearer output
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class que26_ThreadDemo {
    public static void main(String[] args) {
        // Create two threads with different messages
        MessageThread thread1 = new MessageThread("Thread 1 running");
        MessageThread thread2 = new MessageThread("Thread 2 running");

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
