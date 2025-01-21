package baseClass;

public abstract interface BaseState<State extends Enum<State>> {
    void enterState();
    void exitState();
    void updateState();
    State getNextState();
    State getKey();
}
