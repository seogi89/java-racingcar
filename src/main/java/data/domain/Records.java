package data.domain;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Records {

    private final List<Record> elements;

    public Records(List<Record> records) {
        this.elements = records;
    }

    public List<Record> findAllWinners() {
        Record any = findAnyWinner();
        return elements.stream()
            .filter(record -> record.isSamePosition(any))
            .collect(Collectors.toUnmodifiableList());
    }

    private Record findAnyWinner() {
        return elements.stream()
            .max(Comparator.naturalOrder())
            .orElseThrow(IllegalArgumentException::new);
    }

    public Stream<Record> stream() {
        return elements.stream();
    }
}
