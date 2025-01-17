package customer;

import BaseClass.ThreadMachine;

public class CustomerStateMachine implements Runnable, ThreadMachine {
    private Customer customer;
    private Thread customerThread;

    public CustomerStateMachine() {
        this.customer = new Customer();
    }

    @Override
    public void run() {
        while (true){

        }
    }

    @Override
    public boolean startThread() {
        try {
            customerThread = new Thread(this);
            customerThread.start();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public Customer getCustomer() {
        return customer;
    }
}
