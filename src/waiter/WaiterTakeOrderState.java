package waiter;

import baseClass.BaseState;

public class WaiterTakeOrderState implements BaseState<WaiterState> {
    public WaiterTakeOrderState() {
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
        return WaiterState.TAKE_ORDER;
    }
}
