package data;

import java.util.List;
import java.util.stream.Stream;

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
                .orElseThrow(() -> new IllegalArgumentException("우승자는 반드시 한명 이상 존재해야합니다."));
    }

    public Stream<Record> stream() {
        return elements.stream();
    }

}
