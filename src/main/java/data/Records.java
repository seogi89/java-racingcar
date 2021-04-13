package data;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Records {

    private final List<Record> elements;

    public Records(List<Record> elements) {
        this.elements = elements;
    }

    public List<String> findWinners() {
        Record any = findAnyWinner();
        return elements.stream()
                .filter(it -> it.same(any))
                .map(Record::getName)
                .collect(toList());
    }

    private Record findAnyWinner() {
        return elements.stream()
                .sorted()
                .findFirst()
                .orElseThrow();
    }
}
