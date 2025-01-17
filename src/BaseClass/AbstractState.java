package BaseClass;

public abstract interface AbstractState<State extends Enum<State>> {
    void enterState();
    void exitState();
    void updateState();
    State getNextState();
}
