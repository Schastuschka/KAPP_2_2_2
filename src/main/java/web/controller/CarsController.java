package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarInterface;




@Controller
public class CarsController {
    private final CarInterface carService;


    @Autowired
    public CarsController(CarInterface carService) {
        this.carService = carService;
    }

    @GetMapping( "/cars")
    public String printAllCar(@RequestParam(defaultValue = "5") Integer count, Model model) {
            model.addAttribute("cars", carService.getCarsList(count));
        return "cars";
    }
}
