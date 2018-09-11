package multi_threading.labs;

public class RunRunController {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
//        RunRun thread1 = new RunRun("RunRun number one");
//        RunRun thread2 = new RunRun("RunRun number two");
        RunRun test1 = new RunRun();
        Thread thread = new Thread(test1, "test1 Thread");
        thread.start();
        System.out.println("Main thread ending.");
    }
}
