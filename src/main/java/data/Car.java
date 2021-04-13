package data;

public class Car {

    private static final int THRESHOLD = 4;

    private final Engine engine;
    private final Name name;
    private int position;

    public Car(String name) {
        this(new Name(name));
    }

    public Car(String name, Engine engine) {
        this(new Name(name), engine);
    }

    public Car(Name name) {
        this(name, EngineGenerator.ofDefault());
    }

    public Car(Name name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public Record move() {
        if (engine.get() >= THRESHOLD) {
            position++;
        }
        return new Record(this.name.getName(), this.position);
    }


}
