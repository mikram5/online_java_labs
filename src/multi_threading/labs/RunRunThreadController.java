package multi_threading.labs;

public class RunRunThreadController {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        RunRunThread thread1 = new RunRunThread("RunRun number one");
        RunRunThread thread2 = new RunRunThread("RunRun number two");

        System.out.println("Main thread ending.");
    }
}
