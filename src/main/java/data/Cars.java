package data;

import java.util.List;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class Cars {

    private final List<Car> elements;

    public Cars(List<Car> elements) {
        this.elements = elements;
    }

    public Records move() {
        return elements.stream()
                .map(Car::move)
                .collect(collectingAndThen(toList(), Records::new));
    }
}
