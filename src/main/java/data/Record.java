package data;

public class Record implements Comparable<Record> {

    private final String name;
    private final int position;

    public Record(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public boolean same(Record other) {
        return this.position == other.position;

    }

    @Override
    public int compareTo(Record other) {
        return this.position - other.position;
    }
}
