/**Name: Dhvani Uday Parekh
 * AIML-B3
 * 21070126126
 */

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // Start the thread
        
        // Wait for the thread to finish
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
        
        // Check if thread is alive
        if (t.isAlive()) {
            System.out.println("Thread is still running!");
        } else {
            System.out.println("Thread has finished.");
        }
    }
}
