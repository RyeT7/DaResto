package baseClass;

public interface ThreadMachine<StateKey extends Enum<StateKey>, State extends BaseState<StateKey>> {
    boolean startThread();
    void start();
    void update() throws InterruptedException;

    default void transitionToNextStateOrContinue(State currentState, State nextState){
        if(!currentState.getKey().equals(nextState.getKey())){
            currentState.exitState();
            currentState = nextState;
            currentState.enterState();
        } else {
            currentState.updateState();
        }
    }
}
