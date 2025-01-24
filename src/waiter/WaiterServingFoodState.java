package waiter;

import baseClass.BaseState;

public class WaiterServingFoodState implements BaseState<WaiterStates> {
    private final WaiterStateMachine waiterStateMachine;

    public WaiterServingFoodState(WaiterStateMachine waiterStateMachine) {
        this.waiterStateMachine = waiterStateMachine;
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
    public WaiterStates getNextState() {
        return null;
    }

    @Override
    public WaiterStates getKey() {
        return WaiterStates.SERVING_FOOD;
    }
}
