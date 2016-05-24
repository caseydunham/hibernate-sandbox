package mn.misc.hibernate.sandbox.controller;

import mn.misc.hibernate.sandbox.model.Customer;
import mn.misc.hibernate.sandbox.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    CustomerService customerService;

    @RequestMapping({"/search"})
    public String index(@RequestParam("q") String q, ModelMap modelMap) {
        List<Customer> customers = customerService.findAllCustomersLike(q);
        modelMap.addAttribute("customers", customers);
        return "search";
    }
}
