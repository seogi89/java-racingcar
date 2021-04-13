package data;

import java.util.List;

public class RepeatPowerEngine implements Engine {

    private final List<Integer> pool;
    private int idx = 0;

    public RepeatPowerEngine(List<Integer> pool) {
        this.pool = pool;
    }

    @Override
    public int get() {
        return pool.get(idx++ % pool.size());
    }
}
