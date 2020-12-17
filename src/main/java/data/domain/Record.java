package data.domain;

import java.util.Objects;

public class Record implements Comparable<Record> {

    private final String name;
    private final int position;

    private Record(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public static Record of(String name, int position) {
        return new Record(name, position);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public boolean isSamePosition(Record other) {
        return this.position == other.position;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Record)) {
            return false;
        }
        Record record = (Record) o;
        return getPosition() == record.getPosition() &&
            Objects.equals(getName(), record.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPosition());
    }

    @Override
    public int compareTo(Record o) {
        return this.position - o.position;
    }
}
