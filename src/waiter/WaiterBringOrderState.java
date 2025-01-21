package waiter;

import baseClass.BaseState;

public class WaiterBringOrderState implements BaseState<WaiterState> {
    public WaiterBringOrderState() {
    }

    @Override
    public void enterState() {

    }

    @Override
    public void exitState() {

    }

    @Override
    public void updateState() {

    }

    @Override
    public WaiterState getNextState() {
        return null;
    }

    @Override
    public WaiterState getKey() {
        return WaiterState.BRING_ORDER;
    }
}
