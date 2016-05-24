package mn.misc.hibernate.sandbox.controller;


import mn.misc.hibernate.sandbox.model.Customer;
import mn.misc.hibernate.sandbox.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    CustomerService customerService;

    @RequestMapping({"/"})
    public String index(ModelMap modelMap) {
        List<Customer> customers = customerService.findAllCustomers();
        modelMap.addAttribute("customers", customers);
        return "index";
    }

}
