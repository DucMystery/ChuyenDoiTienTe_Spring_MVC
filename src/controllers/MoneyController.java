package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyController {

    @GetMapping("/display")
    public String getMoney(@RequestParam int money, Model model){
        int money1 =money*22000;
        model.addAttribute("rs",money1);

        return "money";
    }
}
