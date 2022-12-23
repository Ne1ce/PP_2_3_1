package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW M", "Germany", 3));
        cars.add(new Car("Fiat", "Italy", 500));
        cars.add(new Car("Porsche", "Germany", 911));
        cars.add(new Car("TOYOTA RAV", "Japan", 4));
        cars.add(new Car("BMW X", "Germany", 6));
    }

    public List<Car> getCars(Long howMany) {
        if (howMany == null) {
            howMany = 5L;
        }
        return cars.stream().limit(howMany).toList();
    }
}
