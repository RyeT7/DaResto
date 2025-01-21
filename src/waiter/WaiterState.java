package waiter;

public enum WaiterState {
    IDLE("idle"),
    TAKE_ORDER("take order"),
    WAIT_COOK("wait cook"),
    BRING_ORDER("bring order"),
    SERVING_FOOD("serving food");

    public final String label;

    WaiterState(String label){
        this.label = label;
    }
}
