package data;

import java.util.Objects;

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
        return other.position - this.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return position == record.position &&
                Objects.equals(name, record.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
