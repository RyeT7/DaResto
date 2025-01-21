package waiter;

import baseClass.BaseState;

public class WaiterServingFoodState implements BaseState<WaiterState> {
    public WaiterServingFoodState() {
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
        return WaiterState.SERVING_FOOD;
    }
}
