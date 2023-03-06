package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Skoda", "v4"));
        cars.add(new Car(2, "Volkswagen", "V5"));
        cars.add(new Car(3, "Lada", "v6"));
        cars.add(new Car(4, "Reno", "V7"));
        cars.add(new Car(5, "Toyota", "v8"));
    }

    public List<Car> getCars(int count) {
        if (count < 5) {
            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }
}

