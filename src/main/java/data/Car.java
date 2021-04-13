package data;

public class Car {

    private static final int THRESHOLD = 4;

    private final Engine engine;
    private int position;

    public Car() {
        this(EngineGenerator.ofDefault());
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public int move() {
        if (engine.get() >= THRESHOLD) {
            position++;
        }
        return position;
    }


}
