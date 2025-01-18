package waiter;

import baseClass.StateMachine;
import baseClass.ThreadMachine;

public class WaiterStateMachine extends StateMachine implements Runnable, ThreadMachine {
    private final Waiter waiter;
    private Thread waiterThread;

    public WaiterStateMachine() {
        waiter = new Waiter();
        fillStateMap();

        start();

        startThread();
    }

    @Override
    protected void fillStateMap() {

    }

    @Override
    public void run() {
        try {
            update();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean startThread() {
        try {
            waiterThread = new Thread(this);
            waiterThread.start();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public void start() {

    }

    @Override
    public void update() throws InterruptedException {
        while (true){
            Thread.sleep(1000);

        }
    }

    public Waiter getWaiter() {
        return waiter;
    }
}
