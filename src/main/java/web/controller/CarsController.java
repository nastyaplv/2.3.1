package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;


@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarDAO carDAO;

    @Autowired
    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        //Получим весь список машин из DAO и передадим на отображение в представление
        model.addAttribute("cars",carDAO.getCars(count));
        return "cars";
    }
}
