package Restaurant;

import baseClass.Entity;

public class Relationship {
    protected Entity from;
    protected Entity to;

    public Relationship(Entity from, Entity to){
        this.from = from;
        this.to = to;
    }
}
