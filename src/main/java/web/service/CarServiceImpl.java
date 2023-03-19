package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarInterface{

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW",2010,1234.5));
        cars.add(new Car("Audi",2012,2345.6));
        cars.add(new Car("Reno",2014,3456.7));
        cars.add(new Car("Toyota",2016,4567.8));
        cars.add(new Car("Lexus",2018,5678.9));
        return cars;
    }
    public List<Car> getCarsList(Integer count) {
        if (count >0 && count < 5) {
            return getCars().stream().limit(count).collect(Collectors.toList());
        } else {
            return getCars();
        }

    }
}
