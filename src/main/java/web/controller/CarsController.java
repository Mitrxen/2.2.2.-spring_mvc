package web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import web.service.CarService;
import web.service.CarServiceImpl;


@Controller
public class CarsController {
	@GetMapping(value = "/cars")
	public String printCars(ModelMap model, HttpServletRequest request) {
		
		CarService carService = new CarServiceImpl();
		model.addAttribute("cars", carService.getCars(request.getParameter("count")));
		return "cars";
	}
}
