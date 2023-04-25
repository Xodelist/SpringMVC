package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.List;

@Controller
@RequestMapping("/cars")

public class CarController {

    @GetMapping
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        Car car1 = new Car("Tesla "," X ",2015);
        Car car2 = new Car("Lada "," Granta ",2020);
        Car car3 = new Car("DeLorean "," DMC-12 ",1981);
        Car car4 = new Car("Tesla "," S ",2021);
        Car car5 = new Car("Lada "," Kalina ",2010);
        Car car6 = new Car("DeLorean "," DMC-12 ",1981);
        List<Car> cars = List.of(car1,car2,car3,car4,car5,car6);
        model.addAttribute("count",count);
        model.addAttribute("cars",cars);
        if (count != null) {
            model.addAttribute("carLimit",cars.stream().limit(count).toList());
        }
        return "cars";
    }


}
