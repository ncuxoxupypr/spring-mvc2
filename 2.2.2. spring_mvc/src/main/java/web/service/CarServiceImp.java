package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService{
    @Override
    public List<Car> listCar(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 525, "white"));
        cars.add(new Car("VAZ", 2110, "black"));
        cars.add(new Car("GAZ", 2410, "grey"));
        cars.add(new Car("BMW", 750, "red"));
        cars.add(new Car("Mazda", 7, "yellow"));
        List<Car> cars1 = cars.stream().limit(count).collect(Collectors.toList());
        return count == 0 ? cars:cars1;
    }
}
