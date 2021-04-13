package data;

public final class EngineGenerator {

    private static final Engine DEFAULT_ENGINE = new RandomPowerEngine();

    private EngineGenerator() {
    }

    public static Engine ofDefault() {
        return DEFAULT_ENGINE;
    }
}
