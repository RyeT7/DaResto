package customer;

public enum CustomerStates {
    ORDER("order"),
    ORDER_WAITER("order"),
    WAIT_FOOD("wait"),
    WAIT_FOOD_CHEF("wait"),
    WAIT_FOOD_WAITER("wait"),
    EAT("eat");

    public final String label;

    CustomerStates(String label){
        this.label = label;
    }
}
