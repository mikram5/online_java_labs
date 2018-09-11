package multi_threading.labs;

public class RunRunThread extends Thread {

    RunRunThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int count = 0; count < 8; count++) {
                Thread.sleep(100);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " terminating.");
    }
}



