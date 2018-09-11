package multi_threading.labs;

public class RunRun implements Runnable {

    //Thread thread;

//    public RunRun(String name) {
//        thread = new Thread(this, name);
//        //setting priority for Ex_03
//        thread.setPriority(8);
//        thread.start();
//    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting.");
        try {
            for (int count = 0; count < 8; count++) {
                Thread.sleep(100);
                System.out.println("In " + Thread.currentThread().getName() + ", count is "
                        + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " ending.");
    }
}
