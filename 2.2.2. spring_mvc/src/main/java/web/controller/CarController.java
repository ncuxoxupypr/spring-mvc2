package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCarList(@RequestParam(value = "count", defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("cars", new CarServiceImp().listCar(count));
        return "cars";
    }
}
