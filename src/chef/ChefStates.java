package chef;

public enum ChefStates {
    IDLE("idle"),
    COOK("cook"),
    DONE("done");

    public final String label;

    ChefStates(String label) {
        this.label = label;
    }
}
